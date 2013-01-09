package MiscData;

import Piece.Piece;

public class InputConfigData
{
    Position position;
    Piece piece;

    public InputConfigData(Piece iPiece,Position iPos)
    {
        piece = iPiece;
        position = iPos;
    }

    public Position getPosition()
    {
        return position;
    }

    public void setPosition(Position position)
    {
        this.position = position;
    }

    public Piece getPiece()
    {
        return piece;
    }

    public void setPiece(Piece piece)
    {
        this.piece = piece;
    }
}
