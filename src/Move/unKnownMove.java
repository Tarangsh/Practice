package Move;

import Board.Board;
import GameData.Position;

public class unKnownMove extends Move
{
    public Move getMove(String type)
    {
        if(type.contains("N"))
            return (new KingMove());
        else if(type.contains("R"))
            return (new RookMove());
        else if(type.contains("K"))
            return (new KingMove());
        else if(type.contains("Q"))
            return (new QueenMove());
        else if(type.contains("P"))
            return (new PawnMove());
        else if(type.contains("B"))
            return (new BishopMove());
        else
            return null;
    }

    public Position checkMove(Board board)
    {
        String Name = board.getPieceAt(source.getX(),source.getY()).getName().toString();
        Move currMove = getMove(Name);

        currMove.setSource(source);
        currMove.setDestination(destination);
        currMove.setColor(color);

        return currMove.checkMove(board);
    }
}
