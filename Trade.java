public class Trade extends NPC
{
    private String tradeOffer;

    public Trade(String tradeOffer)
    {
        this.tradeOffer = tradeOffer;
    }

    public void acceptTrade()
    {

    }

    public void declineTrade()
    {

    }


    //Getters and setters

    public String getTradeOffer() {
        return tradeOffer;
    }

    public void setTradeOffer(String tradeOffer) {
        this.tradeOffer = tradeOffer;
    }
}
