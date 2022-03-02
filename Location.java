import java.util.Scanner;

public class Location
{
    private String locationName;
    private int difficulty;
    private int enemiesPresent;

    Scanner kb = new Scanner(System.in);

    public int playerAction()
    {
        return kb.nextInt();
    }

    public void randomEncounter()
    {

    }

    public String locationDescription()
    {
        return "";
    }


    //Getters and setters

    public String getLocationName() {
        return locationName;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getEnemiesPresent() {
        return enemiesPresent;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setEnemiesPresent(int enemiesPresent) {
        this.enemiesPresent = enemiesPresent;
    }
}
