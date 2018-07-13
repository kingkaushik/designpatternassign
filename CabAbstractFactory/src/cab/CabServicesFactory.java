package cab;

public class CabServicesFactory {
    public static CabServices getCabServices(CabServicesAbstractFactory factory)
    {
        return factory.createCabServices();
    }
}
