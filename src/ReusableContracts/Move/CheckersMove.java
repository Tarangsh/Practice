package ReusableContracts.Move;

public abstract class CheckersMove extends Move
{
     boolean kinging;

    public CheckersMove()
    {
        kinging = false;
    }

    public boolean isKinging()
    {
        return kinging;
    }

    public void setKinging(boolean kinging)
    {
        this.kinging = kinging;
    }
}
