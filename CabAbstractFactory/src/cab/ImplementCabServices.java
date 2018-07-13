package cab;

import java.util.Scanner;

public class ImplementCabServices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*CabServices srh=CabServicesFactory.getCabServices(new HyderabadAbstarctFactory("Hyderabad","Minor"));
        CabServices rcb=CabServicesFactory.getCabServices(new BangloreAbstarctFactory("Banglore","sedan"));
        CabServices csk=CabServicesFactory.getCabServices(new ChennaiAbstarctFactory("Chennai","Minor"));
        System.out.println(srh);*/
        System.out.println("press 1:hyderabad 2:banglore 3:chennai");
        int ch1=sc.nextInt();
        if(ch1>=1 && ch1<=3) {
            GetCab gc = new GetCab();
            String city = gc.getCity(ch1);
            System.out.println(gc.cabTypes(ch1));
            int ch2 = sc.nextInt();
            String cabType=gc.getCabType(ch1,ch2);
            CabServices cs=null;
            if(cabType==null)
                System.out.println("Invalid choice");
            else
            {
                cs=CabServicesFactory.getCabServices(gc.getCabServicesAbsFact(ch1,ch2));
                System.out.println(cs);
            }

        }
        else
            System.out.println("Invalid choice");
    }
}
