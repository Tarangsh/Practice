package Move.ChessMove;

import MiscData.Enums.EFileLetter;
import MiscData.Enums.EPieceName;
import MiscData.Position;
import Board.Board;
import ReusableContracts.Move.ChessMove;

public class KnightMove extends ChessMove
{


    private Position verify(Board board)
    {
        int x = destination.getX();
        int y = destination.getY();
        int xDim = board.getxDim();
        int yDim = board.getyDim();
        Position src;

        if(x<xDim-1 && y<yDim-2)
        {
            if(board.getPieceAt(x+1,y+2)!=null && board.getPieceAt(x+1,y+2).getName().equals(EPieceName.N) && board.getPieceAt(x+1,y+2).getColor().equals(color))
            {
                if(FileLetter.equals(EFileLetter.u))
                {
                     src = new Position(x+1,y+2);
                     return src;
                }
                else
                {
                    if(FileLetter.equals(board.getPieceAt(x+1,y+2).getFileLetter()))
                    {
                        src = new Position(x+1,y+2);
                        return src;
                    }
                }
            }
        }

        if(x<xDim-1 && y>1)
        {
            if(board.getPieceAt(x+1,y-2)!=null && board.getPieceAt(x+1,y-2).getName().equals(EPieceName.N) && board.getPieceAt(x+1,y-2).getColor().equals(color))
            {
                if(FileLetter.equals(EFileLetter.u))
                {
                    src = new Position(x+1,y-2);
                    return src;
                }
                else
                {
                    if(FileLetter.equals(board.getPieceAt(x+1,y-2).getFileLetter()))
                    {
                        src = new Position(x+1,y-2);
                        return src;
                    }
                }
            }
        }

        if(x>0 && y<yDim-2)
        {
            if(board.getPieceAt(x-1,y+2)!=null && board.getPieceAt(x-1,y+2).getName().equals(EPieceName.N) && board.getPieceAt(x-1,y+2).getColor().equals(color))
            {
                if(FileLetter.equals(EFileLetter.u))
                {
                    src = new Position(x-1,y+2);
                    return src;
                }
                else
                {
                    if(FileLetter.equals(board.getPieceAt(x-1,y+2).getFileLetter()))
                    {
                        src = new Position(x-1,y+2);
                        return src;
                    }
                }
            }
        }

        if(x>0 && y>1)
        {
            if(board.getPieceAt(x-1,y-2)!=null && board.getPieceAt(x-1,y-2).getName().equals(EPieceName.N) && board.getPieceAt(x-1,y-2).getColor().equals(color))
            {
                if(FileLetter.equals(EFileLetter.u))
                {
                    src = new Position(x-1,y-2);
                    return src;
                }
                else
                {
                    if(FileLetter.equals(board.getPieceAt(x-1,y-2).getFileLetter()))
                    {
                        src = new Position(x-1,y-2);
                        return src;
                    }
                }
            }
        }

        if(x<xDim-2 && y<yDim-1)
        {
            if(board.getPieceAt(x+2,y+1)!=null && board.getPieceAt(x+2,y+1).getName().equals(EPieceName.N) && board.getPieceAt(x+2,y+1).getColor().equals(color))
            {
                if(FileLetter.equals(EFileLetter.u))
                {
                    src = new Position(x+2,y+1);
                    return src;
                }
                else
                {
                    if(FileLetter.equals(board.getPieceAt(x+2,y+1).getFileLetter()))
                    {
                        src = new Position(x+2,y+1);
                        return src;
                    }
                }
            }
        }

        if(x<xDim-2 && y>0)
        {
            if(board.getPieceAt(x+2,y-1)!=null && board.getPieceAt(x+2,y-1).getName().equals(EPieceName.N) && board.getPieceAt(x+2,y-1).getColor().equals(color))
            {
                if(FileLetter.equals(EFileLetter.u))
                {
                    src = new Position(x+2,y-1);
                    return src;
                }
                else
                {
                    if(FileLetter.equals(board.getPieceAt(x+2,y-1).getFileLetter()))
                    {
                        src = new Position(x+2,y-1);
                        return src;
                    }
                }
            }
        }

        if(x>1 && y<yDim-1)
        {
            if(board.getPieceAt(x-2,y+1)!=null && board.getPieceAt(x-2,y+1).getName().equals(EPieceName.N) && board.getPieceAt(x-2,y+1).getColor().equals(color))
            {
                if(FileLetter.equals(EFileLetter.u))
                {
                    src = new Position(x-2,y+1);
                    return src;
                }
                else
                {
                    if(FileLetter.equals(board.getPieceAt(x-2,y+1).getFileLetter()))
                    {
                        src = new Position(x-2,y+1);
                        return src;
                    }
                }
            }
        }

        if(x>1 && y>0)
        {
            if(board.getPieceAt(x-2,y-1)!=null && board.getPieceAt(x-2,y-1).getName().equals(EPieceName.N) && board.getPieceAt(x-2,y-1).getColor().equals(color))
            {
                if(FileLetter.equals(EFileLetter.u))
                {
                    src = new Position(x-2,y-1);
                    return src;
                }
                else
                {
                    if(FileLetter.equals(board.getPieceAt(x-2,y-1).getFileLetter()))
                    {
                        src = new Position(x-2,y-1);
                        return src;
                    }
                }
            }
        }

        return null;
    }


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


            if(board.getPieceAt(destination.getX(),destination.getY()).getColor().equals(color))
            {
                return null;
            }

            return verify(board);
        }
    }
}
