import java.util.Scanner;

public class NPC extends Player
{
    private boolean npcAlignment;
    private int npcStrength;

    public static void goodNPCInteraction(){
        Scanner kb = new Scanner(System.in);
        int input;
        System.out.println("Villager approaches! Villager says: Hi, traveller.");
        System.out.println("\n1. What can you tell me about this area?" +
                "\n2. Up for a trade?" +
                "\n3. [Ignore]");
        input = kb.nextInt();
        if(input == 1){
            System.out.println("");
        }
        if(input == 2){
            System.out.println("");
        }
        if(input == 3){
            System.out.println("Villager: All right, then. See you, I guess.");
        }
    }

    public static void badNPCInteraction(){
        Scanner kb = new Scanner(System.in);
        int input;
        System.out.println("Villager approaches! Villager says: Got any cash?");
        System.out.println("""

                1. [Give 1 coin]
                2. No, sorry.
                3. [Ignore]""");
        input = kb.nextInt();
        if(input == 1){
            System.out.println("You lost 1 coin.)");
            System.out.println("Villager: That's funny. Got any more?");
            System.out.println("""

                    1. No.
                    2. [Give 1 coin]""");
            input = kb.nextInt();
            if(input == 1){
                System.out.println("Villager: Well, I got your wallet right here, and you got plenty.");
                System.out.println("The villager robbed you! Money lost...");
                //add amount of money later
            }
            if(input == 2){
                System.out.println("(You lost 1 coin.)");
                System.out.println("Villager: Yeah, all right. Very, VERY funny.");
                System.out.println("The villager left, grumbling.");
            }
        }
        if(input == 2){
            System.out.println("Villager: You sure?");
        }
        if(input == 3){
            System.out.println("Villager: Hey! I was talking to you!");
            System.out.println("""

                    1. No money. Sorry.
                    2. [Ignore]""");
            input = kb.nextInt();
        }
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
