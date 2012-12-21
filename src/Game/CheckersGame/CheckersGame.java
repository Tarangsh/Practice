package Game.CheckersGame;

import Board.CheckersBoard;
import Game.GameContract.Game;

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
