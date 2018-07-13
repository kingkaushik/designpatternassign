package SyncDoc;

import java.util.Scanner;

public class ImplementFacade {
    public static void main(String[] args) {
        DocTypeFacade docTypeFacade=new DocTypeFacade();
        System.out.print("Enter Name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.print("Enter Age:");
        int age=sc.nextInt();
        System.out.println("Press 1:Cardiologist,2:Dermatologist 3:ENT 4:Gerontologist 5:Gynecologist");
        System.out.println("      6:Neurologist 7:Orthopedician 8:Pediatrician 9:Psychologist 10:Pyshician");
        int ch=sc.nextInt();
        docTypeFacade.getAppointments(ch,name,age);
    }
}
