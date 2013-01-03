package Piece.ChessPiece;

import MiscData.Position;
import ReusableContracts.Piece.ChessPiece;

public class Bishop extends ChessPiece
{
    public Bishop()
    {
        setName("B");
    }

    public boolean move(Position source, Position destination)
    {
        return false;
    }
}
