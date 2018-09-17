package homeWork10.geometricalFigures;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Triangle extends Shapes{

    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public BigDecimal calculateSquare() {
        double halfPerimeter = calculatePerimeter() / 2;
        return new BigDecimal(Math.sqrt(
                halfPerimeter
                        * (halfPerimeter - sideA)
                        * (halfPerimeter - sideB)
                        * (halfPerimeter - sideC)
        ),new MathContext(4,RoundingMode.HALF_UP));
    }

    private  double calculatePerimeter() {
        return sideA + sideB + sideC;
    }


}
