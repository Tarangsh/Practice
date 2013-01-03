package Game;

import Board.ChessBoard;
import InputParser.*;
import ReusableContracts.Game;

public class ChessGame extends Game
{
    public ChessGame()
    {
        gameBoard = new ChessBoard();
        gameBoard.reset();
        InParser = new ChessInputParser();
    }


}
