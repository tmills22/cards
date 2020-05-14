import processing.core.PApplet;

public class App extends PApplet
{

    Deck myDeck = new Deck();
    Card myCard;

    public static void main(String[] args)
    {
        PApplet.main("App");
    }

    public void settings()
    {
        size(800,600);
    }

    public void setup()
    {
        // Prints original deck.
        System.out.println("[ORIGINAL DECK:]");
        System.out.println(myDeck);
        // Shuffles then prints shuffled deck.
        System.out.println("[SHUFFLED DECK:]");
        myDeck.shuffle();
        System.out.println(myDeck);
        // Deals top card then prints what card was delt.
        System.out.println("[DELT CARDS:]");
        myCard = myDeck.deal();
        System.out.println(myCard.toString() + " was delt.");
        textSize(20);
        textAlign(CENTER,CENTER);
    }

    // Deals top card on mouse pressed then prints what card was delt.
    public void mousePressed()
    {
        myCard = myDeck.deal();
        if(myCard != null)
        {
            System.out.println(myCard.toString());
        }
    }

    //
    public void draw()
    {
        background(255);
        fill(0);
        if(myCard != null)
        {
            text(myCard.toString() + " was delt.",width/2,height/2);
        }
        else
        {
            text("All cards delt.",width/2,height/2);
        }
    }
}
