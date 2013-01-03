package InputParser;

import java.util.ArrayList;

import ReusableContracts.Move.Move;

public class parserResult
{
    private String Result;
    private ArrayList<Move> Moves;

    public parserResult()
    {
        Result = "";
        Moves = new ArrayList<Move>();
    }

    public String getResult()
    {
        return Result;
    }

    public void setResult(String result)
    {
        Result = result;
    }

    public ArrayList<Move> getMoves()
    {
        return Moves;
    }

    public void setMoves(ArrayList<Move> moves)
    {
        Moves = moves;
    }
}
