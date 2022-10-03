import java.util.*;

public class Task43 {

    /**
     * Создайте функцию, которая будет рекурсивно подсчитывать количество цифр числа. Преобразование числа в строку не допускается, поэтому подход является рекурсивным.
     *
     * digitsCount(4666) ➞ 4
     *
     * digitsCount(544) ➞ 3
     *
     * digitsCount(121317) ➞ 6
     *
     * digitsCount(0) ➞ 1
     *
     * digitsCount(12345) ➞ 5
     *
     * digitsCount(1289396387328L) ➞ 13
     *
     *
     *
     * @param args
     */


    public static void main(String[] args)
    {
        long value;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите число: ");
        value = ui.nextLong();
        System.out.print(digitsCount(value));
    }



    public static int digitsCount(long value)
    {
        return (int) Math.ceil(Math.log10(value + 2));
    }


}
