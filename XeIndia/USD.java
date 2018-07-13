package XeIndia;

public class USD extends Currency {
    public USD(CurrencyUpdates currencyUpdates) {
        this.currencyUpdates=currencyUpdates;
        this.currencyUpdates.addCurrencies(this);
    }

    @Override
    public void update() {
        float currentRate=currencyUpdates.getCurrentRate();
        currentRate/=65;
        System.out.printf("USD:%.2f\n",currentRate);
    }
}
