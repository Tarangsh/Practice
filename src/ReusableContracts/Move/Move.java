package ReusableContracts.Move;

import MiscData.Position;
import ReusableContracts.Board;

public abstract class Move
{
    protected Position source;
    protected Position destination;
    protected String color;
    protected String FileLetter;
    protected String promotion;

    public Move()
    {
        FileLetter = "_";
        source = null;
        destination = null;
        color = "";
        promotion = "";

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

    public String getFileLetter()
    {
        return FileLetter;
    }

    public void setFileLetter(String fileLetter)
    {
        if(fileLetter.equals("a")||fileLetter.equals("b")||fileLetter.equals("c")||fileLetter.equals("d")||fileLetter.equals("e")||fileLetter.equals("f")||fileLetter.equals("g")||fileLetter.equals("h"))
        {
            this.FileLetter = fileLetter;
        }
    }

    public String getPromotion()
    {
        return promotion;
    }

    public void setPromotion(String promotion)
    {
        this.promotion = promotion;
    }

    public boolean isCapture()
    {
        return false;
    }

    public void setCapture(boolean capture)
    {
    }

    public boolean isCheck()
    {
        return false;
    }

    public void setCheck(boolean check)
    {
    }

    public boolean isCheckmate()
    {
        return false;
    }

    public void setCheckmate(boolean checkmate)
    {
    }

    public boolean isKinging()
    {
        return false;
    }

    public void setKinging(boolean kinging)
    {
    }
}
