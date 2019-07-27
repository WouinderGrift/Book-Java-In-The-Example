package FileIO;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Рекурсивная упаковка в zip
 */

class ZipDir {
    public static void exec(String zipFile, String zippedDir) throws FileNotFoundException, IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));
        walkingDir(zos, zippedDir);
        zos.close();
    }

    public static void walkingDir(ZipOutputStream zos, String zippedDir) {
        File zipDir = new File(zippedDir);
        String[] dirList = zipDir.list();

        for (int i = 0; i < dirList.length; i++) {
            File f = new File(dirList[i]);
            if (f.isDirectory()) {
                String filePath = f.getPath();
                walkingDir(zos, filePath);
                continue;
            } else {
                try {
                    byte[] readBuffer = new byte[2048];
                    int bytesReaded = 0;

                    String fullPAth = zippedDir + "\\" + f.getPath();
                    System.out.println("\t архивируется " + fullPAth);
                    FileInputStream fis = new FileInputStream(fullPAth);
                    ZipEntry ze = new ZipEntry(fullPAth);
                    zos.putNextEntry(ze);

                    while ((bytesReaded = fis.read(readBuffer)) != -1) {
                        zos.write(readBuffer, 0, bytesReaded);
                    }

                    fis.close();

                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }


            }
        }

    }
}

public class ZipDirTest {
    public static void main(String[] args) {
        // принимает аргументы: имя архива и имя папки
        if(args.length != 2){
            System.out.println("Usage: java ZipDirTest <имя архива> <имя папки>");
            return;
        }

        String zipFile = args[0];
        String zippedDir = args[1];

        try{
            System.out.println("Начало архивации папки " + zippedDir);
            ZipDir.exec(zipFile, zippedDir);
            System.out.println("Архив был записан успешно " + zipFile);

        } catch (FileNotFoundException e){

        } catch (IOException e){

        }
    }
}
