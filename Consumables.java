public class Consumables extends Inventory
{
    private int consumablesStrength;
    private String description;
    private int buffHealth;
    private int buffMp;

    public void restoreHealth()
    {

    }

    public void restoreMp()
    {

    }


    //Getters and setters

    public int getConsumablesStrength() {
        return consumablesStrength;
    }

    public String getDescription() {
        return description;
    }

    public int getBuffHealth() {
        return buffHealth;
    }

    public int getBuffMp() {
        return buffMp;
    }

    public void setConsumablesStrength(int consumablesStrength) {
        this.consumablesStrength = consumablesStrength;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBuffHealth(int buffHealth) {
        this.buffHealth = buffHealth;
    }

    public void setBuffMp(int buffMp) {
        this.buffMp = buffMp;
    }
}
