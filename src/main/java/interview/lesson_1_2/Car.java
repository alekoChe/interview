package interview.lesson_1_2;

abstract class Car {
    public Engine engine;
    private String color;
    private String name;

    public Car(Engine engine, String color, String name) {
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    protected void start() {
        System.out.println("Car starting");
    }

    abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
