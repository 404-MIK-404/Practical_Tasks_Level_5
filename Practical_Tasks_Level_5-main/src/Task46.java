import java.util.*;

public class Task46 {


    /**
     *
     * Какой процент вы можете набрать на тесте, который в одиночку снижает средний балл по классу на 5%? Учитывая массив оценок ваших одноклассников, создайте функцию, которая возвращает ответ. Округлите до ближайшего процента.
     *
     * Пример:
     * takeDownAverage(["95%", "83%", "90%", "87%", "88%", "93%"]) ➞ "54%"
     *
     * takeDownAverage(["10%"]) ➞ "0%"
     *
     * takeDownAverage(["53%", "79%"]) ➞ "51%"
     *
     *
     * @param args
     */


    public static void main(String[] args)
    {

        Scanner ui = new Scanner(System.in);
        System.out.print("Количество одноклассников: ");
        int value  = ui.nextInt();
        int[] array = new int[value];
        ui.nextLine();
        for (int i = 0; i < value; i++)
        {
            System.out.print("Процент прохождения теста: ");
            array[i] = (ui.nextInt() - 5);
        }

        System.out.print("Результат: " + takeDownAverage(array) + " %");

    }

    public static int takeDownAverage(int[] array)
    {
        int count = 0;
        for (int i = 0; i < array.length;i++)
        {
            count += array[i];
        }
        return Math.round(count/array.length) - (5 * array.length);
    }


}
