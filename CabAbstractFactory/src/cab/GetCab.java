package cab;

public class GetCab {
    public static  String cabTypes(int ch)
    {
        if(ch==1)
            return "press 1:Micro, 2:Mini, 3:SUV";
        else if(ch==2)
            return  "press 1:Micro, 2:Mini, 3:Sedan, 4:SUV";
        else
            return "press 1:Micro, 2:Mini, 3:Sedan";
    }
    public static String getCity(int ch)
    {
        if(ch==1)
            return "hyderabad";
        else if(ch==2)
            return "banglore";
        else
            return "chennai";
    }
    public static String getCabType(int ch1,int ch2)
    {
        if(ch1==1)
        {
            if(ch2==1)
                return "micro";
            else if(ch2==2)
                return "mini";
            else if(ch2==3)
                return "suv";
            return null;
        }
        else if(ch1==2)
        {
            if(ch2==1)
                return "micro";
            else if(ch2==2)
                return "mini";
            else if(ch2==3)
                return "sedan";
            else if(ch2==4)
                return "suv";
            return null;
        }
        else
        {
            if(ch2==1)
                return "micro";
            else if(ch2==2)
                return "mini";
            else if(ch2==3)
                return "sedan";
            return null;
        }
    }

    public static CabServicesAbstractFactory getCabServicesAbsFact(int ch1,int ch2)
    {
        if(ch1==1)
            return new HyderabadAbstractFactory(getCity(ch1),getCabType(ch1,ch2));
        else if(ch1==2)
            return new BangloreAbstractFactory(getCity(ch1),getCabType(ch1,ch2));
        else
            return new ChennaiAbstractFactory(getCity(ch1),getCabType(ch1,ch2));
    }
}

