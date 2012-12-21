package Piece;

import GameData.Position;

public class Queen extends Piece
{
    public Queen()
    {
        setName('Q');
    }

    public boolean move(Position source, Position destination)
    {
        return false;
    }
}
