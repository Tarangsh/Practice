package Board;

import Piece.Piece;

public class Box
{
    private Piece Content;
    private String Color;

    public Box()
    {
        Content = null;
        Color = "";
    }

    public Piece getContent()
    {
        return Content;
    }

    public String getColor()
    {
        return Color;
    }

    public void setContent(Piece content)
    {
        Content = content;
    }

    public void setColor(String color)
    {
        Color = color;
    }

    public boolean isVacant()
    {
        if(Content == null)
            return true;
        else
            return false;
    }
}
