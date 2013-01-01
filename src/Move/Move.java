package Move;

import GameData.Position;
import Board.*;

public abstract class Move
{
    protected Position source;
    protected Position destination;
    protected String color;
    protected int preferedFileLetterNo;

    public Move()
    {
        preferedFileLetterNo = -1;
        source = null;
        destination = null;
        color = "";
    }

    public abstract Position checkMove(Board board);

    public Position getSource()
    {
        return source;
    }

    public void setSource(Position source)
    {
        this.source = source;
    }

    public Position getDestination()
    {
        return destination;
    }

    public void setDestination(Position destination)
    {
        this.destination = destination;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getPreferedFileLetterNo()
    {
        return preferedFileLetterNo;
    }

    public void setPreferedFileLetterNo(int preferedFileLetterNo)
    {
        this.preferedFileLetterNo = preferedFileLetterNo;
    }
}
