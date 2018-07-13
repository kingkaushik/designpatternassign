package XeIndia;

import java.util.Scanner;

public class ImplementObserverPattern {
    public static void main(String[] args) {
        CurrencyUpdates currencyUpdates=new CurrencyUpdates();
        new USD(currencyUpdates);
        new GBP(currencyUpdates);
        new EURO(currencyUpdates);
        System.out.print("Enter amount in Indian Rupees:");
        Scanner sc=new Scanner(System.in);
        currencyUpdates.setCurrentRate(sc.nextInt());
    }
}
