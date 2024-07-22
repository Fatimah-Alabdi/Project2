public class Route {
    private String startPickupAdress;
    private String destinationAddress;
    private double tripPrice;

    public Route(String startPickupAdress, String destinationAddress, double tripPrice) {
        this.startPickupAdress = startPickupAdress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

    public String getStartPickupAdress() {
        return startPickupAdress;
    }

    public void setStartPickupAdress(String startPickupAdress) {
        this.startPickupAdress = startPickupAdress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(float tripPrice) {
        this.tripPrice = tripPrice;
    }
}
