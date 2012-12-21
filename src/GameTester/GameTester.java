package GameTester;

import Game.ChessGame.ChessGame;
import GameData.StdMove;
import com.sun.deploy.net.proxy.StaticProxyManager;

import java.util.List;

public class GameTester
{
    static List<StdMove> InputList;

    public static void main(String[] args)
    {
        int Result;
        ChessGame CHESS = new ChessGame();

        //Populate List
//        CHESS.provideMoves(InputList);

        Result = CHESS.play();

        if(Result == 0)
        {
            System.out.println("Success!!");
        }
        else
        {
            System.out.println("Move No. "+Result+" is invalid!!");
        }

    }
}

