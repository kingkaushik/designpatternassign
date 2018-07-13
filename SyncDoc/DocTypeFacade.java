package SyncDoc;

public class DocTypeFacade {
    private static AppointmentsBook appointmentsBook;

    public static void getAppointments(int ch,String name,int age)
    {
        switch(ch) {
            case 1:
                appointmentsBook=new Cardiologist();
                break;
            case 2:
                appointmentsBook=new Dermatologist();
                break;
            case 3:
                appointmentsBook=new ENTDoc();
                break;
            case 4:
                appointmentsBook=new Gerontologist();
                break;
            case 5:
                appointmentsBook=new Gynecologist();
                break;
            case 6:
                appointmentsBook=new Neurologist();
                break;
            case 7:
                appointmentsBook=new Orthopedician();
                break;
            case 8:
                appointmentsBook=new Pediatrician();
                break;
            case 9:
                appointmentsBook=new Psychologist();
                break;
            case 10:
                appointmentsBook=new Pyshician();
                break;
            default:
                System.out.println("wrong input....");
        }
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Doctype:"+appointmentsBook.getDocType());
        System.out.println("Appointment booked.....");
    }


}
