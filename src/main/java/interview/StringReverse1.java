package interview;

public class StringReverse1 {
    /** Напишите программу на Java для переворачивания строки, изменив расположение символов
     * в строке задом наперёд без использования встроенных в String функций.
      */


    public static void main(String[] args) {
        String str = "Task1";
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        strB = strB.reverse();
        System.out.println(strB);
    }
}
