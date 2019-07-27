package FileIO;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * FileIO - работа с файлами
 * В java для разделителя путей файлов предусмотрена статическая переменная File.separator
 * для окна она является '\' для пингвина '/'
 */
public class WorkWithFile {
    public static void main(String[] args) {
        String path = "root" + File.separator + "folder" + File.separator + "file.txt";
        System.out.println(path + "\n");

        //Файл или папка?
        File spec = new File("Folder");
        boolean isDir = spec.isDirectory();
        if(isDir){
            System.out.println("Folder \n");
        }else {
            System.out.println("File \n");
        }

        /**
         *   Метод getPath возвращает путь, который был у него при создания экземпляра.
         *   Это может быть как абсолютный путь - отсчитывающийся от корня диска,
         *   либо относительный - по отношению к текущей папке.
         *   Абсолютный путь можно получить вызовом методо getAbsolutePath
         */
        File TryViewPath = new File("file.txt");
        System.out.println("Относительный путь " + TryViewPath.getPath());
        System.out.println("Абсолютный путь " + TryViewPath.getAbsolutePath() + "\n");

        //Преобразование пути в url и обратно
        try{
            URL url = TryViewPath.toURL();
            System.out.println(url);

            File file =  new File(url.getFile());
            System.out.println(file.getPath() + "\n");
        } catch (MalformedURLException e) {
            System.out.println("Error " + e);
        }

        System.out.println("Файл создался " + CreateFile("file.txt"));
        System.out.println("Файл нашелся " + fileExists("file.txt"));
        System.out.println("Файл удалился " + DeleteFile("file.txt"));
    }

    public  static boolean fileExists(String fileName){
        boolean result = false;
        File f = null;

        try{
            f = new File(fileName);
            result = f.exists();
        } catch (SecurityException se) {
            //Если исключение поймано - значит - понадобились права
            //но файд существует
            result = true;
        } finally {
            if(f != null){
                f = null;
            }
        }
        return result;
    }

    //Создание и удадение файла
    public static boolean CreateFile(String name){
        boolean create = false;
        try{
            File fl = new File(name);
            create = fl.createNewFile();
            if(create){
                //был создан файл
            }else {
                //операции с существующим файлом
            }

        } catch (IOException e) {
            System.out.println("Error " + e);
        }
        return create;
    }

    public static boolean DeleteFile(String name){
        File fileDel = new File (name);
        return fileDel.delete();
    }

    //Рекурсивное удаление папок
    public static void deleteDir(String dirPath){
        //уцдаляемая папка
        File walkDir = new File (dirPath);
        //список элементов в папке
        String[] dirList = walkDir.list();

        for(int i = 0; i<dirList.length;i++){
            File f = new File(dirList[i]);
            if(f.isDirectory()){
                deleteDir(f.getPath());
            }
            f.delete();
        }
        walkDir.delete();
    }


    //Перемещение файла
    public static void translateFile(){
        File origin = new File("origin.txt");
        File folder = new File ("C:\\temp");

        File toname = new File (folder,origin.getName());

        boolean moved = origin.renameTo(toname);
        if(!moved){
            System.out.print("Файл не был перемещен");
        }
    }

}
