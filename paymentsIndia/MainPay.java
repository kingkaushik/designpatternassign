package paymentsIndia;

public abstract class MainPay {
    public abstract  void pay(float amount);
    public  abstract  String getMode();

    @Override
    public String toString() {
        return "mode of payment:"+this.getMode();
    }
}
