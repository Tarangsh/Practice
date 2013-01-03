package ReusableContracts.Move;

public abstract class ChessMove extends Move
{
    protected String promotion;
    protected boolean capture;
    protected boolean check;
    protected boolean checkmate;

    public ChessMove()
    {
        promotion="_";
        capture = false;
        check = false;
        checkmate = false;
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
        return capture;
    }

    public void setCapture(boolean capture)
    {
        this.capture = capture;
    }

    public boolean isCheck()
    {
        return check;
    }

    public void setCheck(boolean check)
    {
        this.check = check;
    }

    public boolean isCheckmate()
    {
        return checkmate;
    }

    public void setCheckmate(boolean checkmate)
    {
        this.checkmate = checkmate;
    }
}
