package homeWork10.calculator;

public class Dividing implements Calculable {


    private double a;
    private  double b;

    public Dividing(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double execute() {
        return a/b;
    }
}
