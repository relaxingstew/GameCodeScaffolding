import java.util.Scanner;

public class NPC
{
    private boolean npcAlignment;
    private int npcStrength;

    Scanner kb = new Scanner(System.in);

    public String talk()
    {
        return "";
    }
    public String userResponse()
    {
        return kb.nextLine();
    }


    //Getters and setters

    public boolean getNPCAlignment() {
        return npcAlignment;
    }

    public int getNpcStrength() {
        return npcStrength;
    }

    public void setNpcAlignment(boolean npcAlignment) {
        this.npcAlignment = npcAlignment;
    }

    public void setNpcStrength(int npcStrength) {
        this.npcStrength = npcStrength;
    }
}
