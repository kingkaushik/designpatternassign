package paymentsIndia;

public class CreditCard extends MainPay{
    private float amount;
    private String mode;


    public CreditCard(float amount, String mode) {
        this.amount = amount;
        this.mode = mode;
    }

    public CreditCard()
    {
        this.mode="credit";
    }
    @Override
    public void pay(float amount) {
        this.amount=amount;

    }



    @Override
    public String getMode() {
        return mode;
    }
}
