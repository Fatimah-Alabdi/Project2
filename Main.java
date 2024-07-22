//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Route route1 = new Route("Address A", "Address B", 100);
            Route route2 = new Route("Address C", "Address D", 200);
            Route route3 = new Route("Address E", "Address F", 300);
            Route route4 = new Route("Address G", "Address H", 400);


            Car car1 = new Car("Car1", route1, 4);
            Car car2 = new Car("Car2", route2, 3);
            Car car3 = new Car("Car3", route3, 2);
            Car car4 = new Car("Car4", route4, 0);

            Passenger[] passengers = new Passenger[4];
            passengers[0] = new SubscriberPassenger("Faris", "111");
            passengers[1] = new NonSubscriberPassenger("Saif", "222", true);
            passengers[2] = new SubscriberPassenger("Fatimah", "333");
            passengers[3] = new NonSubscriberPassenger("Majd", "444", true);

            passengers[0].reservedCar(car1);
            passengers[1].reservedCar(car2);
            passengers[2].reservedCar(car3);
            passengers[3].reservedCar(car4);
            try {
                for (Passenger passenger : passengers) {
                    System.out.println(passenger);
                    System.out.println("-------------------------");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}