package ReusableContracts;

import GameData.Position;
import InputParser.*;
import ReusableContracts.Move.Move;
import ReusableContracts.Piece.Piece;


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

    public int play()
    {
        Move currMove;
        Piece sourcePiece;
        Position currSource;

        for(int i=0;i<gameMoves.size();i++)
        {
            currMove = gameMoves.get(i);

            currSource = currMove.checkMove(gameBoard);

            gameBoard.display();

            if(currSource == null)
            {
                //print fail
                return 0;
            }
            else
            {

            }

        }

        //print Success
        return 1;
    }

    public void reset()
    {
        if(gameBoard != null)
        {
            gameBoard.reset();
        }
    }

}