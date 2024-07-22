public class SubscriberPassenger extends Passenger {
    public SubscriberPassenger(String name, String id) {
        super(name, id);
    }

    @Override
    public void reservedCar(Car car) throws Exception{
        if (car.getMaxCapacity()==0) {
            throw new Exception("Car is full.");


        }
        setReservedCar(car);
        setTripCost(car.getRoute().getTripPrice()*0.5);




    }
}
