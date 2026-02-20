package core.basesyntax.Figures;

import core.basesyntax.Interfaces.AreaCalculator;
import core.basesyntax.Interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
