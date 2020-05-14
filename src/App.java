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
        System.out.println(myDeck);
        myDeck.shuffle();
        System.out.println(myDeck);
        myCard = myDeck.deal();
        textSize(20);
        textAlign(CENTER,CENTER);
    }

    public void mousePressed()
    {
        myCard = myDeck.deal();
    }

    public void draw()
    {
        background(255);
        fill(0);
        if(myCard != null)
        {
            text(myCard.toString(),width/2,height/2);
        }
        else
        {
            text("All Cards Delt",width/2,height/2);
        }
    }
}
