import java.util.ArrayList;

public class Deck extends Player
{
    private ArrayList<Card> newDeck;
    private boolean[] dealBool;
    private int deckSize;
    private int deckCap = 30;

    public Deck()
    {
        newDeck = new ArrayList<Card>();
        dealBool = new boolean[deckSize];
        deckSize = newDeck.size();
        this.deckCap = deckCap;
    }

    public void addCard(Card card)
    {
        newDeck.add(card);
        deckSize++;
    }

    public void removeCard(Card card)
    {
        newDeck.remove(card);
        deckSize--;
    }

    public Card playCard(Card card)
    {
        deckSize--;
        return card;
    }


    public int getDeckSize() {
        return deckSize;
    }

    public String getCardName(Card card)
    {
        return card.getName();
    }
    public int getCardStrength(Card card)
    {
        return card.getStrength();
    }
    public int getCardDefence(Card card)
    {
        return card.getDefense();
    }

    public ArrayList<Card> getNewDeck() {
        return newDeck;
    }
}
