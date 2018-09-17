package homeWork10.geometricalFigures;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Rectagle extends Shapes{
    int sideA;
    int sideB;

    public Rectagle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public BigDecimal calculateSquare() {
        return new BigDecimal(sideA*sideB, new MathContext(4,RoundingMode.HALF_UP));
    }
}
