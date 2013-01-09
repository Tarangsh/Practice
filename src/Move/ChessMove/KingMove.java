package Move.ChessMove;

import MiscData.Enums.EFileLetter;
import MiscData.Enums.EPieceName;
import MiscData.Position;
import Board.Board;
import ReusableContracts.Move.ChessMove;

public class KingMove extends ChessMove
{
    public Position checkMove(Board board)
    {
        if(board.getPieceAt(destination.getX(),destination.getY()) == null)
        {
            if(capture==true)
            {
                return null;
            }

            return verify(board);
        }
        else
        {
            if(capture==false)
            {
                return null;
            }

            if(board.getPieceAt(destination.getX(),destination.getY()).getColor() == color)
            {
                return null;
            }

            return verify(board);
        }
    }

    private Position verify(Board board)
    {
        int x = destination.getX();
        int y = destination.getY();
        int xDim = board.getxDim();
        int yDim = board.getyDim();
        Position src = null;

        src = verifyDirection(board,x+1,y);
        if(src!=null)
        {
            return src;
        }

        src = verifyDirection(board,x,y+1);
        if(src!=null)
        {
            return src;
        }

        src = verifyDirection(board,x-1,y);
        if(src!=null)
        {
            return src;
        }

        src = verifyDirection(board,x,y-1);
        if(src!=null)
        {
            return src;
        }

        src = verifyDirection(board,x+1,y+1);
        if(src!=null)
        {
            return src;
        }

        src = verifyDirection(board,x-1,y-1);
        if(src!=null)
        {
            return src;
        }

        src = verifyDirection(board,x-1,y+1);
        if(src!=null)
        {
            return src;
        }

        src = verifyDirection(board,x+1,y-1);
        if(src!=null)
        {
            return src;
        }

        return null;
    }

    private Position verifyDirection(Board board,int X,int Y)
    {
        Position src = null;

        if(X<0 || Y<0 || X>=board.getxDim() || Y>=board.getyDim())
        {
            return src;
        }

        if(board.getPieceAt(X,Y) != null)
        {
            if(board.getPieceAt(X,Y).getName() == EPieceName.K && board.getPieceAt(X,Y).getColor() == color)
            {
                if(fileLetter == EFileLetter.u)
                {
                    src = new Position();
                    src.setX(X);
                    src.setY(Y);

                    return src;
                }
                else if(fileLetter == board.getPieceAt(X,Y).getFileLetter())
                {
                    src = new Position();
                    src.setX(X);
                    src.setY(Y);

                    return src;
                }
            }
        }

        return src;
    }
}

