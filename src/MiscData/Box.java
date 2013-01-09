package MiscData;

import MiscData.Enums.EBoxColor;
import Piece.Piece;

public class Box
{
    private Piece content;
    private EBoxColor color;

    public Box(EBoxColor bColor)
    {
        content = null;
        color = bColor;
    }

    public Piece getContent()
    {
        return content;
    }

    public EBoxColor getColor()
    {
        return color;
    }

    public void setContent(Piece bContent)
    {
        content = bContent;
    }



    public boolean isVacant()
    {
        if(content == null)
            return true;
        else
            return false;
    }
}
