package Piece.ChessPiece;

import MiscData.Position;
import ReusableContracts.Piece.ChessPiece;

public class Knight extends ChessPiece
{
    public Knight()
    {
        setName("N");
    }

    public boolean move(Position source, Position destination)
    {
        return true;
    }
}
