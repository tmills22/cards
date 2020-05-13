public class Suit
{
    private String name;
    private int value;

    public Suit (String suitName, int suitValue)
    {
        name = suitName;
        value = suitValue;
    }

    public Suit (String suitName)
    {
        this(suitName, 0);
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
