package FileIO;

import java.io.File;
import java.util.Date;

/**
 * Просмотр свойств файлов
 */

public class LookProperties {
    public static void main(String[] args) {
        sizeFile();
        dateOfLastChangesFile();
        setNowTime();
        renameFile();
    }

    //Размер файла в байтах
    public static long sizeFile(){
        File file = new File("file.txt");
        return file.length();
    }

    //Время последнего изменения в милисекундах между 1 января 1970 года и желаемым временем
    public static void dateOfLastChangesFile(){
        File f = new File("file.txt");
        long TimeChanges = f.lastModified();
        Date d = new Date(TimeChanges);
        System.out.println(d);
    }

    //Установка последнего изменения файла
    public static void setNowTime(){
        //текущее время системы
        long timeNow = System.currentTimeMillis();
        File f = new File("file.txt");
        boolean touch = f.setLastModified(timeNow);
        if(!touch){
            System.err.println("Не удалось установить время");
        }
    }

    //Переименовывание файла
    public static void renameFile(){
        File oldFile = new File("old.txt");
        File newFile = new File("new.txt");

        boolean rename = oldFile.renameTo(newFile);
        if(!rename) {
            System.out.println("Файл не был переименован");
        }
    }

}
