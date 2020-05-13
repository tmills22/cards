import processing.core.PApplet;

public class App extends PApplet
{

    Deck myDeck = new Deck();

    public static void main(String[] args)
    {
        PApplet.main("App");
    }

    public void settings()
    {
        System.out.println(myDeck);
    }
}
