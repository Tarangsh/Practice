package Piece;

public class PieceId
{
    private String name;
    private String fileLetter;

    public PieceId()
    {
        name = "_";
        fileLetter = "_";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getFileLetter()
    {
        return fileLetter;
    }

    public void setFileLetter(String fileLetter)
    {
        this.fileLetter = fileLetter;
    }
}
