import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Task47 {


    /**
     * Учитывая предложение с числами, представляющими расположение слова, встроенного в каждое слово, верните отсортированное предложение.
     *
     * rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s.") ➞ "I love Tesh just the way she is."
     *
     * rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!") ➞ "Happiest birthday to the man of no steel!"
     *
     * rearrange("is2 Thi1s T4est 3a") ➞ "This is a Test"
     *
     * rearrange("4of Fo1r pe6ople g3ood th5e the2") ➞ "For the good of the people"
     *
     * rearrange(" ") ➞ ""
     *
     *
     *
     * @param args
     */

    public static void main(String[] args)
    {

        Scanner ui = new Scanner(System.in);
        System.out.print("Количество элементов в массиве: ");
        String text  = ui.nextLine();
        rearrange(text);

    }

    public static void rearrange(String text)
    {
        String[] arrayText = text.split(" ");
        String[] arrayResult = new String[arrayText.length];
        for (int i = 0; i < arrayText.length;i++){
            Pattern pattern =  Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(arrayText[i]);
            int resultNumber = 0;
            while (matcher.find()){
                resultNumber = Integer.parseInt(matcher.group(0));
            }
            arrayText[i] = arrayText[i].replace(String.valueOf(resultNumber),"");
            arrayResult[resultNumber - 1] = arrayText[i];
        }
        System.out.println("Массив: " + Arrays.toString(arrayText));
        System.out.println("Результат: " + Arrays.stream(arrayResult).collect(Collectors.joining(" ")));
    }



}
