package Piece.ChessPiece;

import MiscData.Position;
import ReusableContracts.Piece.ChessPiece;

public class Rook extends ChessPiece
{
    public Rook()
    {
        setName("R");
    }

    public boolean move(Position source, Position destination)
    {
        return true;
    }
}
