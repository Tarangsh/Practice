package Game.GameContract;

import Board.Board;
import GameData.Move;
import GameData.Position;
import GameData.StdMove;
import Piece.Piece;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public abstract class Game
{
    protected Board gameBoard;
    protected List<Move> gameMoves;

    public Game()
    {
        gameMoves = new ArrayList<Move>();
    }


    //Please dont look for design in this part, Taken some assumptions to avoid too many possibilities and algorithmic complexity
    public void provideMoves(List<StdMove> Moves)
    {
        Move newMove;
        StdMove currMove;
        for(int i=0;i<Moves.size();i++)
        {
            currMove = Moves.get(i);

            newMove = new Move();
            newMove.source.x = currMove.source.x-1;
            newMove.source.y = Character.getNumericValue(currMove.source.y) - Character.getNumericValue('a');
            gameMoves.add(newMove);
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
