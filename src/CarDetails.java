class CarDetails {
    private String carName;
    private String site;
    private double price;
    private double rating;
    private int passengers;

    public CarDetails(String carName, String site, double price, double rating) {
        this.carName = carName;
        this.site = site;
        this.price = price;
        this.rating = rating;
        this.passengers = passengers;
    }

    public String getCarName() {
        return carName;
    }

    public String getSite() {
        return site;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getPassengers() {
        return passengers;
    }
}
