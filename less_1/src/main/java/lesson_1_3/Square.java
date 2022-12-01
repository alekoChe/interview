package lesson_1_3;

public class Square extends Figure {
    private float sideSquare;

    public Square(float sideSquare) {
        this.sideSquare = sideSquare;
    }

    @Override
    float area() {
        return sideSquare * sideSquare;
    }
}
