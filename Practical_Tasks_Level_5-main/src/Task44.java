import java.util.*;
import java.util.stream.Collectors;

public class Task44 {


    /**
     *
     * В   игроки пытаются набрать очки, формируя слова, используя буквы из 6-буквенного скремблированного слова. Они выигрывают раунд, если им удается успешно расшифровать слово из 6 букв.
     *
     * Создайте функцию, которая принимает в массив уже угаданных слов расшифрованное 6-буквенное слово и возвращает общее количество очков, набранных игроком в определенном раунде, используя следующую рубрику:
     *
     * 3-буквенные слова-это 1 очко
     * 4-буквенные слова-это 2 очка
     * 5-буквенные слова-это 3 очка
     * 6-буквенные слова-это 4 очка + 50 пт бонуса (за расшифровку слова)
     * Помните, что недопустимые слова (слова, которые не могут быть сформированы из 6-буквенных расшифрованных слов) считаются 0 очками.
     *
     * Пример:
     * totalPoints(["cat", "create", "sat"], "caster") ➞ 2
     * // Since "create" is an invalid word.
     *
     * totalPoints(["trance", "recant"], "recant") ➞ 108
     * // Since "trance" and "recant" score 54 pts each.
     *
     * totalPoints(["dote", "dotes", "toes", "set", "dot", "dots", "sted"], "tossed") ➞ 13
     * // Since 2 + 3 + 2 + 1 + 1 + 2 + 2 = 13
     *
     * Примечание:
     * - Если 6-буквенное слово имеет несколько анаграмм, считайте каждую 6-буквенную расшифровку дополнительными 54 очками. Например, если слово arches, а игрок угадал arches и chaser, добавьте 108 очков для обоих слов.
     * - Вы можете играть в Текстовый Твист здесь: http://text-twist2.com
     *
     *
     * @param args
     */

    public static void main(String[] args)
    {
        String finalWord;
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество слов которые вы впишите: ");
        int value  = ui.nextInt();
        List<String> arrayText = new ArrayList<>();
        ui.nextLine();
        for (int i = 0; i < value; i++ )
        {
            System.out.print("Введите " + (i+1) + " слово: ");
            String text = ui.nextLine();
            arrayText.add(text);
        }
        System.out.print("Слово из 6-и букв которое будет угадываться: ");
        finalWord = ui.nextLine();
        totalPoints(arrayText,finalWord);
    }

    public static void totalPoints(List<String> array, String finalWord)
    {
        List<Character> charFinalWord = finalWord.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        charFinalWord.sort(Comparator.naturalOrder());
        int score = 0;
        for (int i = 0; i < array.size();i++){

            List<Character> charWord = array.get(i).chars().mapToObj(e->(char)e).collect(Collectors.toList());
            charWord.sort(Comparator.naturalOrder());
            List<Character> charWordClone = new ArrayList<>(charWord);
            List<Character> charWordFinalClone = new ArrayList<>(charFinalWord);

            for (int j = 0; j < charWord.size();j++){
                if (charWordFinalClone.contains(charWord.get(j))){
                    charWordFinalClone.remove(0);
                    charWordClone.remove(0);
                }
            }

            if (charWordClone.isEmpty()){
                score += getResult(array.get(i));
            }

        }
        System.out.println("Слова которые были вписаны: " + array);
        System.out.println("Слово которое надо разгадать: " + finalWord);
        System.out.println("Количество очков: " + score);
    }


    public static int getResult(String lengthText){
        switch (lengthText.length()){
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 54;
            default:
                return 0;
        }
    }


}
