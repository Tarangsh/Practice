package Game.ChessGame;

import Board.ChessBoard;
import Game.GameContract.Game;
import GameData.Position;
import Move.Move;
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

            }

        }

        //print Success
        return 1;
    }
}
