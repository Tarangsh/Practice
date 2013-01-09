package Move.ChessMove;

import Board.Board;
import MiscData.Enums.EFileLetter;
import MiscData.Enums.EPieceName;
import MiscData.Position;
import ReusableContracts.Move.ChessMove;

public class BishopMove extends ChessMove
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


            if(board.getPieceAt(destination.getX(),destination.getY()).getColor() == (color))
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

        for(int i=x,j=y;i>=0&&y>=0;i--,y--)
        {
            if(board.getPieceAt(i,j) != null)
            {
                if(board.getPieceAt(i,j).getName() == EPieceName.B && board.getPieceAt(i,j).getColor() == color)
                {
                    if(fileLetter == EFileLetter.u)
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(j);

                        return src;
                    }
                    else if(fileLetter == board.getPieceAt(i,j).getFileLetter())
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(j);

                        return src;
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
        }

        for(int i=x,j=y;i<xDim&&y<yDim;i++,y++)
        {
            if(board.getPieceAt(i,j) != null)
            {
                if(board.getPieceAt(i,j).getName() == EPieceName.B && board.getPieceAt(i,j).getColor() == color)
                {
                    if(fileLetter == EFileLetter.u)
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(j);

                        return src;
                    }
                    else if(fileLetter == board.getPieceAt(i,j).getFileLetter())
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(j);

                        return src;
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
        }

        for(int i=x,j=y;i<xDim&&y>=0;i++,y--)
        {
            if(board.getPieceAt(i,j) != null)
            {
                if(board.getPieceAt(i,j).getName() == EPieceName.B && board.getPieceAt(i,j).getColor() == color)
                {
                    if(fileLetter == EFileLetter.u)
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(j);

                        return src;
                    }
                    else if(fileLetter == board.getPieceAt(i,j).getFileLetter())
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(j);

                        return src;
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
        }

        for(int i=x,j=y;i>=0&&y<yDim;i--,y++)
        {
            if(board.getPieceAt(i,j) != null)
            {
                if(board.getPieceAt(i,j).getName() == EPieceName.B && board.getPieceAt(i,j).getColor() == color)
                {
                    if(fileLetter == EFileLetter.u)
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(j);

                        return src;
                    }
                    else if(fileLetter == board.getPieceAt(i,j).getFileLetter())
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(j);

                        return src;
                    }
                    else
                    {
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
        }

        return null;
    }
}
