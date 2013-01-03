package Game;

import Board.CheckersBoard;
import ReusableContracts.Game;

public class CheckersGame extends Game {

    public CheckersGame()
    {
        gameBoard = new CheckersBoard();
        gameBoard.reset();
    }

    public int play()
    {
        return 0;
    }
}
