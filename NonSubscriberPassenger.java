public class NonSubscriberPassenger extends Passenger {
    boolean discountCoupon;

    public NonSubscriberPassenger(String name, String id,boolean discountCoupon) {
        super(name, id);
        this.discountCoupon = discountCoupon;

    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reservedCar(Car car) throws Exception {
        if (car.getMaxCapacity()==0) {
            throw new Exception("Car is full.");


        }
        setReservedCar(car);
        if (discountCoupon) {
            setTripCost(car.getRoute().getTripPrice() * 0.9);
        } else {
            setTripCost(car.getRoute().getTripPrice());
        }

    }
}
