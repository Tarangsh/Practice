package ReusableContracts;

import MiscData.Position;
import MiscData.parserResult;
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

            if(currSource == null)
            {
                //print fail
                return 0;
            }
            else
            {
                gameBoard.movePiece(currSource,currMove.getDestination());
                gameBoard.display();
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
