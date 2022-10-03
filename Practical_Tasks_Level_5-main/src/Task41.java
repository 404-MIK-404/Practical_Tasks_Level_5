import java.util.*;

public class Task41 {

    /**
     *
     * Создайте функцию, которая возвращает true, если две строки имеют один и тот же буквенный шаблон, и false в противном случае.
     *
     * Пример:
     * sameLetterPattern("ABAB", "CDCD") ➞ true
     *
     * sameLetterPattern("ABCBA", "BCDCB") ➞ true
     *
     * sameLetterPattern("FFGG", "CDCD") ➞ false
     *
     * sameLetterPattern("FFFF", "ABCD") ➞ false
     *
     * @param args
     */

    public static void main(String[] args)
    {
        String textOne,textTwo;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите текст: ");
        textOne = ui.nextLine();
        System.out.print("Введите текст: ");
        textTwo = ui.nextLine();

        if (sameLetterPattern(textOne).equals(sameLetterPattern(textTwo))){
            System.out.println("Результат: " + true);
        }
        else {
            System.out.println("Результат: " + false);
        }
    }

    public static String sameLetterPattern(String textOne)
    {
        HashMap<Character,Integer> resultLetter = new HashMap<>();
        int count = 0;
        for (int i = 0; i < textOne.length();i++){
            if (!resultLetter.containsKey(textOne.charAt(i))){
                resultLetter.put(textOne.charAt(i),count);
                count++;
            }

        }
        for (Map.Entry<Character,Integer> value : resultLetter.entrySet()){
            textOne = textOne.replace(value.getKey() + "", Integer.toString(value.getValue()) );
        }

        return textOne;
    }


}
