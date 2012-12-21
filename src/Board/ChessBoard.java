package Board;

import Piece.*;
import Piece.Piece;

public class ChessBoard extends Board
{
    public ChessBoard()
    {
        Boxes = new Box[8][8];
    }

    public void reset()
    {
        Piece currPiece;

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                Boxes[i][j] = new Box();
                Boxes[i][j].setContent(null);

                if((i+j)%2 == 0)
                {
                    Boxes[i][j].setColor("WHITE");
                }
                else
                {
                    Boxes[i][j].setColor("BLACK");
                }
            }
        }

        //Pawns
        for(int i=0;i<8;i++)
        {
            currPiece = new Pawn();
            currPiece.setColor("WHITE");
            Boxes[1][i].setContent(currPiece);

            currPiece = new Pawn();
            currPiece.setColor("BLACK");
            Boxes[7][i].setContent(new Pawn());
        }

        //Rooks
        currPiece = new Rook();
        currPiece.setColor("WHITE");
        Boxes[0][0].setContent(currPiece);

        currPiece = new Rook();
        currPiece.setColor("WHITE");
        Boxes[0][7].setContent(currPiece);

        currPiece = new Rook();
        currPiece.setColor("BLACK");
        Boxes[7][0].setContent(currPiece);

        currPiece = new Rook();
        currPiece.setColor("BLACK");
        Boxes[7][7].setContent(currPiece);

        //Knights
        currPiece = new Knight();
        currPiece.setColor("WHITE");
        Boxes[0][1].setContent(currPiece);

        currPiece = new Knight();
        currPiece.setColor("WHITE");
        Boxes[0][6].setContent(currPiece);

        currPiece = new Knight();
        currPiece.setColor("BLACK");
        Boxes[7][1].setContent(currPiece);

        currPiece = new Knight();
        currPiece.setColor("BLACK");
        Boxes[7][6].setContent(currPiece);

        //Bishops
        currPiece = new Bishop();
        currPiece.setColor("WHITE");
        Boxes[0][2].setContent(currPiece);

        currPiece = new Bishop();
        currPiece.setColor("WHITE");
        Boxes[0][5].setContent(currPiece);

        currPiece = new Bishop();
        currPiece.setColor("BLACK");
        Boxes[7][2].setContent(currPiece);

        currPiece = new Bishop();
        currPiece.setColor("BLACK");
        Boxes[7][5].setContent(currPiece);

        //Queens
        currPiece = new Queen();
        currPiece.setColor("WHITE");
        Boxes[0][4].setContent(currPiece);

        currPiece = new Queen();
        currPiece.setColor("BLACK");
        Boxes[7][3].setContent(currPiece);

        //Kings
        currPiece = new King();
        currPiece.setColor("WHITE");
        Boxes[0][3].setContent(currPiece);

        currPiece = new King();
        currPiece.setColor("BLACK");
        Boxes[7][4].setContent(currPiece);

    }
}
