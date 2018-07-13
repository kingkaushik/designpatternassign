package paymentsIndia;

public class Pay {
    public static MainPay payment(String mode) {

        if(mode.equalsIgnoreCase("cc"))
        {
            return new CreditCard(5000,mode);
        }
        else if(mode.equalsIgnoreCase("dc"))
        {
            return new DebitCard(5000,mode);
        }
        else if(mode.equalsIgnoreCase("wallets"))
        {
            return new Wallets(5000,mode);
        }
        else if(mode.equalsIgnoreCase("Netbanking"))
        {
            return new NetBanking(5000,mode);
        }
        else if(mode.equalsIgnoreCase("cod"))
        {
            return new Cod(5000,mode);
        }
        return  null;
    }
}
