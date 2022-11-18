package interview.lesson_1_3;

public class EquilateralTriangle extends Figure {
    private float sideEquilateralTriangle;

    public EquilateralTriangle(float sideEquilateralTriangle) {
        this.sideEquilateralTriangle = sideEquilateralTriangle;
    }

    @Override
    public float area() {
        return (float) ((Math.sqrt(3) * (sideEquilateralTriangle * sideEquilateralTriangle)) / 4);
    }

}
