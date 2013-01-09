package Piece;

import MiscData.Enums.EPieceColor;
import MiscData.Enums.EPieceName;

public class PieceFactory
{
    public Piece getRook(EPieceColor color)
    {
        Piece rook = new Piece(EPieceName.R,color);
        return rook;
    }

    public Piece getBishop(EPieceColor color)
    {
        Piece bishop = new Piece(EPieceName.B,color);
        return bishop;
    }

    public Piece getKnight(EPieceColor color)
    {
        Piece knight = new Piece(EPieceName.N,color);
        return knight;
    }

    public Piece getQueen(EPieceColor color)
    {
        Piece queen = new Piece(EPieceName.Q,color);
        return queen;
    }

    public Piece getKing(EPieceColor color)
    {
        Piece king = new Piece(EPieceName.K,color);
        return king;
    }

    public Piece getPawn(EPieceColor color)
    {
        Piece pawn = new Piece(EPieceName.P,color);
        return pawn;
    }

    public Piece getCPiece(EPieceColor color)
    {
        Piece cPiece = new Piece(EPieceName.cP,color);
        return cPiece;
    }

    public Piece getCKing(EPieceColor color)
    {
        Piece cKing = new Piece(EPieceName.cK,color);
        return cKing;
    }

}
