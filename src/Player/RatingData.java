package Player;

public class RatingData
{
    int matchesPlayed;
    int matchesWon;
    int matchesDrawn;
    int matchesLost;
    int ratingPoints;

    RatingData()
    {
        matchesPlayed = 0;
        matchesWon = 0;
        matchesDrawn = 0;
        matchesLost = 0;
        ratingPoints = 50;
    }

    public void incrementPlayed()
    {
        matchesPlayed++;
    }

    public void incrementWon()
    {
        matchesWon++;
        ratingPoints+=10;
    }

    public void incrementDrawn()
    {
        matchesDrawn++;
        ratingPoints+=5;
    }

    public void incrementLost()
    {
        matchesLost++;
        ratingPoints-=5;
    }

    public int getMatchesPlayed()
    {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed)
    {
        this.matchesPlayed = matchesPlayed;
    }

    public int getMatchesWon()
    {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon)
    {
        this.matchesWon = matchesWon;
    }

    public int getRatingPoints()
    {
        return ratingPoints;
    }

    public void setRatingPoints(int ratingPoints)
    {
        this.ratingPoints = ratingPoints;
    }

    public int getMatchesLost()
    {
        return matchesLost;
    }

    public void setMatchesLost(int matchesLost)
    {
        this.matchesLost = matchesLost;
    }

    public int getMatchesDrawn()
    {
        return matchesDrawn;
    }

    public void setMatchesDrawn(int matchesDrawn)
    {
        this.matchesDrawn = matchesDrawn;
    }
}
