package ReusableContracts;

import MiscData.parserResult;
import Move.ChessMove.*;
import ReusableContracts.Move.Move;

public abstract class InputParser
{
    public abstract parserResult parseInput(String input);

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
            return (new PawnMove());
    }



}
