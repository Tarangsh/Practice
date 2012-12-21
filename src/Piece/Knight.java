package Piece;

import GameData.Position;

public class Knight extends Piece
{
    public Knight()
    {
        setName('N');
    }

    public boolean move(Position source, Position destination)
    {
        return true;
    }
}
