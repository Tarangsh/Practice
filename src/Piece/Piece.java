package Piece;

import GameData.Position;

public abstract class Piece
{
    protected PieceId Pid = new PieceId();
    protected String color;
    public abstract boolean move(Position source,Position destination);

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Character getName()
    {
        return Pid.getName();
    }

    public void setName(Character name)
    {
        Pid.setName(name);
    }

    public Character getInitialPosition()
    {
        return Pid.getInitialPosition();
    }

    public void setInitialPosition(Character initialPosition)
    {
        Pid.setInitialPosition(initialPosition);
    }
}
