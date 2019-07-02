package AlgorithmSimple;

import java.io.PrintStream;

/**
 * Преобразование числа в двоичную форму
 */
class ShowBits{
    private int numbits;

    public ShowBits(int num){
        this.numbits = num;
    }

    public String getBinaryForm(long val){
        long mask = 1;
        String form = "";
        mask <<= numbits - 1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1){
           if((val & mask) != 0){
               form += "1"; //бит включен
           } else {
               form += "0"; //бит выключен
           }
           //разделение битов на группы по 8
            spacer++;
           if((spacer % 8) == 0){
               form += " ";
               spacer = 0;
           }
        }//for
        return form;
    }

    public void show(long val, PrintStream out){
        String binaryForm = getBinaryForm(val);
        out.println(binaryForm);
    }
}
public class OutputBinaryRecordNum {
    private static PrintStream out = System.out;

    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        out.print("128 в двоичном виде ");
        b.show(128, out);

        out.print("87987 в двоичном виде ");
        i.show(87987, out);

        out.print("237658768 в двоичном виде ");
        li.show(237658768, out);

        out.print("Младшие 8 бит числа 87987 в двоичном виде ");
        b.show(87987, out);
    }
}
