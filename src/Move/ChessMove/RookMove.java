package Move.ChessMove;

import Board.Board;
import MiscData.Enums.EFileLetter;
import MiscData.Enums.EPieceName;
import MiscData.Position;
import ReusableContracts.Move.ChessMove;

public class RookMove extends ChessMove
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

    public Position verify(Board board)
    {
        int x = destination.getX();
        int y = destination.getY();
        int xDim = board.getxDim();
        int yDim = board.getyDim();
        Position src = null;

        for(int i=x;i>=0;i--)
        {
            if(board.getPieceAt(i,y) != null)
            {
                if(board.getPieceAt(i,y).getName() == EPieceName.R && board.getPieceAt(i,y).getColor() == color)
                {
                    if(fileLetter == EFileLetter.u)
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(y);

                        return src;
                    }
                    else if(fileLetter == board.getPieceAt(i,y).getFileLetter())
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(y);

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

        for(int i=x;i<xDim;i++)
        {
            if(board.getPieceAt(i,y) != null)
            {
                if(board.getPieceAt(i,y).getName() == EPieceName.R && board.getPieceAt(i,y).getColor() == color)
                {
                    if(fileLetter == EFileLetter.u)
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(y);

                        return src;
                    }
                    else if(fileLetter == board.getPieceAt(i,y).getFileLetter())
                    {
                        src = new Position();
                        src.setX(i);
                        src.setY(y);

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

        for(int i=y;i>=0;i--)
        {
            if(board.getPieceAt(x,i) != null)
            {
                if(board.getPieceAt(x,i).getName() == EPieceName.R && board.getPieceAt(x,i).getColor() == color)
                {
                    if(fileLetter == EFileLetter.u)
                    {
                        src = new Position();
                        src.setX(x);
                        src.setY(i);

                        return src;
                    }
                    else if(fileLetter == board.getPieceAt(x,i).getFileLetter())
                    {
                        src = new Position();
                        src.setX(x);
                        src.setY(i);

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

        for(int i=y;i<yDim;i++)
        {
            if(board.getPieceAt(x,i) != null)
            {
                if(board.getPieceAt(x,i).getName() == EPieceName.R && board.getPieceAt(x,i).getColor() == color)
                {
                    if(fileLetter == EFileLetter.u)
                    {
                        src = new Position();
                        src.setX(x);
                        src.setY(i);

                        return src;
                    }
                    else if(fileLetter == board.getPieceAt(x,i).getFileLetter())
                    {
                        src = new Position();
                        src.setX(x);
                        src.setY(i);

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
