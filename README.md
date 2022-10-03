# Практические задачи, уровень 5/6
Сделал Коршунов Михаил из группы БФИ1801


+ ## 	Создайте функцию, которая возвращает true, если две строки имеют один и тот же буквенный шаблон, и false в противном случае.

Пример:
```
sameLetterPattern("ABAB", "CDCD") ➞ true

sameLetterPattern("ABCBA", "BCDCB") ➞ true

sameLetterPattern("FFGG", "CDCD") ➞ false

sameLetterPattern("FFFF", "ABCD") ➞ false
```

+ ## 	Паутина определяется кольцами, пронумерованными от 0 до 4 от центра, и радиалами, помеченными по часовой стрелке сверху как A-H.

Создайте функцию, которая принимает координаты паука и мухи и возвращает кратчайший путь для паука, чтобы добраться до мухи.

Стоит отметить, что кратчайший путь должен быть рассчитан "геометрически", а не путем подсчета количества точек, через которые проходит этот путь. Мы могли бы это устроить:

Угол между каждой парой радиалов одинаков (45 градусов).

Расстояние между каждой парой колец всегда одинаково (скажем, "x").
 
На приведенном выше рисунке координаты паука - "H3", а координаты мухи - "E2". Паук будет следовать по кратчайшему пути "H3-H2-H1-A0-E1-E2", чтобы добраться до мухи.

Пример:
```
spiderVsFly("H3", "E2") ➞ "H3-H2-H1-A0-E1-E2"

spiderVsFly("A4", "B2") ➞ "A4-A3-A2-B2"

spiderVsFly("A4", "C2") ➞ "A4-A3-A2-B2-C2"
```

+ ## 	Создайте функцию, которая будет рекурсивно подсчитывать количество цифр числа. Преобразование числа в строку не допускается, поэтому подход является рекурсивным.

Пример:
```
digitsCount(4666) ➞ 4

digitsCount(544) ➞ 3

digitsCount(121317) ➞ 6

digitsCount(0) ➞ 1

digitsCount(12345) ➞ 5

digitsCount(1289396387328L) ➞ 13
```

+ ##   игроки пытаются набрать очки, формируя слова, используя буквы из 6-буквенного скремблированного слова. Они выигрывают раунд, если им удается успешно расшифровать слово из 6 букв.

Создайте функцию, которая принимает в массив уже угаданных слов расшифрованное 6-буквенное слово и возвращает общее количество очков, набранных игроком в определенном раунде, используя следующую рубрику:

3-буквенные слова-это 1 очко
4-буквенные слова-это 2 очка
5-буквенные слова-это 3 очка
6-буквенные слова-это 4 очка + 50 пт бонуса (за расшифровку слова)
Помните, что недопустимые слова (слова, которые не могут быть сформированы из 6-буквенных расшифрованных слов) считаются 0 очками.

Пример:
```
totalPoints(["cat", "create", "sat"], "caster") ➞ 2
// Since "create" is an invalid word.

totalPoints(["trance", "recant"], "recant") ➞ 108
// Since "trance" and "recant" score 54 pts each.

totalPoints(["dote", "dotes", "toes", "set", "dot", "dots", "sted"], "tossed") ➞ 13
// Since 2 + 3 + 2 + 1 + 1 + 2 + 2 = 13
```

Примечание:
- Если 6-буквенное слово имеет несколько анаграмм, считайте каждую 6-буквенную расшифровку дополнительными 54 очками. Например, если слово arches, а игрок угадал arches и chaser, добавьте 108 очков для обоих слов.
- Вы можете играть в Текстовый Твист здесь: http://text-twist2.com

5.	Последовательный прогон-это список соседних последовательных целых чисел. Этот список может быть как увеличивающимся, так и уменьшающимся. Создайте функцию, которая принимает массив чисел и возвращает длину самого длинного последовательного запуска.
longestRun([1, 2, 3, 5, 6, 7, 8, 9]) ➞ 5
// Two consecutive runs: [1, 2, 3] and [5, 6, 7, 8, 9] (longest).

Пример:
```
longestRun([1, 2, 3, 10, 11, 15]) ➞ 3
// Longest consecutive-run: [1, 2, 3].

longestRun([5, 4, 2, 1]) ➞ 2
// Longest consecutive-run: [5, 4] and [2, 1].

longestRun([3, 5, 7, 10, 15]) ➞ 1
// No consecutive runs, so we return 1.
```

+ ## 	Какой процент вы можете набрать на тесте, который в одиночку снижает средний балл по классу на 5%? Учитывая массив оценок ваших одноклассников, создайте функцию, которая возвращает ответ. Округлите до ближайшего процента.

Пример:
```
takeDownAverage(["95%", "83%", "90%", "87%", "88%", "93%"]) ➞ "54%"

takeDownAverage(["10%"]) ➞ "0%"

takeDownAverage(["53%", "79%"]) ➞ "51%"
```

+ ## Учитывая предложение с числами, представляющими расположение слова, встроенного в каждое слово, верните отсортированное предложение.

Пример:
```
rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s.") ➞ "I love Tesh just the way she is."

rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!") ➞ "Happiest birthday to the man of no steel!"

rearrange("is2 Thi1s T4est 3a") ➞ "This is a Test"

rearrange("4of Fo1r pe6ople g3ood th5e the2") ➞ "For the good of the people"

rearrange(" ") ➞ ""
```

+ ## 	Напишите функцию, которая делает первое число как можно больше, меняя его цифры на цифры во втором числе.

maxPossible(9328, 456) ➞ 9658
// 9658 is the largest possible number built from swaps from 456.
// 3 replaced with 6 and 2 replaced with 5.

Пример:
```
maxPossible(523, 76) ➞ 763

maxPossible(9132, 5564) ➞ 9655

maxPossible(8732, 91255) ➞ 9755
```

Примечание:
- Каждая цифра во втором числе может быть использована только один раз.
- Можно использовать ноль для всех цифр второго числа.

+ ## 	В этой задаче цель состоит в том, чтобы вычислить, сколько времени сейчас в двух разных городах. Вам дается строка cityA и связанная с ней строка timestamp (time in cityA) с датой, отформатированной в полной нотации США, как в этом примере:

"July 21, 1983 23:01"

Вы должны вернуть новую метку времени с датой и соответствующим временем в cityB, отформатированную как в этом примере:

"1983-7-22 23:01"

Список данных городов и их смещения по Гринвичу (среднее время по Гринвичу) приведены в таблице ниже.


| GMT | City |
| --- | ---- |
| - 08:00  | Los Angeles |
| - 05:00  | New York  |
| - 04:30  | Caracas  |
| - 03:00  | Buenos Aires  |
|   00:00  | London  |
|   + 01:00  | Rome  |
|   + 03:00  | Moscow  |
|   + 03:30  | Tehran  |
|   + 05:30  | New Delhi  |
|   + 08:00  | Beijing  |
|   + 10:00  | Canberra  |

Пример:
```
timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra") ➞ "2011-4-2 17:23"
// Can be a new day.

timeDifference("London", "July 31, 1983 23:01", "Rome") ➞ "1983-8-1 00:01"
// Can be a new month.

timeDifference("New York", "December 31, 1970 13:40", "Beijing") ➞ "1971-1-1 02:40"
// Can be a new year.
```

Примечание:
- Обратите внимание на часы и минуты, ведущий 0 необходим в возвращаемой метке времени, когда они представляют собой одну цифру.
- Обратите внимание на города с получасовыми смещениями.

+ ## 	Новое число-это число, которое не является перестановкой любого меньшего числа. 869-это не новое число, потому что это просто перестановка меньших чисел, 689 и 698. 509-это новое число, потому что оно не может быть образовано перестановкой любого меньшего числа (ведущие нули не допускаются).

Напишите функцию, которая принимает неотрицательное целое число и возвращает true, если целое число является новым числом, и false, если это не так.

Пример:
```
isNew(3) ➞ true

isNew(30) ➞ true

isNew(321) ➞ false

isNew(123) ➞ true
```
