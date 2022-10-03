import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
import java.text.*;
import java.util.stream.Collectors;

public class Task49 {


    /**
     *
     * В этой задаче цель состоит в том, чтобы вычислить, сколько времени сейчас в двух разных городах.
     * Вам дается строка cityA и связанная с ней строка timestamp (time in cityA) с датой, отформатированной в полной нотации США, как в этом примере:
     *
     * "July 21, 1983 23:01"
     *
     * Вы должны вернуть новую метку времени с датой и соответствующим временем в cityB, отформатированную как в этом примере:
     *
     * "1983-7-22 23:01"
     *
     * Список данных городов и их смещения по Гринвичу (среднее время по Гринвичу) приведены в таблице ниже.
     *
     * GMT	City
     * - 08:00	Los Angeles
     * - 05:00	New York
     * - 04:30	Caracas
     * - 03:00	Buenos Aires
     * 00:00	London
     * + 01:00	Rome
     * + 03:00	Moscow
     * + 03:30	Tehran
     * + 05:30	New Delhi
     * + 08:00	Beijing
     * + 10:00	Canberra
     *
     * Пример:
     * timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra") ➞ "2011-4-2 17:23"
     * // Can be a new day.
     *
     * timeDifference("London", "July 31, 1983 23:01", "Rome") ➞ "1983-8-1 00:01"
     * // Can be a new month.
     *
     * timeDifference("New York", "December 31, 1970 13:40", "Beijing") ➞ "1971-1-1 02:40"
     * // Can be a new year.
     *
     * Примечание:
     * - Обратите внимание на часы и минуты, ведущий 0 необходим в возвращаемой метке времени, когда они представляют собой одну цифру.
     * - Обратите внимание на города с получасовыми смещениями.
     *
     *
     * @param args
     * @throws ParseException
     */


    public static void main(String[] args) throws ParseException {

        Scanner ui = new Scanner(System.in);
        HashMap<String,String> cityGMT = new HashMap<String,String>();
        initHashMapValue(cityGMT);

        System.out.print("Город №1: ");
        String cityOne  = ui.nextLine();
        System.out.print("Город №2: ");
        String cityTwo  = ui.nextLine();
        System.out.print("Дата (Пример заполнение April 7, 2010 20:30) : ");

        String datetext = ui.nextLine();
        String[] array = datetext.split("[ ]|[,]");
        List<String> arrayText = Arrays.stream(array).filter(e->!e.isEmpty()).collect(Collectors.toList());
        for (int i = 0 ; i < arrayText.size();i++){
            if (i == 1 || i == 2){
                arrayText.set(i,arrayText.get(i) + ",");
            }
        }

        String date = arrayText.stream().collect(Collectors.joining(" "));
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy, HH:mm",Locale.US);
        cal.setTime(sdf.parse(date));
        System.out.println(cal);
        timeDifference(cal,cityOne,cityTwo,cityGMT);
    }

    public static void initHashMapValue(HashMap<String,String> cityGMT){

        cityGMT.put("Los Angeles","-8.00");
        cityGMT.put("New York","-5.00");
        cityGMT.put("Caracas","-4.30");
        cityGMT.put("Buenos Aires","-3.00");
        cityGMT.put("London","0.00");
        cityGMT.put("Rome","1.00");
        cityGMT.put("Moscow","3.00");
        cityGMT.put("Tehran","3.30");
        cityGMT.put("New Delhi","5.30");
        cityGMT.put("Beijing","8.00");
        cityGMT.put("Canberra","10.00");

    }


    public static void timeDifference(Calendar time,String cityOne,String cityTwo,HashMap<String,String> cityGMT){
        double cityOneValue = Double.parseDouble(cityGMT.get(cityOne));
        double cityTwoValue = Double.parseDouble(cityGMT.get(cityTwo));
        double resultTime = Math.abs(cityOneValue) + Math.abs(cityTwoValue);
        String[] array = String.valueOf(resultTime).split("\\.");
        time.add(Calendar.HOUR, Integer.parseInt(array[0]));
        time.add(Calendar.MINUTE,Integer.parseInt(array[1]));
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String formatted = format1.format(time.getTime());
        System.out.println(formatted);
    }



}
