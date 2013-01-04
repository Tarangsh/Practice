package ReusableContracts.Piece;

import MiscData.Position;
import Piece.PieceId;

public abstract class Piece
{
    protected PieceId Pid = new PieceId();
    protected String color;


    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getName()
    {
        return Pid.getName();
    }

    public void setName(String name)
    {
        Pid.setName(name);
    }

    public String getFileLetter()
    {
        return Pid.getFileLetter();
    }

    public void setFileLetter(String initialPosition)
    {
        Pid.setFileLetter(initialPosition);
    }
}
