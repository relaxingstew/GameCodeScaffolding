import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    private int currency;
    private Trinket trin;
    private Consumable cons1;
    private Consumable cons2;
    private ArrayList<Trinket> trinkets = new ArrayList<Trinket>();
    private ArrayList<Consumable> consumables = new ArrayList<Consumable>();
    public Shop(int currency, ArrayList<Trinket> trinkets, ArrayList<Consumable> consumables, Trinket trin,
                Consumable cons1, Consumable cons2)
    {
        this.currency = currency;
        this.trinkets = trinkets;
        this.consumables = consumables;
        this.trin = trin;
        this.cons1 = cons1;
        this.cons2 = cons2;
    }
    public void openShop()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("You stumble across an old tavern on the side of the rode. \n Hesitantly, you walk in.");
        System.out.println("Shopkeeper: \"New Faces are a rare sight out here, hope this isn't the last time we meet\"");
        System.out.println("\"Take a look Around, Prices are about is fair as you can expect\"");
        System.out.println("=====================================================");
        System.out.println("Currency: " + currency);
        System.out.println("=====================================================");
        System.out.println("     Item 1");
        System.out.println("****" + cons1.getName() + "****");
        System.out.println("Description: " + cons1.getDescription());
        System.out.println("Price: " + cons1.getPrice());
        System.out.println("=====================================================");
        System.out.println("     Item 2");
        System.out.println("****" + cons2.getName() + "****");
        System.out.println("Description: " + cons2.getDescription());
        System.out.println("Price: " + cons2.getPrice());
        System.out.println("=====================================================");
        System.out.println("     Item 3");
        System.out.println("****" + trin.getTrinketName() + "****");
        System.out.println("Description: " + trin.getDescription());
        System.out.println("Price: " + trin.getPrice());
        System.out.println("=====================================================");
        System.out.println("What would you like to purchase? ");
        String choice = kb.nextLine();
    }
}
