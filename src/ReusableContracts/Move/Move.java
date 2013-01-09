package ReusableContracts.Move;

import MiscData.Enums.ECastling;
import MiscData.Enums.EFileLetter;
import MiscData.Enums.EPieceColor;
import MiscData.Position;
import Board.Board;

public abstract class Move
{
    protected Position source;
    protected Position destination;
    protected EPieceColor color;
    protected EFileLetter fileLetter;
    protected String promotion;

    public Move()
    {
        fileLetter = EFileLetter.u;
        source = null;
        destination = null;
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

    public EPieceColor getColor()
    {
        return color;
    }

    public void setColor(EPieceColor color)
    {
        this.color = color;
    }

    public EFileLetter getFileLetter()
    {
        return fileLetter;
    }

    public void setFileLetter(EFileLetter fileLetter)
    {
        //check for non file letter letters
            this.fileLetter = fileLetter;
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

    public ECastling getCastling()
    {
        return ECastling.NA;
    }

    public void setCastling(ECastling castling)
    {
    }
}
