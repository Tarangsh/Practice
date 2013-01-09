package Player;

public class Player
{
    private int playerId;
    private String name;
    private RatingData chessRatingData;
    private RatingData checkersRatingData;

    public Player(String pName)
    {
        name = pName;
        chessRatingData = new RatingData();
        checkersRatingData = new RatingData();
    }

    public String getName()
    {
        return name;
    }


    public int getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(int playerId)
    {
        this.playerId = playerId;
    }

    public RatingData getChessRatingData()
    {
        return chessRatingData;
    }

    public void setChessRatingData(RatingData chessRatingData)
    {
        this.chessRatingData = chessRatingData;
    }

    public RatingData getCheckersRatingData()
    {
        return checkersRatingData;
    }

    public void setCheckersRatingData(RatingData checkersRatingData)
    {
        this.checkersRatingData = checkersRatingData;
    }
}
