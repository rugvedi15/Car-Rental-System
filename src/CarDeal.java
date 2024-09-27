class CarDeal {
    private static int dealNo = 0;
    private String carName;
    private String carType;
    private double price;// Assuming price is a double
    private String carSite;
    private int dealno;

    public CarDeal(String carName, String carType, double price, String carSite) {
        this.carName = carName;
        this.carType = carType;
        this.price = price;
        this.carSite = carSite;
        this.dealno = ++dealNo;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%d. Car Name: %s%n   Car Type: %s%n   Price: $%.2f%n   Available at: %s%n",
                dealno, carName, carType, price, carSite);
    }
}
