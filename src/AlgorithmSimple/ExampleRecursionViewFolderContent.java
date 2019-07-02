package AlgorithmSimple;

import java.io.File;

/**
 * Пример рекукрсивного просмотра содержимого папки
 */

public class ExampleRecursionViewFolderContent {
    public static void sameDateToDirFiles(String dir){
        long modifiled = System.currentTimeMillis();
        File walkDir = new File(dir);   //просматриваемая папка
        String[] dirList = walkDir.list();

        //последовательный просмотр папки
        for(int i = 0; i<dirList.length; i++){
            File f = new File(dirList[i]);
            if(f.isDirectory()){
                //элемент является также каталогом, осуществляется
                //рекурсивный вызов метода
                sameDateToDirFiles(f.getPath());
                continue;
            }
            //для файлов устанавливаем дату последнего изменения
            f.setLastModified(modifiled);
        }
    }

}
