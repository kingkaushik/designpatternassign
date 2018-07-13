package paymentsIndia;

public class Wallets extends MainPay{
    private float amount;
    private String mode;

    public Wallets(float amount, String mode) {
        this.amount = amount;
        this.mode = mode;
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
