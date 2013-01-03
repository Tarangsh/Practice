package Piece;

public class PieceId
{
    private String name;
    private String initialPosition;

    public PieceId()
    {
        name = "_";
        initialPosition = "_";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getInitialPosition()
    {
        return initialPosition;
    }

    public void setInitialPosition(String initialPosition)
    {
        this.initialPosition = initialPosition;
    }
}
