package homeWork10.geometricalFigures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SquareCalculator {
    public static void main(String[] args) {

        Random random = new Random();

        Square square = new Square(random.nextInt((10 - 1) + 1) + 1);
        Rectagle rectagle = new Rectagle(random.nextInt((10 - 1) + 1) + 1, random.nextInt((10 - 1) + 1) + 1);
        Circle circle = new Circle(random.nextInt((10 - 1) + 1) + 1);

        //Prepare valid triangle sides...
        int sideA = random.nextInt((10 - 1) + 1) + 1;
        int sideB = random.nextInt((10 - 1) + 1) + 1;
        int cSideMin = sideA > sideB ? sideA - sideB+1 : sideB - sideA+1;
        int cSideMax = sideA + sideB - 1;
        int sideC = random.nextInt((cSideMax - cSideMin) + 1) + cSideMin;
        System.out.println("A"+sideA+" B"+sideB+" C"+sideC);
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        //create list of objects
        List<Shapes> list = new ArrayList<Shapes>();
        list.add(square);
        list.add(rectagle);
        list.add(circle);
        list.add(triangle);

        for (Shapes shp : list) {
            System.out.println(shp.calculateSquare());
        }

    }
}
