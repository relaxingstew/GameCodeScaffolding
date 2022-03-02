public class Trinkets extends Inventory
{
    private String description;
    private String use;
    private int buffHealth;
    private int buffMp;

    public void restoreHealth()
    {

    }
    public void restoreMp()
    {

    }


    //Getters and setters

    public String getDescription() {
        return description;
    }

    public String getUse() {
        return use;
    }

    public int getBuffHealth() {
        return buffHealth;
    }

    public int getBuffMp() {
        return buffMp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public void setBuffHealth(int buffHealth) {
        this.buffHealth = buffHealth;
    }

    public void setBuffMp(int buffMp) {
        this.buffMp = buffMp;
    }
}
