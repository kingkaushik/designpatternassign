package XeIndia;


import java.util.ArrayList;
import java.util.List;

public class CurrencyUpdates {
    private List<Currency> currencies=new ArrayList<>();
    private float currentRate;

    public float getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(int currentRate) {
        this.currentRate = currentRate;
        notifyAllCurrencies();
    }

    public void addCurrencies(Currency currency)
    {
        currencies.add(currency);
    }
    private void notifyAllCurrencies() {
        for (Currency currency:currencies)
        {
            currency.update();
        }
    }



}
