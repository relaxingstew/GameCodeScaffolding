public class Card extends Deck
{
    private int strength;
    private int defense;

    Card(int strength, int defense)
    {
        this.strength = strength;
        this.defense = defense;
    }


    //Getters and setters

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
