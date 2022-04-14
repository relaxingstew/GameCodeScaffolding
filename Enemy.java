import java.util.Random;

public class Enemy
{
    private String name;
    private int health;
    private int currency;
    private int mp;
    private int stamina;

    public void createRandomEnemy(){
        Random randomStat = new Random();
        this.health = randomStat.nextInt(10, 50);
        this.mp = randomStat.nextInt(10, 50);
        this.stamina = randomStat.nextInt(10, 50);
    }

    public void randomEncounter(){
        createRandomEnemy();
        System.out.println("You enter a random encounter! An opponent approaches." +
                "Health: " + getHealth() +
                "\nMP: " + getMp()
                + "\nStamina: " + getStamina());
    }

    public void attack()
    {

    }

    public void reasonWith()
    {

    }


    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
