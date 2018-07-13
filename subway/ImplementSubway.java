package subway;

import java.util.Scanner;

public class ImplementSubway {
    public static void main(String[] args) {
        Bread bread=new Bread();
        Sauce sauce=new Sauce();
        Salad salad=new Salad();
        Addons addons=new Addons();
        int totalcost=0;
        Scanner sc=new Scanner(System.in);
        Recipie r=new Recipie.RecipieBuilder().setBreadCost(bread.getBreadCost()).setSauceCost(sauce.getSauceCost()).
                  setSaladCost(salad.getSaladCost()).setAddonsCost(addons.getAddonsCost()).build();
        while(true) {
            System.out.println("press 1:bread,2:sauce,3:salad,4:addons,5:exit");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    totalcost+=bread.getBreadCost();
                    break;
                case 2:
                    totalcost+=sauce.getSauceCost();
                    break;
                case 3:
                    totalcost+=salad.getSaladCost();
                    break;
                case 4:
                    totalcost+=addons.getAddonsCost();
                    break;
                case 5:
                    System.out.println(r+":"+totalcost);
                    System.exit(1);
                default:
                    System.out.println("Enter a valid choice");
            }
        }


    }
}
