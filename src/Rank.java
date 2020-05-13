public class Rank
{
    private String name;
    private int value;

    public Rank (String rankName, int rankValue)
    {
        name=rankName;
        value = rankValue;
    }

    public String toString()
    {
    return name;
    }

    public int getValue()
    {
        return value;
    }
}
