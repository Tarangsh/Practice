package Piece;

import GameData.Position;

public class Rook extends Piece
{
    public Rook()
    {
        setName('R');
    }

    public boolean move(Position source, Position destination)
    {
        return true;
    }
}
