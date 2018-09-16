package homeWork10.inheritance;

public class Bus extends Vehicle {
    final String NAME = "bus";
    int weight;
    int maxSpeed;
    int fuelConsumption;
    char driverLicenceGrade;
    double acceleration;


    public Bus(int weight, int maxSpeed, int fuelConsumption, char driverLicenseGrade, double acceleration) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.driverLicenceGrade = driverLicenseGrade;
        this.acceleration = acceleration;
    }

    @Override
    public String  toString(){
        return NAME;
    }


    @Override
    int weight() {
        return weight;
    }

    @Override
    int maxSpeed() {
        return maxSpeed;
    }

    @Override
    int fuelConsumption() {
        return fuelConsumption;
    }

    @Override
    char driversLicenseGrade() {
        return driverLicenceGrade;
    }
}
