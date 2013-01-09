package ReusableContracts;

import Board.Board;
import MiscData.Enums.EGameResult;
import MiscData.parserResult;
import ReusableContracts.Move.Move;


import java.util.ArrayList;
import java.lang.String;

public abstract class Game
{
    protected Board gameBoard;
    protected ArrayList<Move> gameMoves;
    protected InputParser InParser;

    public Game()
    {
        gameMoves = new ArrayList<Move>();
    }

    public void provideMoves(String Input, InputParser inputParser)
    {
        InParser = inputParser;
        parserResult result = InParser.parseInput(Input);

        if(result != null)
        {
            gameMoves = result.getMoves();
        }
    }

    public abstract EGameResult play();



    public void reset()
    {
        if(gameBoard != null)
        {
            //gameBoard.reset();
        }
    }

}
