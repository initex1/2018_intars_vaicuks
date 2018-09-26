package homeWork10.calculator;

public class Subtraction implements Calculable {

    private double a;
    private  double b;

    public Subtraction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double execute() {
        return a-b;
    }
}
