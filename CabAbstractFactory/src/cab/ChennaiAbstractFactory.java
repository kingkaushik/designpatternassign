package cab;

public class ChennaiAbstractFactory implements  CabServicesAbstractFactory {
    private String city;
    private String cabType;

    public ChennaiAbstractFactory(String city, String cabType) {
        this.city = city;
        this.cabType = cabType;
    }

    @Override
    public CabServices createCabServices() {
        return new Chennai(city,cabType);
    }
}
