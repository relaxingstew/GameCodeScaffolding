import java.util.Scanner;

public class Player
{
    private String name;
    public Scanner kb = new Scanner(System.in);
    private int health;
    private int currency;
    private int mp;
    private int stamina;

    public int battleCounter()
    {
        return 0;
    }

    public int restCounter()
    {
        return 0;
    }

    public void npcCounter()
    {

    }

    public void attack()
    {

    }

    public void spareEnemy()
    {

    }


    //Getters and setters

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getCurrency() {
        return currency;
    }

    public int getMp() {
        return mp;
    }

    public int getStamina() {
        return stamina;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
