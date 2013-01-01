package InputParser;

import GameData.Position;
import Move.*;

import java.util.ArrayList;

public class InputParser
{
    public int getVal(String c)
    {
        if(c.equals("1"))
            return 0;
        else if(c.equals("2"))
            return 1;
        else if(c.equals("3"))
            return 2;
        else if(c.equals("4"))
            return 3;
        else if(c.equals("5"))
            return 4;
        else if(c.equals("6"))
            return 5;
        else if(c.equals("7"))
            return 6;
        else if(c.equals("8"))
            return 7;
        else if(c.equals("a"))
            return 0;
        else if(c.equals("b"))
            return 1;
        else if(c.equals("c"))
            return 2;
        else if(c.equals("d"))
            return 3;
        else if(c.equals("e"))
            return 4;
        else if(c.equals("f"))
            return 5;
        else if(c.equals("g"))
            return 6;
        else if(c.equals("h"))
            return 7;

        return -1;
    }

    public Move getMove(String type)
    {
        if(type.contains("N"))
            return (new KingMove());
        else if(type.contains("R"))
            return (new RookMove());
        else if(type.contains("K"))
            return (new KingMove());
        else if(type.contains("Q"))
            return (new QueenMove());
        else if(type.contains("P"))
            return (new PawnMove());
        else if(type.contains("B"))
            return (new BishopMove());
        else
            return null;
    }

    public Move processMove(String move,String color)
    {
        Move currMove = null;
        Position destination = new Position();

        if(move.length() == 2)
        {
            currMove = new PawnMove();
            destination.setX(getVal(move.substring(0, 0)));
            destination.setY(getVal(move.substring(1, 1)));
            currMove.setColor(color);

            currMove.setDestination(destination);
        }
        else if(move.length() == 3)
        {
            currMove = getMove(move);

            destination.setX(getVal(move.substring(0, 0)));
            destination.setY(getVal(move.substring(1, 1)));
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

                destination.setX(getVal(move.substring(2, 2)));
                destination.setY(getVal(move.substring(3, 3)));
                currMove.setColor(color);
                currMove.setDestination(destination);
                currMove.setSource(source);
            }
            else
            {
                destination.setX(getVal(move.substring(2, 2)));
                destination.setY(getVal(move.substring(3, 3)));
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
