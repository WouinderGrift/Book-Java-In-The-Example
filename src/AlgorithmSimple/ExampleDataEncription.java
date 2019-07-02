package AlgorithmSimple;
import java.io.*;
import sun.misc.*;

/**
 * Пример шифрования данных
 * Програма должна быть запущенна по крайней мере с одним параметром -
 * строкой, подлежащую шифрованию
 */

public class ExampleDataEncription {
    public static void main(String[] args) {

        //кодирование текста
        String text = "Hello World!";
        BASE64Encoder enc = new BASE64Encoder();
        String encoded = enc.encode(text.getBytes());
        enc = null;

        //декодирование текста
        String decoded = null;
        try{
            BASE64Decoder dec = new BASE64Decoder();
            decoded = new String(dec.decodeBuffer(encoded));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //вывод результатов
        System.out.println("Закодировано: " + encoded);
        System.out.println("Декодированно: " + decoded);

        encoded = null;
        decoded = null;
    }
}
