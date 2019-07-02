package ArraySorting;

/**
 * !Важная тема!
 *
 * Сортировка пузырьком - популярный способ сортировки элементов массивов.
 * Она не эффективна при больших массивах.
 * Он основан на перестановке соседних элементов массива.
 */
class DoIt{
    static void sort(int num[]) {
        int t;  //вспомогательная переменная

        for(int a = 1; a < num.length; a++){
            //повтор для каждого элемента массива
            for(int b = num.length - 1; b >= a; b--){
                //повтор для проверки порядка соседних элементов
                if(num[b-1] > num [b]){
                    //перестановка элементов
                    t = num [b-1];
                    num[b-1] = num [b];
                    num[b] = t;
                }
            }//for b
        } //for a
    } //sort


}

public class BubbleSorting {
    public static void main(String[] args) {
        int num[] = {99, -10, 40, 453, 45, 86, 10, 1, 4};

        System.out.print("Исходны порядок массива: ");
        for(int i = 0; i<num.length ; i++){
            System.out.print(num[i] + " ");
        }

        System.out.println();
        DoIt.sort(num);

        System.out.println("Новый порядок: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
