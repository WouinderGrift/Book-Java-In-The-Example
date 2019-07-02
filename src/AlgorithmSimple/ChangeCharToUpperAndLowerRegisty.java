package AlgorithmSimple;

/**
 * Преобразовать символ к верхнему регистру с помощью
 * побитовой коньюкции, стр. 145 - 147
 */

public class ChangeCharToUpperAndLowerRegisty {
    public static void main(String[] args) {
        char ch;
        for(int i = 0; i<26; i++){
            ch = (char)('a' + i);

            //эта команда отключает 6й бит
            ch = (char)((int)ch & 0xffdf);
            System.out.print(ch + " ");
        }
        System.out.println("\n=============================");
       char sh;
        for(int y = 0; y < 26; y++){
            sh = (char) ('A' + y);
            sh = (char) ((int) sh | 0x20);
            System.out.print(sh + " ");
        }
    }
}
