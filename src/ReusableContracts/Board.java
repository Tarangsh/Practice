package ReusableContracts;

import MiscData.Box;
import MiscData.Position;
import ReusableContracts.Piece.Piece;

public abstract class Board
{
    protected Box[][] Boxes;
    protected int xDim,yDim;

    public abstract void reset();
    public abstract void reset(String ConfigFile);

    public boolean isVacant(int i,int j)
    {
        if(Boxes[i][j].isVacant() == true)
            return true;
        else
            return false;
    }

    public Piece getPieceAt(int i,int j)
    {
        return Boxes[i][j].getContent();
    }

    public abstract void movePiece(Position source,Position destination);

    public void display()
    {
        System.out.println("************ CHESS BOARD *************");

        for(int i=xDim-1;i>=0;i--)
        {
            for(int j=0;j<yDim;j++)
            {
                if(Boxes[i][j].getContent() != null)
                    System.out.print(Boxes[i][j].getContent().getName().toString()+"  ");
                else
                    System.out.print("_  ");
            }

            System.out.println("");
        }

        System.out.println("**************************************");
    }

}
