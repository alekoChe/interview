package interview.lesson_1_3;

public class Circle extends Figure{
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    float area() {
        return 3.14f * radius * radius;
    }
}
