package cab;

public abstract class CabServices {
    private String city;
    private String cabType;
    private int rate;

    public abstract String getCity() ;

    public abstract void setCity(String city) ;

    public abstract String getCabType() ;

    public abstract void setCabType(String cabType);

    public abstract int getRate();

    @Override
    public String toString() {
        return getCity()+":\n"+getCabType()+":"+getRate();
    }
}
