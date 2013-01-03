package Board;

import GameData.Position;
import ReusableContracts.Board;
import ReusableContracts.Box;

public class CheckersBoard extends Board
{
    public CheckersBoard()
    {
        Boxes = new Box[8][8];
    }

    public void reset()
    {

    }

    @Override
    public void movePiece(Position source, Position destination)
    {

    }
}
