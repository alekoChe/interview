package lesson_1_2;

class Lorry extends Car implements Moveable, Stopable {

    public Lorry(Engine engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    void open() {
        System.out.println("Car is open");
    }

    public void move(){
        System.out.println("Car is moving");
    }
    public void stop(){
        System.out.println("Car is stop");
    }

}

