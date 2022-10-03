import java.util.*;

public class Task45 {

    /**
     *
     * Последовательный прогон-это список соседних последовательных целых чисел. Этот список может быть как увеличивающимся, так и уменьшающимся. Создайте функцию, которая принимает массив чисел и возвращает длину самого длинного последовательного запуска.
     * longestRun([1, 2, 3, 5, 6, 7, 8, 9]) ➞ 5
     * // Two consecutive runs: [1, 2, 3] and [5, 6, 7, 8, 9] (longest).
     *
     * Пример:
     * longestRun([1, 2, 3, 10, 11, 15]) ➞ 3
     * // Longest consecutive-run: [1, 2, 3].
     *
     * longestRun([5, 4, 2, 1]) ➞ 2
     * // Longest consecutive-run: [5, 4] and [2, 1].
     *
     * longestRun([3, 5, 7, 10, 15]) ➞ 1
     * // No consecutive runs, so we return 1.
     *
     *
     * @param args
     */


    public static void main(String[] args)
    {

        Scanner ui = new Scanner(System.in);
        System.out.print("Количество элементов в массиве: ");
        int value  = ui.nextInt();
        int[] array = new int[value];
        for (int i = 0; i < array.length; i++ )
        {
            array[i] = (int) (Math.random() * 16 + 5);
        }
        longestRun(array);

    }

    public static void longestRun(int[] array)
    {
        ArrayList<Integer> arrayValue = new ArrayList<>();
       Arrays.sort(array);
       int result = 0;
       for (int i = 0; i < array.length-1;i++){
           if (array[i + 1] - array[i] == 1){
               arrayValue.add(array[i]);
           }
           else {
               if (arrayValue.size() + 1 > result){
                   result = arrayValue.size() + 1;
                   arrayValue.clear();
               }
           }
       }
       if (arrayValue.size() + 1 > result){
           result = arrayValue.size() + 1;
       }
       System.out.println("Массив: " + Arrays.toString(array));
       System.out.println("Результат: " + result);
    }


}
