package Piece.ChessPiece;

import GameData.Position;
import ReusableContracts.Piece.ChessPiece;

public class Pawn extends ChessPiece
{
    public Pawn()
    {
        setName("P");
    }

    public boolean move(Position source, Position destination)
    {
        return false;
    }

    public void promote(Position Pos)
    {

    }
}
