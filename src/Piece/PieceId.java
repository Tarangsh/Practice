package Piece;

public class PieceId
{
    private Character name;
    private Character initialPosition;

    public PieceId()
    {
        name = '_';
        initialPosition = '_';
    }

    public Character getName()
    {
        return name;
    }

    public void setName(Character name)
    {
        this.name = name;
    }

    public Character getInitialPosition()
    {
        return initialPosition;
    }

    public void setInitialPosition(Character initialPosition)
    {
        this.initialPosition = initialPosition;
    }
}
