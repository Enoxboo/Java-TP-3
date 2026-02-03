public final class TPE {
    private static TPE instance;

    private Float revenue;

    private TPE() {
        this.revenue = 0.0f;
    }

    public void pay(Float amount) {
        this.revenue += amount;
    }

    public void reset() {
        this.revenue = 0.0f;
    }

    public static TPE getInstance() {
        if (instance == null) {
            instance = new TPE();
        }
        return instance;
    }

    public Float getRevenue() {
        return revenue;
    }
}