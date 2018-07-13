package paymentsIndia;

public class DebitCard extends MainPay{
    private float amount;
    private String mode;

    public DebitCard(float amount, String mode) {
        this.amount = amount;
        this.mode = mode;
    }

    @Override
    public void pay(float amount) {
        this.amount=amount;

    }

    @Override
    public String getMode() {
        return null;
    }
}