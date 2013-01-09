package Game;

import Board.Board;
import MiscData.Enums.EGameResult;
import MiscData.InputConfigData;
import MiscData.Position;
import ReusableContracts.*;
import ReusableContracts.Move.Move;
import Piece.Piece;

import java.util.ArrayList;

public class vsGame extends Game
{
    public vsGame(Board board,ArrayList<InputConfigData> InitialConfig)
    {
        gameBoard = board;

        board.reset(InitialConfig);
    }

    public EGameResult play()
    {
        Move currMove;
        Piece sourcePiece;
        Position currSource;

        gameBoard.display();

        for(int i=0;i<gameMoves.size();i++)
        {
            currMove = gameMoves.get(i);

            currSource = currMove.checkMove(gameBoard);

            if(currSource == null)
            {
                //print fail
                return EGameResult.UNDEF;
            }
            else
            {
                gameBoard.movePiece(currSource,currMove.getDestination());
                gameBoard.display();
            }

        }


        //print Success
        return EGameResult.UNDEF;
    }
}
