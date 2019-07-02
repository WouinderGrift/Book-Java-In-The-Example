package AlgorithmSimple;

import java.io.PrintStream;

/**
 * Представление битов в байте
 */
class ShowBits1{
    private int numbits;

    public ShowBits1(int num){
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

public class RepresentationBitsInBytes{
    private static PrintStream out = System.out;

    public static void main(String[] args) {
        int t;
        byte val = 123;

        for(t = 128; t>0; t = t/2){
            if((val & t) != 0){
                out.print("1");
            } else{
                out.print("0");
            }
        }
    }
}