public class Rest
{
    private int restoreHealth;
    private int restoreMP;

    public void restoreHealth()
    {
        restoreHealth = 75;
    }

    public void restoreMP()
    {
        restoreMP = 20;
    }


    //Getters and setters

    public int getRestoreHealth() {
        return restoreHealth;
    }

    public int getRestoreMP() {
        return restoreMP;
    }

    public void setRestoreHealth(int restoreHealth) {
        this.restoreHealth = restoreHealth;
    }

    public void setRestoreMP(int restoreMP) {
        this.restoreMP = restoreMP;
    }
}
