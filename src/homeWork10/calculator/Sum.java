package homeWork10.calculator;

public class Sum implements Calculable {

    private double a;
    private  double b;

    public Sum(double a, double b){
        this.a=a;
        this.b=b;
    }

    public Sum(){

    }

    @Override
    public double execute() {
        return a+b;
    }
}
