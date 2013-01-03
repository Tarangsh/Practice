package Game;

import Board.ChessBoard;
import ReusableContracts.Game;

public class ChessGame extends Game
{
    public ChessGame()
    {
        gameBoard = new ChessBoard();
        gameBoard.reset();
    }


}
