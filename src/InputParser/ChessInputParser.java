package InputParser;

import MiscData.Position;
import MiscData.parserResult;
import Move.ChessMove.PawnMove;
import Move.ChessMove.unKnownMove;
import ReusableContracts.InputParser;
import ReusableContracts.Move.Move;

import java.util.ArrayList;

public class ChessInputParser extends InputParser
{
    public Move processMove(String move,String color)
    {
        Move currMove = null;
        Position destination = new Position();

        currMove = getMove(move);

        if(move.contains("#"))
        {
            currMove.setCheckmate(true);
            move = move.substring(0,move.length()-1);
        }

        if(move.contains("+"))
        {
            currMove.setCheck(true);
            move = move.substring(0,move.length()-1);
        }

        if(move.contains("="))
        {
            currMove.setPromotion(move.substring(move.length()-1,move.length()));
            move = move.substring(0,move.length()-2);
        }

        destination.setX(getVal(move.substring(move.length()-1, move.length())));
        destination.setY(getVal(move.substring(move.length()-2, move.length()-1)));
        currMove.setColor(color);

        currMove.setDestination(destination);

        move = move.substring(0,move.length()-2);

        if(move.contains("x"))
        {
            currMove.setCapture(true);
            move = move.substring(0,move.length()-1);
        }

        //FileLetterNumber
        if(move.length() > 0)
        {
            currMove.setPreferedFileLetterNo(getVal(move.substring(move.length()-1,move.length())));
        }

        return currMove;
    }

    public parserResult parseInput(String input) //lots of assumptions on the input file like now comments and ... allowed
    {

        String currToken;
        String wMove,bMove;
        parserResult result = new parserResult();
        ArrayList<Move> Moves = new ArrayList<Move>();

        try
        {
            while(input.length() > 0)
            {
                currToken = input.split(" ",2)[0];
                input = input.split(" ",2)[1];

                if(currToken.contains("."))
                {
                    wMove = input.split(" ",2)[0];
                    Moves.add(processMove(wMove,"WHITE"));
                    input = input.split(" ",2)[1];

                    if(input.length() > 0)
                    {
                        bMove = input.split(" ",2)[0];
                        Moves.add(processMove(bMove,"BLACK"));
                        input = input.split(" ",2)[1];
                    }
                }
                //System.out.println(currToken);
            }
        }
        catch(Exception e)
        {

        }

        result.setMoves(Moves);
        result.setResult("");

        return result;
    }

}
