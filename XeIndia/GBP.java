package XeIndia;

public class GBP extends Currency {
    public GBP(CurrencyUpdates currencyUpdates) {
        this.currencyUpdates=currencyUpdates;
        this.currencyUpdates.addCurrencies(this);
    }

    @Override
    public void update() {
        float currentRate=currencyUpdates.getCurrentRate();
        currentRate/=80;
        System.out.printf("GBP:%.2f\n",currentRate);
    }
}
