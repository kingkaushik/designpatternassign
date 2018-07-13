package cab;

public class Chennai extends CabServices {
    private String city;
    private String cabType;

    public Chennai(String city, String cabType) {
        this.city = city;
        this.cabType = cabType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city=city;
    }

    @Override
    public String getCabType() {
        return cabType;
    }

    @Override
    public void setCabType(String cabType) {
        this.cabType=cabType;

    }
    public int getRate() {
        if (cabType.equalsIgnoreCase("mini")) {
            return 40;
        } else if (cabType.equalsIgnoreCase("micro")) {
            return 60;
        } else{
            return 80;
        }
    }
}

