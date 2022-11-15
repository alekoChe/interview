package interview;

public class Foo {

    static {
        System.out.println("Hi!");
    }
    {
        System.out.println("Wau!");
    }

    public static void main(String[] args) {
        /** Если в майне ничего нет, метод из статического блока все равно запустится! */
        System.out.println("А теперь main!");
    }
}
