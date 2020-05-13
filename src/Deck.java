public class Deck
{
    private Card[] allCards;

    Rank rank0 = new Rank("Ace", 1);
    Rank rank1 = new Rank("Two", 2);
    Rank rank2 = new Rank("Three", 3);
    Rank rank3 = new Rank("Four", 4);
    Rank rank4 = new Rank("Five", 5);
    Rank rank5 = new Rank("Six", 6);
    Rank rank6 = new Rank("Seven", 7);
    Rank rank7 = new Rank("Eight", 8);
    Rank rank8 = new Rank("Nine", 9);
    Rank rank9 = new Rank("Ten", 10);
    Rank rank10 = new Rank("Jack", 11);
    Rank rank11 = new Rank("Queen", 12);
    Rank rank12 = new Rank("King", 13);
    Rank[] allRanks = {rank0,rank1,rank2,rank3,rank4,rank5,rank6,rank7,rank8,rank9,rank10,rank11,rank12};

    Suit suit0 = new Suit("Club", 1);
    Suit suit1 = new Suit("Diamond", 2);
    Suit suit2 = new Suit("Heart", 3);
    Suit suit3 = new Suit("Spade", 4);
    Suit[] allSuits = {suit0,suit1,suit2,suit3};

    public Deck()
    {
        allCards = new Card[52];
        int cardSize = allCards.length;
        for (int i = 0; i < cardSize; i++) {
            allCards[i] = new Ranks(allRanks[i%13] + " of " + allSuits[i/13];
            // System.out.println(allCards[i]);
        }

    }
}
