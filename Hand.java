import java.util.ArrayList;
import java.util.Random;

public class Hand
{
    private ArrayList<Card> cardsInHand;
    private Random rand = new Random();

    public Hand(Deck deck)
    {
        generateHand(deck);
    }

    public void generateHand(Deck deck)
    {
        for (int i = 0; i <= 6; i++)
        {
        int handCards = rand.nextInt(deck.getDeckSize());
        cardsInHand.add(deck.getCards().get(handCards));
        }
    }
}
