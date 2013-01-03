package Move.ChessMove;

import GameData.Position;
import ReusableContracts.Board;
import ReusableContracts.Move.ChessMove;

public class PawnMove extends ChessMove
{
    public Position checkMove(Board board)
    {
        //Starting Position
        if(color.equals("WHITE"))
        {
            return checkMoveW(board);
        }
        else if(color.equals("BLACK"))
        {

        }

        return null;
    }

    private Position checkMoveB(Board board)
    {

        return null;
    }

    private Position checkMoveW(Board board)
    {
        Position Src = null;
        //Normal case
        if(board.getPieceAt(destination.getX(),destination.getY()) == null)
        {
            if(capture == true)
                return null;
            //Starting position
            if(destination.getY()==3)
            {
                 if(board.getPieceAt(1,destination.getY())!=null && board.getPieceAt(1,destination.getY()).getName().equals("P") && board.getPieceAt(2,destination.getY())==null)
                 {
                      Src = new Position();
                      Src.setX(1);
                      Src.setY(destination.getY());
                      return Src;
                 }
            }

            if(board.getPieceAt(destination.getX()-1,destination.getY())!=null && board.getPieceAt(destination.getX()-1,destination.getY()).getName().equals("P"))
            {
                Src = new Position();
                Src.setX(destination.getX()-1);
                Src.setY(destination.getY());
                return Src;
            }

        }
        else
        {
            if(capture == false)
                return null;




        }

        //Other Position Normal case
        //if()


        return null;
    }
}