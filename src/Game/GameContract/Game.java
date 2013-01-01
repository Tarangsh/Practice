package Game.GameContract;

import Board.Board;
import Move.*;
import InputParser.*;


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
        InParser = new InputParser();
    }

    public void provideMoves(String Input)
    {
        parserResult result = InParser.parseInput(Input);

        if(result != null)
        {
            gameMoves = result.getMoves();
        }
    }

    public abstract int play();

    public void reset()
    {
        if(gameBoard != null)
        {
            gameBoard.reset();
        }
    }

}
