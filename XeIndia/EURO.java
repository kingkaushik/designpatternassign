package XeIndia;

public class EURO extends Currency {
    public EURO(CurrencyUpdates currencyUpdates) {
        this.currencyUpdates=currencyUpdates;
        this.currencyUpdates.addCurrencies(this);
    }

    @Override
    public void update() {
        float currentRate=currencyUpdates.getCurrentRate();
        currentRate/=69;
        System.out.printf("EURO:%.2f\n",currentRate);
    }
}
