package FileIO;

import java.io.*;

/**
 * Чтение и запись файлов
 */

public class ReadWrite {
    public static void main(String[] args) {

    }

    public static void Read(){
        /**
         * Если файл содержит символы кирилицы, нужно немного изменить BufferedReader:
         * BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream ("file.txt"), "8859_5");
         * Кирилица в фаормате кодирования ISO - 8859-5
         */

        try{
            BufferedReader in = new BufferedReader(new FileReader("file.txt"));
            //построчное чтение
            String str;
            while((str = in.readLine()) != null){
                //обработка полученной строки
            }
            in.close();
        } catch (IOException e) {
            System.err.println("Ошибка при обработке файла");
        }
    }

    public static void ReadBinaryFile(){
        File f = new File("file.bin");

        try {
            InputStream in = new FileInputStream(f);
            long lenght = f.length();

            if(lenght > Integer.MAX_VALUE){
                throw new IOException("Файл " + f.getName() + "слишком длинный!");
            }

            byte[] bytes = new byte[(int)lenght];

            //чтение байтов
            int offset = 0;
            int numRead = 0;
            while (offset < bytes.length && (numRead = in.read(bytes, offset, bytes.length - offset)) >= 0){
                offset += numRead;
            }
            //прочитан ли файл до конца
            if(offset < bytes.length){
                throw new IOException("Не удалось прочитать файл " + f.getName()+ " полностью");
            }
            in.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    //Запись в текстовый файл
    public static void Write(){
        /**
         *  Eсли файла не существует он будет создан, иначе перезаписан
         *  Для записи кирилицей BufferedWriter out = new BufferedWriter(new OutFileStreamWriter ( new FileOutStream("file.txt"), "8859_5));
         */


        try{
            String fileName = "file.txt";
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            out.write("Hello World!");
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //Чтение и запись файла в произвольную позицию в файле
    public static void RandomRW(){
        try{
            File f = new File("file.txt");
            //rw - доступ к записи - чтение и запись соответственно
            RandomAccessFile raf = new RandomAccessFile(f, "rw");

            //чтение первого символа файла
            char ch = raf.readChar();

            //переход к концу файла
            raf.seek(f.length());

            //запись в конец файла
            raf.writeChars("The End");

            raf.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

//Фильтрация потока ввода
class GrepInputStream extends FilterInputStream{

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */

    String substring = null;
    BufferedReader br;

    protected GrepInputStream(InputStream in, String substring) {
        super(in);

        this.br = new BufferedReader(new InputStreamReader(in));
        this.substring = substring;
    }

    public final String readLine() throws IOException{
        String line;

        do{
            line = br.readLine();
        } while ((line != null) && line.indexOf(substring) == -1);
        return line;
    }


}