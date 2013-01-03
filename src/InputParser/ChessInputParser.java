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

        if(move.length() == 2)
        {
            currMove = new PawnMove();
            destination.setX(getVal(move.substring(0, 1)));
            destination.setY(getVal(move.substring(1, 2)));
            currMove.setColor(color);

            currMove.setDestination(destination);
        }
        else if(move.length() == 3)
        {
            currMove = getMove(move);

            destination.setX(getVal(move.substring(1, 2)));
            destination.setY(getVal(move.substring(2, 3)));
            currMove.setColor(color);

            currMove.setDestination(destination);
        }
        else if(move.length() == 4)
        {
            currMove = getMove(move.substring(0,0));

            if(currMove == null)
            {
                Position source = new Position();

                currMove = new unKnownMove();

                source.setX(getVal(move.substring(0, 0)));
                source.setY(getVal(move.substring(1, 1)));

                destination.setX(getVal(move.substring(2, 3)));
                destination.setY(getVal(move.substring(3, 4)));
                currMove.setColor(color);
                currMove.setDestination(destination);
                currMove.setSource(source);
            }
            else
            {
                destination.setX(getVal(move.substring(2, 3)));
                destination.setY(getVal(move.substring(3, 4)));
                currMove.setColor(color);
                currMove.setDestination(destination);

                currMove.setPreferedFileLetterNo(getVal(move.substring(1,1)));
            }
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
                        Moves.add(processMove(wMove,"BLACK"));
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
