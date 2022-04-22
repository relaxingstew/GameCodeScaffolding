import java.util.ArrayList;

public class Deck extends Player
{
    private ArrayList<Card> cards;
    private boolean[] dealBool;
    private int deckSize;
    private int deckCap = 30;

    public Deck()
    {
        cards = new ArrayList<Card>();
        deckSize = cards.size();
        dealBool = new boolean[deckSize];
        this.deckCap = deckCap;
    }

    public void addCard(Card card)
    {
        cards.add(card);
    }

    public void removeCard(Card card)
    {
        cards.remove(card);
    }

    public int getDeckSize() {
        return deckSize;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
