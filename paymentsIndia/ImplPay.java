package paymentsIndia;
import java.util.*;
public class ImplPay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mode=sc.nextLine();
        int amount=sc.nextInt();
        MainPay mp=Pay.payment(mode);
        System.out.println(mp);
        System.out.println("amount paid:"+amount);
    }
}
