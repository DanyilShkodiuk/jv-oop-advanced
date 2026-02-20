package core.basesyntax.figures;

import core.basesyntax.colors.ColorSupplier;
import core.basesyntax.figures.shapes.Circle;
import core.basesyntax.figures.shapes.IsoscelesTrapezoid;
import core.basesyntax.figures.shapes.Rectangle;
import core.basesyntax.figures.shapes.RightTriangle;
import core.basesyntax.figures.shapes.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureIndex) {
            case 0:
                return new Square(color, random.nextInt(10) + 1);
            case 1:
                return new Rectangle(color, random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 2:
                return new RightTriangle(color, random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 3:
                return new Circle(color, random.nextInt(10) + 1);
            case 4:
            default:
                return new IsoscelesTrapezoid(color, random.nextInt(10) + 1,
                        random.nextInt(10) + 1, random.nextInt(10) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
