package homeWork10.inheritance;

public abstract class Vehicle {



    abstract int weight();

    abstract int maxSpeed();

    abstract int fuelConsumption();

    abstract char driversLicenseGrade();



    public boolean equals(Vehicle b) {
        boolean isEqual = false;
        if (compareString(this.toString(), b.toString()) &&
                compareInt(this.weight(), b.weight()) &&
                compareInt(this.maxSpeed(), b.maxSpeed()) &&
                compareInt(this.fuelConsumption(), b.fuelConsumption())&&
                compareInt(this.driversLicenseGrade(),b.driversLicenseGrade())) {
            isEqual = true;
        }
        return isEqual;
    }

    public boolean compareString(String a, String b) {
        boolean isEqual = false;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(i)) {
                    isEqual = true;
                }
            }
        }
        return isEqual;
    }

    public boolean compareInt(int a, int b) {
        boolean isEqual = false;
        if (a == b) {
            isEqual = true;
        }
        return isEqual;
    }

}
