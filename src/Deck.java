public class Deck
{
    private Card[] allCards;
    private int top = 0;

    private Rank ace = new Rank("Ace", 1);
    private Rank two = new Rank("Two", 2);
    private Rank three = new Rank("Three", 3);
    private Rank four = new Rank("Four", 4);
    private Rank five = new Rank("Five", 5);
    private Rank six = new Rank("Six", 6);
    private Rank seven = new Rank("Seven", 7);
    private Rank eight = new Rank("Eight", 8);
    private Rank nine = new Rank("Nine", 9);
    private Rank ten = new Rank("Ten", 10);
    private Rank jack = new Rank("Jack", 11);
    private Rank queen = new Rank("Queen", 12);
    private Rank king = new Rank("King", 13);
    private Rank[] allRanks = {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king};

    private Suit club = new Suit("Club", 1);
    private Suit diamond = new Suit("Diamond", 2);
    private Suit heart = new Suit("Heart", 3);
    private Suit spade = new Suit("Spade", 4);
    private Suit[] allSuits = {club, diamond, heart, spade};

    public Deck()
    {
        allCards = new Card[52];
        int cardSize = allCards.length;
        for (int i = 0; i < cardSize; i++) {
            allCards[i] = new Card(allRanks[i%13],allSuits[i%4]);
        }
    }

    public Card deal()
    {
        if(top < allCards.length)
        {
            Card currentCard = allCards[top];
            top++;
            return currentCard;
        }
        return null;
    }

    public void shuffle()
    {
        for(int i = 0; i < allCards.length/2; i++)
        {
            int r1 = (int) (Math.random() * 52);
            int r2 = (int) (Math.random() * 52);

            Card temp = allCards[r1];
            allCards[r1] = allCards[r2];
            allCards[r2] = temp;
        }
    }

    public String toString()
    {
        String s = "";
        for (int i = 0; i < allCards.length; i++)
        {
            s = s + allCards[i].toString() + "\n";
        }
        return s;
    }

}
