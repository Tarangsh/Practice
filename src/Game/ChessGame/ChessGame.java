package Game.ChessGame;

import Board.ChessBoard;
import Game.GameContract.Game;
import GameData.Move;
import Piece.Piece;

public class ChessGame extends Game
{
    public ChessGame()
    {
        gameBoard = new ChessBoard();
        gameBoard.reset();
    }

    public int play()    //returns 0 on success and the index of failed move on failure
    {
        Move currMove;
        Piece sourcePiece;

        for(int i=0;i<gameMoves.size();i++)
        {
            currMove = gameMoves.get(i);
            sourcePiece = gameBoard.getPieceAt(currMove.source.x,currMove.source.y);

            if(i%2==0)
            {
                if(sourcePiece!=null && sourcePiece.getColor().equals("WHITE"))
                {
                    if(sourcePiece.move(currMove.source,currMove.destination) == false)
                    {
                        return (i+1);
                    }
                }
                else
                {
                    return (i+1);
                }

            }
            else
            {
                if(sourcePiece!=null && sourcePiece.getColor().equals("BLACK"))
                {
                    if(sourcePiece.move(currMove.source,currMove.destination) == false)
                    {
                        return (i+1);
                    }
                }
                else
                {
                    return (i+1);
                }
            }
        }

        return 0;
    }
}
