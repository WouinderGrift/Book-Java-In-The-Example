package AlgorithmSimple;

/**
 * Спящий режим программы
 */
public class Sleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        long mili = 5000L;
        Thread.sleep(mili);
        System.out.println("World");
    }
}
