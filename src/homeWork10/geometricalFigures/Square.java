package homeWork10.geometricalFigures;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Square extends Shapes {

    int sideA;
    final int CORNER_COUNT = 4;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public BigDecimal calculateSquare() {
        return new BigDecimal((sideA * CORNER_COUNT), new MathContext(4,RoundingMode.HALF_UP));
    }

}
