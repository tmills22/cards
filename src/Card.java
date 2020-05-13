public class Card
{

    private Rank myRank;
    private Suit mySuit;

    public Card (Rank r, Suit s){

        myRank=r;
        mySuit=s;
    }

    public String toString() {
        return myRank.toString() + " of " + mySuit.toString();
    }
}