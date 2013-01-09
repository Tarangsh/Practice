package Piece;

import MiscData.Enums.EFileLetter;
import MiscData.Enums.EPieceColor;
import MiscData.Enums.EPieceName;

public class Piece
{
    protected EPieceColor color;
    private EPieceName name;
    private EFileLetter fileLetter;

    public Piece()
    {

    }

    public Piece(EPieceName pName,EPieceColor pColor)
    {
        color = pColor;
        name = pName;
    }

    public EPieceColor getColor()
    {
        return color;
    }

    public void setColor(EPieceColor color)
    {
        this.color = color;
    }

    public EPieceName getName()
    {
        return name;
    }

    public EFileLetter getFileLetter()
    {
        return fileLetter;
    }

    public void setFileLetter(EFileLetter fileLetter)
    {
        this.fileLetter = fileLetter;
    }
}
