package homeWork10.inheritance;

public class PlayWithVehicles {
    public static void main(String[] args) {
        Car car = new Car(1500, 260, 8, 'B', 7.6);
        Truck truck = new Truck(1000, 120, 30, 'D', 20);
        Bus bus=new Bus(9000,110,20,'C',18);

        System.out.println(buildMessage(car));
        System.out.println(buildMessage(truck));
        System.out.println(buildMessage(bus));



        //Compare cars
        System.out.println("Are these vehicles equals? "+car.equals(truck));

        Car carOne=new Car(1500, 260, 8, 'B', 7.6);
        System.out.println("Are these vehicles equals? "+car.equals(carOne));
    }

    public static String buildMessage(Vehicle vehicle) {
        return new StringBuilder("Name:")
                .append(vehicle.toString())                                 //Object.toString Overdrive
                .append(", weight:").append(vehicle.weight())
                .append(", max speed:").append(vehicle.maxSpeed())
                .append("km/h")
                .append(", fuel consumption:").append(vehicle.fuelConsumption())
                .append(" litres/100km")
                .append(", required driving licence:").append(vehicle.driversLicenseGrade())
                .toString();
    }
}
