import java.util.*;


public class Task50 {

    /**
     *
     * Новое число-это число, которое не является перестановкой любого меньшего числа. 869-это не новое число, потому что это просто перестановка меньших чисел, 689 и 698. 509-это новое число, потому что оно не может быть образовано перестановкой любого меньшего числа (ведущие нули не допускаются).
     *
     * Напишите функцию, которая принимает неотрицательное целое число и возвращает true, если целое число является новым числом, и false, если это не так.
     *
     * Пример:
     * isNew(3) ➞ true
     *
     * isNew(30) ➞ true
     *
     * isNew(321) ➞ false
     *
     * isNew(123) ➞ true
     *
     *
     *
     * @param args
     */

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Число: ");
        int value  = ui.nextInt();
        System.out.print("Результа: " + isNew(value));

    }

    public static boolean isNew(int value)
    {
        String temp = Integer.toString(value);
        int valuecheck = Character.getNumericValue(temp.charAt(0));
        for (int i = 1; i < temp.length();i++)
        {
            int chec =  Character.getNumericValue(temp.charAt(i));
            if (valuecheck > chec && chec != 0)
            {
                return false;
            }
        }
        return true;
    }


}
