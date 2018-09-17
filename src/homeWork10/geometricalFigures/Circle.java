package homeWork10.geometricalFigures;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Circle extends Shapes {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calculateSquare() {
        return new BigDecimal(Math.PI * Math.pow(radius, 2),new MathContext(4,RoundingMode.HALF_UP));
    }
}
