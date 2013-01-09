package Controller;

import Board.Board;
import Board.BoardInitializer.BoardInitializer;
import MiscData.Enums.EGameResult;
import Player.*;
import ReusableContracts.*;
import Game.*;
import InputParser.*;

public class GameController
{
    PlayerDirectory playerDirectory;
    BoardInitializer boardInitializer;

    public GameController()
    {
        playerDirectory = new PlayerDirectory();
        boardInitializer = new BoardInitializer();
    }

    public void twoPlayerChessGame(String pName1,String pName2,String moves)
    {
        Game game;
        Board board;
        Player P1;
        Player P2;
        EGameResult Result = EGameResult.UNDEF;

        if(moves.contains("-"))
        {
            if(moves.contains("1-0"))
            {
                Result = EGameResult.WHITE;
            }
            else if(moves.contains("0-1"))
            {
                Result = EGameResult.BLACK;
            }
            else if(moves.contains("1/2-1/2"))
            {
                Result = EGameResult.DRAW;
            }

        }

        P1 = playerDirectory.getPlayer(pName1);
        P2 = playerDirectory.getPlayer(pName2);

        if(P1 == null)
        {
            playerDirectory.addPlayer(new Player(pName1));
            P1 = playerDirectory.getPlayer(pName1);
        }

        if(P2 == null)
        {
            playerDirectory.addPlayer(new Player(pName2));
            P2 = playerDirectory.getPlayer(pName2);
        }

        board = new Board(8,8);
        game = new vsGame(board,boardInitializer.getChessInitialConfig(8,8));

        game.provideMoves(moves,new ChessInputParser());

        if(game.play()!=EGameResult.UNDEF)
        {
            P1.getChessRatingData().incrementPlayed();
            P2.getChessRatingData().incrementPlayed();

            if(Result == EGameResult.WHITE)
            {
                P1.getChessRatingData().incrementWon();
                P2.getChessRatingData().incrementLost();
            }
            else if(Result == EGameResult.BLACK)
            {
                P2.getChessRatingData().incrementWon();
                P1.getChessRatingData().incrementLost();
            }
            else if(Result == EGameResult.DRAW)
            {
                P1.getChessRatingData().incrementDrawn();
                P2.getChessRatingData().incrementDrawn();
            }
        }
    }

    public void twoPlayerCheckersGame(String pName1,String pName2,String Moves)
    {

    }

    public void displayRatings()
    {
        System.out.println("*********************Ratings*****************************");

        for (Player currPlayer:playerDirectory.getPlayers())
        {
            System.out.println(currPlayer.getName());
            System.out.println("CHESS:     Rating:"+currPlayer.getChessRatingData().getRatingPoints()+"  Played:" + currPlayer.getChessRatingData().getMatchesPlayed() + "  Won:" + currPlayer.getChessRatingData().getMatchesWon() + "  Drawn:" + currPlayer.getChessRatingData().getMatchesDrawn() + "  Lost:" + currPlayer.getChessRatingData().getMatchesLost());
            System.out.println("CHECKERS:  Rating:"+currPlayer.getCheckersRatingData().getRatingPoints()+"  Played:" + currPlayer.getCheckersRatingData().getMatchesPlayed() + "  Won:" + currPlayer.getCheckersRatingData().getMatchesWon() + "  Drawn:" + currPlayer.getCheckersRatingData().getMatchesDrawn() + "  Lost:" + currPlayer.getCheckersRatingData().getMatchesLost());
            System.out.print("\n");
        }

        System.out.println("*********************************************************");
    }

}
