package Piece;

import GameData.Position;

public class Pawn extends Piece
{
    public Pawn()
    {
        setName('P');
    }

    public boolean move(Position source, Position destination)
    {
        return false;
    }

    public void promote(Position Pos)
    {

    }
}
