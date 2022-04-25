import java.util.ArrayList;
public class Inventory
{
    private ArrayList<Trinket> Trinkets;
    private ArrayList<Consumable> Consumables;
    public Inventory(ArrayList<Trinket> Trinkets, ArrayList<Consumable> Consumables)
    {
        this.Trinkets = Trinkets;
        this.Consumables = Consumables;
    }

    public void viewInventory(int Currency, int health, int MP, String pName)
    {
        System.out.println("---" + pName + " Inventory---");
        for(Trinket i : Trinkets)
        {
            //System.out.println(Trinket.getTrinketName());
        }
        for(Consumable i : Consumables)
        {
            System.out.println(i.getName());
        }
        System.out.println("Wallet: " + Currency + " Gold Coins");
        System.out.println("Health: " + health + " HP");
        System.out.println("MP: " + MP + " MP");
    }

    public void discardItem(int type, int index) {
        if (type == 1) {
            Trinkets.remove(index - 1);
        } else {
            Consumables.remove(index - 1);
        }
    }
    public int useConsumable(Consumable use, int currentHealth, int currentMp) {
        if(use.getHealthEffect() > 0) {
            currentHealth = currentHealth+ use.getHealthEffect();
            return currentHealth;
        }
        else {
            currentMp = currentMp + use.getMpEffect();
            return currentMp;
        }
    }
    public ArrayList<Trinket> getTrinkets()
    {
        return Trinkets;
    }

    public void setTrinkets(ArrayList<Trinket> Trinkets)
        {
            this.Trinkets = Trinkets;
        }
    }
