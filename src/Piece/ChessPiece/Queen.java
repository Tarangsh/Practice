package Piece.ChessPiece;

import GameData.Position;
import ReusableContracts.Piece.ChessPiece;

public class Queen extends ChessPiece
{
    public Queen()
    {
        setName("Q");
    }

    public boolean move(Position source, Position destination)
    {
        return false;
    }
}
