package Board.BoardInitializer;

import MiscData.Enums.EPieceColor;
import MiscData.InputConfigData;
import MiscData.Position;
import Piece.Piece;
import Piece.PieceFactory;

import java.util.ArrayList;

public class BoardInitializer
{
    PieceFactory pieceFactory;

    public BoardInitializer()
    {
        pieceFactory = new PieceFactory();
    }

    public ArrayList<InputConfigData> getChessInitialConfig(int xDim,int yDim)
    {
        ArrayList<InputConfigData> chessInitialData = new ArrayList<InputConfigData>();
        Piece currPiece;
        Position currPos;
        InputConfigData currData;

        //Pawns
        for(int i=0;i<8;i++)
        {
            currPiece = pieceFactory.getPawn(EPieceColor.WHITE);
            currPos = new Position(1,i);
            currData = new InputConfigData(currPiece,currPos);
            chessInitialData.add(currData);

            currPiece = pieceFactory.getPawn(EPieceColor.BLACK);
            currPos = new Position(6,i);
            currData = new InputConfigData(currPiece,currPos);
            chessInitialData.add(currData);
        }

        //Rooks
        currPiece = pieceFactory.getRook(EPieceColor.WHITE);
        currPos = new Position(0,0);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getRook(EPieceColor.WHITE);
        currPos = new Position(0,yDim-1);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getRook(EPieceColor.BLACK);
        currPos = new Position(xDim-1,0);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getRook(EPieceColor.BLACK);
        currPos = new Position(xDim-1,yDim-1);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        //Knights
        currPiece = pieceFactory.getKnight(EPieceColor.WHITE);
        currPos = new Position(0,1);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getKnight(EPieceColor.WHITE);
        currPos = new Position(0,yDim-2);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getKnight(EPieceColor.BLACK);
        currPos = new Position(xDim-1,1);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getKnight(EPieceColor.BLACK);
        currPos = new Position(xDim-1,yDim-2);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        //Bishops
        currPiece = pieceFactory.getBishop(EPieceColor.WHITE);
        currPos = new Position(0,2);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getBishop(EPieceColor.WHITE);
        currPos = new Position(0,yDim-3);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getBishop(EPieceColor.BLACK);
        currPos = new Position(xDim-1,2);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getBishop(EPieceColor.BLACK);
        currPos = new Position(xDim-1,yDim-3);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        //Queens
        currPiece = pieceFactory.getQueen(EPieceColor.WHITE);
        currPos = new Position(0,3);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getQueen(EPieceColor.BLACK);
        currPos = new Position(xDim-1,yDim-4);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        //Kings
        currPiece = pieceFactory.getKing(EPieceColor.WHITE);
        currPos = new Position(0,4);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        currPiece = pieceFactory.getKing(EPieceColor.BLACK);
        currPos = new Position(xDim-1,yDim-5);
        currData = new InputConfigData(currPiece,currPos);
        chessInitialData.add(currData);

        return chessInitialData;
    }

    public ArrayList<InputConfigData> getCheckersInitialConfig()
    {
        return null;
    }
}
