package Board;

import MiscData.Box;
import MiscData.Enums.EBoxColor;
import MiscData.InputConfigData;
import MiscData.Position;
import Piece.Piece;

import java.util.ArrayList;

public class Board
{
    protected Box[][] boxes;
    protected int xDim,yDim;

    public Board(int x,int y)
    {
        xDim = x;
        yDim = y;

        boxes = new Box[xDim][yDim];

        for(int i=0;i<xDim;i++)
        {
            for(int j=0;j<yDim;j++)
            {
                if((i+j)%2 == 0)
                {
                    boxes[i][j] = new Box(EBoxColor.WHITE);
                }
                else
                {
                    boxes[i][j] = new Box(EBoxColor.BLACK);
                }
            }
        }
    }

    public void reset(ArrayList<InputConfigData> initialConfig)
    {
        for(InputConfigData currConfig: initialConfig)
        {
            setPieceAt(currConfig.getPiece(), currConfig.getPosition().getX(), currConfig.getPosition().getY());
        }
    }

    private void setBoxes()
    {

    }

    public boolean isVacant(int i,int j)
    {
        if(boxes[i][j].isVacant() == true)
            return true;
        else
            return false;
    }

    public Piece getPieceAt(int i,int j)
    {
        return boxes[i][j].getContent();
    }

    public void setPieceAt(Piece piece,int i,int j)
    {
        boxes[i][j].setContent(piece);
    }

    public void movePiece(Position source,Position destination)
    {
        setPieceAt(getPieceAt(source.getX(),source.getY()),destination.getX(),destination.getY());
        setPieceAt(null,source.getX(),source.getY());
    }

    public int getxDim()
    {
        return xDim;
    }

    public void setxDim(int xDim)
    {
        this.xDim = xDim;
    }

    public int getyDim()
    {
        return yDim;
    }

    public void setyDim(int yDim)
    {
        this.yDim = yDim;
    }

    public void display()
    {
        System.out.println("************ CHESS BOARD *************");

        for(int i=xDim-1;i>=0;i--)
        {
            for(int j=0;j<yDim;j++)
            {
                if(boxes[i][j].getContent() != null)
                    System.out.print(boxes[i][j].getContent().getName().toString()+"  ");
                else
                    System.out.print("_  ");
            }

            System.out.println("");
        }

        System.out.println("**************************************");
    }

}
