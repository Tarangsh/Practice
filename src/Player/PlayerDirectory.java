package Player;

import java.util.ArrayList;

public class PlayerDirectory
{
    ArrayList<Player> players;
    static int playerCount;

    public PlayerDirectory()
    {
        players = new ArrayList<Player>();
        playerCount = 0;
    }

    public void addPlayer(Player player)
    {
        player.setPlayerId(playerCount++);
        players.add(player);
    }

    public Player getPlayer(String name)
    {
        for(Player currPlayer: players)
        {
            if(currPlayer.getName().equals(name))
            {
                return currPlayer;
            }
        }
        return null;
    }

    public Player getPlayer(int id)
    {
        for(Player currPlayer: players)
        {
            if(currPlayer.getPlayerId() == id)
            {
                return currPlayer;
            }
        }
        return null;
    }

    public ArrayList<Player> getPlayers()
    {
        return players;
    }
}
