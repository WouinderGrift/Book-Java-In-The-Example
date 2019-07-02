package String;

import com.sun.org.apache.regexp.internal.RE;

import javax.swing.*;
import java.util.SimpleTimeZone;

/**
 * Created by Dima on 30.06.2019.
 */

abstract class AbsractDemo{
    abstract String demo();
}

/**
 * Конкат - соединяет строки, а именно создает новый объект содержащую полную строку
 */
class Concat extends AbsractDemo{
    String str, sentence;

    Concat(String str, String sentence){
        this.str = str;
        this.sentence = sentence;
    }

    @Override
    String demo() {
        System.out.println(str);
        System.out.println(sentence);

        return "Конкат: " + str.concat(sentence);
    }
}

/**
 * Еще одно слияние строк
 */
class OptimizeStringOperation extends AbsractDemo{
    String s1, s3;
    OptimizeStringOperation(String s1, String s3){
        this.s1 = s1;
        this.s3 = s3;
    }

    @Override
    String demo() {
        return "Сложение строк: " + s1+s3;
    }
}

/**
 * Класс СтроковогоБуффера во время своей инициализации с помощью конструктора по умолчанию
 * выделяет память на 16 символов. Компилятор при вызове метода Аппенд вынужден выделить доп.
 * память, что с каждым новым вызовом снижает эфективность. По этому лучше взоранее высчитать количество символов.
 */
class DemoStringBuffer extends AbsractDemo{
    String s1, s3;
    DemoStringBuffer(String s1, String s3){
        this.s1 = s1;
        this.s3 = s3;
    }

    @Override
    String demo() {
        StringBuffer stringBuffer = new StringBuffer(53);
        stringBuffer.append(s1);
        stringBuffer.append(s3);
        return "Строковый Буффер: " + stringBuffer.toString();
    }
}

/**
 * Извлечение строки, в качестве параметров указываем начало и конец нужной части строки
 */
class ExtractChapterString extends AbsractDemo{
    int start, end;
    String greetings;
    ExtractChapterString(int start, int end, String greetings){
        this.start = start;
        this.end = end;
        this.greetings = greetings;
    }

    @Override
    String demo() {
        return "Извлечение строки:\n" + "Было: " + greetings + "\nСтало: " + greetings.substring(start, end);
    }
}

/**
 * Поиск текста - для первого вхождения в строку есть метод indexOf(),
 * для последнего lastIndexOf() возвращают они позицию первого символа искомой строки
 */
class FindText extends AbsractDemo{
    String greetings;
    FindText(String greetings){
     this.greetings = greetings;
    }

    @Override
    String demo() {
        return "Поиск текста:" +
                "\nПолное слово: " + greetings
                + "\nПервое вхождение: " + greetings.indexOf("e")
                + "\nПоследнее вхождение: " + greetings.lastIndexOf("o")
                + "\nНичего не найденно: " + greetings.lastIndexOf("x");
    }
}

/**
 * Проверка на наличие записи в начале или в конце текста
 */
class CheckBeginOrEndenText extends AbsractDemo{
    String str;
    CheckBeginOrEndenText(String str){
        this.str = str;
    }

    @Override
    String demo() {
        return "Проверка на наличие записи в начале и конце текста:" +
                "\nВесь текст: " + str
                + "\nСлово начинается на 'Hell'? " + str.startsWith("Hell")
                + "\nСлово заканчивается на 'Universe'? " + str.endsWith("Universe");
    }
}

/**
 * Извлечение символа из строки charAt(int numChar)
 */
class ExtractCharFromString extends AbsractDemo{
    String hw;
    ExtractCharFromString(String hw){
        this.hw = hw;
    }

    @Override
    String demo() {
        return "Извлечение символа из строки: "
                + "\nПолная строка: " + hw
                + "\nИзвлекаем 6й символ: " + hw.charAt(6); //считаем с 0
    }
}

/**
 * Замена символов в строке
 */
class ReplaceCharInString extends AbsractDemo{
    String hw;
    ReplaceCharInString(String hw){
        this.hw = hw;
    }

    @Override
    String demo() {
        return hw.replace("o", "a");
    }
}

/**
 * Замена части строки
 */
class ChangeRegistryInString extends AbsractDemo{
    String greetings;
    ChangeRegistryInString(String greetings){
        this.greetings = greetings;
    }

    @Override
    String demo() {
        return "Изменение регистра"
                + "\nНижний регистр: "  + greetings.toLowerCase()
                + "\nВерхний регистр: " + greetings.toUpperCase();
    }
}

public class ExamplesString {
    public static void main(String[] args) {
        Concat exampleOne = new Concat("Красота спасет", " мир");
        OptimizeStringOperation optimizeStringOperation = new OptimizeStringOperation("Произвольная строка символов - ", "присоединенная строка");
        DemoStringBuffer demoStringBuffer = new DemoStringBuffer("Произвольная строка символов - ", "присоединенная строка");
        ExtractChapterString extractChapterString = new ExtractChapterString(6,11, "Hello World!");
        FindText findText = new FindText(extractChapterString.greetings);
        CheckBeginOrEndenText checkBeginOrEndenText = new CheckBeginOrEndenText("Hello from Universe");
        ExtractCharFromString extractCharFromString = new ExtractCharFromString(extractChapterString.greetings);
        ReplaceCharInString replaceCharInString = new ReplaceCharInString(extractCharFromString.hw);
        ChangeRegistryInString changeRegistryInString = new ChangeRegistryInString(extractChapterString.greetings);


        AbsractDemo[] ad = {exampleOne, optimizeStringOperation, demoStringBuffer, extractChapterString
        ,findText, checkBeginOrEndenText, extractCharFromString, replaceCharInString, changeRegistryInString
        };
        for(int i = 0; i < ad.length; i++){
            JOptionPane.showMessageDialog(null, ad[i].demo());
        }
    }
}
