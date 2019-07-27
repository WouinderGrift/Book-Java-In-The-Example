package FileIO;

import java.io.File;
import java.io.IOException;

/**
 * Создание временных файлов
 * createTempFile может быть с двумя или с тремя параметрами:
 * первый - указываем префикс файла
 * второй - указываем суффикс
 * третий - указываем папку, где будет создан файл
 */
public class TempFiles {
    public static void main(String[] args) {

    }

    public static File createTempFile(String prefix, String suffix) {
        File temp = null;
        try {
            temp = File.createTempFile(prefix, suffix);
            //удалит по завершению программы
            temp.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
        return temp;
    }

}
