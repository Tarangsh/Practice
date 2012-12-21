package Piece;

import GameData.Position;

public class Bishop extends Piece
{
    public Bishop()
    {
        setName('B');
    }

    public boolean move(Position source, Position destination)
    {
        return false;
    }
}
