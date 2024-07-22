public abstract class Passenger {
    private String name;
    private String id;
    private double tripCost;
    private Car reservedCar;
    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;


    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public double getTripCost() {
        return tripCost;
    }
    public Car getReservedCar() {
        return reservedCar;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }
    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }
    public abstract void reservedCar(Car car) throws Exception;
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Car Code:  " + reservedCar);
        System.out.println("Route Price: " + reservedCar);
        System.out.println("Trip Cost: " + tripCost);

    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "ID: " + id + "\n" +
                "Car Code: " + reservedCar.getCode() + "\n" +
                "Route Price: " + reservedCar.getRoute().getTripPrice() + "\n" +
                "Trip Cost: " + tripCost;
    }
}

