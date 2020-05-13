public class Deck
{
    public static void main(String[] args)
    {
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

        Suit suit0 = new Suit("Club", 0);
        Suit suit3 = new Suit("Diamond", 0);
        Suit suit4 = new Suit("Heart", 0);
        Suit suit5 = new Suit("Spade", 0);

        String[] deck = new String[52];
    }
}
