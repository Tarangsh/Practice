package Board;

import Piece.Piece;

public abstract class Board
{
    protected Box[][] Boxes;

    public abstract void reset();

    public boolean isVacant(int i,int j)
    {
        if(Boxes[i][j].isVacant() == true)
            return true;
        else
            return false;
    }

    public Piece getPieceAt(int i,int j)
    {
        return Boxes[i][j].getContent();
    }
}
