package cab;

public class HyderabadAbstractFactory implements CabServicesAbstractFactory {
    private String city;
    private String cabType;

    public HyderabadAbstractFactory(String city, String cabType) {
        this.city = city;
        this.cabType = cabType;
    }

    @Override
    public CabServices createCabServices() {
        return new Hyderabad(city,cabType);
    }
}
