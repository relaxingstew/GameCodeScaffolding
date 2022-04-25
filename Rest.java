public class Rest
{
    public static int restoreHealth(int currentHealth)
    {

        currentHealth += currentHealth + 50;
        return currentHealth;
    }
    public static int restoreMP(int currentMP)
    {
        currentMP = currentMP + 20;
        return currentMP;
    }
}
