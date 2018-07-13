package subway;

public class Recipie {
    private int breadCost;
    private int saladCost;
    private int sauceCost;
    private int addonsCost;

    public Recipie(int breadCost, int saladCost, int sauceCost, int addonsCost) {
        this.breadCost = breadCost;
        this.saladCost = saladCost;
        this.sauceCost = sauceCost;
        this.addonsCost = addonsCost;
    }

    public Recipie(RecipieBuilder rb) {
        setBreadCost(rb.breadCost);
        setSauceCost(rb.sauceCost);
        setSaladCost(rb.saladCost);
        setAddonsCost(rb.addonsCost);
    }

    public int getBreadCost() {
        return breadCost;
    }

    public void setBreadCost(int breadCost) {
        this.breadCost = breadCost;
    }

    public int getSaladCost() {
        return saladCost;
    }

    public void setSaladCost(int saladCost) {
        this.saladCost = saladCost;
    }

    public int getSauceCost() {
        return sauceCost;
    }

    public void setSauceCost(int sauceCost) {
        this.sauceCost = sauceCost;
    }

    public int getAddonsCost() {
        return addonsCost;
    }

    public void setAddonsCost(int addonsCost) {
        this.addonsCost = addonsCost;
    }

    public static class RecipieBuilder
    {
        private int breadCost;
        private int saladCost;
        private int sauceCost;
        private int addonsCost;

        public RecipieBuilder setBreadCost(int breadCost) {
            this.breadCost = breadCost;
            return this;
        }

        public RecipieBuilder setSaladCost(int saladCost) {
            this.saladCost = saladCost;
            return  this;
        }

        public RecipieBuilder setSauceCost(int sauceCost) {
            this.sauceCost = sauceCost;
            return this;
        }
        public RecipieBuilder setAddonsCost(int addonsCost) {
            this.addonsCost = addonsCost;
            return this;
        }

        public Recipie build()
        {
            return new Recipie(this);
        }
    }

    @Override
    public String toString() {
        return "Total cost of ur orders";
    }
}
