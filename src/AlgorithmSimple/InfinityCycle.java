package AlgorithmSimple;

/**
 * Бесколнечный цикл с помощью while\for
 */
public class InfinityCycle {
    public static void main(String[] args) {
        boolean flag = true;
        int i = 1;

        while (flag){
            System.out.println(i++);
            if (i == 11){
                flag = !flag;
            }
        }

        for(int y = 1; flag; y++){
            System.out.println(y);
            if (y == 10){
                flag = !flag;
            }
        }

    }
}
