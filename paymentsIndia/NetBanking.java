package paymentsIndia;

public class NetBanking extends MainPay{
    private float amount;
    private String mode;

    public NetBanking(float amount, String mode) {
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