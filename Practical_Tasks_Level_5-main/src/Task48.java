import java.util.*;
import java.util.stream.Collectors;

public class Task48 {


    /**
     *
     *
     * Напишите функцию, которая делает первое число как можно больше, меняя его цифры на цифры во втором числе.
     *
     * maxPossible(9328, 456) ➞ 9658
     * // 9658 is the largest possible number built from swaps from 456.
     * // 3 replaced with 6 and 2 replaced with 5.
     *
     * Пример:
     * maxPossible(523, 76) ➞ 763
     *
     * maxPossible(9132, 5564) ➞ 9655
     *
     * maxPossible(8732, 91255) ➞ 9755
     *
     * Примечание:
     * - Каждая цифра во втором числе может быть использована только один раз.
     * - Можно использовать ноль для всех цифр второго числа.
     *
     *
     *
     * @param args
     */

    public static void main(String[] args)
    {

        Scanner ui = new Scanner(System.in);
        System.out.print("Первое число: ");
        int valueone  = ui.nextInt();
        System.out.print("Второе число: ");
        int valuetwo  = ui.nextInt();
        maxPossble(valueone,valuetwo);

    }

    public static void  maxPossble(int valueOne,int valueTwo)
    {
        StringBuilder valueResult = new StringBuilder(String.valueOf(valueOne));
        List<Integer> valueTwoArray = String.valueOf(valueTwo).chars().mapToObj(e -> Integer.parseInt((char) e + "")).sorted().collect(Collectors.toList());
        for (int i = 0; i < valueResult.length();i++){

            String value = valueResult.charAt(i) + "";

            for (int j = 0; j < valueTwoArray.size();j++){
                int maxValue = Collections.max(valueTwoArray);
                if (maxValue > Integer.parseInt(value)){
                    valueResult.replace(i,i+1,Integer.toString(maxValue));
                    valueTwoArray.remove(Collections.binarySearch(valueTwoArray,maxValue));
                    break;
                }
            }

        }
        System.out.print("Результат: " + valueResult.toString());
    }


}
