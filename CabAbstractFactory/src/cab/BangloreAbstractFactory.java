package cab;

public class BangloreAbstractFactory implements CabServicesAbstractFactory {
    private String city;
    private String cabType;

    public BangloreAbstractFactory(String city, String cabType) {
        this.city = city;
        this.cabType = cabType;
    }

    @Override
    public CabServices createCabServices() {
        return new Banglore(city,cabType);
    }
}
