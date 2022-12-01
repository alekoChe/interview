package lesson_2;

public class AppLess_2 {
    public static void main(String[] args) {

        AnalogArrayList<Integer> list = new AnalogArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add(i);
        }

        for (int i = 0; i < 64; i++) {
            System.out.println(i + " - " + list.get(i));
        }

        list.insert(3, 333);

        for (int i = 0; i < 64; i++) {
            System.out.println(i + " - " + list.get(i));
        }

        list.delete(3);

        for (int i = 0; i < 64; i++) {
            System.out.println(i + " - " + list.get(i));
        }

    }
}
