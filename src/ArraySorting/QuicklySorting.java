package ArraySorting;

/**
 * Быстрый алгоритм или алгоритм Хоара
 * Самый эффективный алгоритм для сортировки массива большого количества элементо
 * Метод основан на разделении сортируемых элементов по группам, относительно выбранного
 * (приблизительного значения по середине) в первую часть перемещаются ве элементы которые больше или равны этому значению.
 */
class DoingIt{
    static void sort (char items[]){
        quicksort(items, 0, items.length - 1);
    }

    private static void quicksort(char items[], int left, int right){
        int top, bottom;
        char comparand, value;

        top = left; //первая позиция
        bottom = right; //последняя позиция
        //выбор компаранда - символ середины массива
        comparand = items [((left + right)/2)];

        //разделение массива на пару частей
        do{
            while((items[top] < comparand) && (top < right)) top++;
            while ((comparand < items[bottom]) && (bottom > left)) bottom--;

            if(top <= bottom){
                value = items[top];
                items[top] = items[bottom];
                items[bottom] = value;
                top++;
                bottom--;
            }
        }
        while (top <= bottom);


        /*  Если закоментированный код включить, то будет виден результат сортировки
          if(((right + 1) - left) == items.length) {
              for(int i = 0; i<items.length; i++){
                  System.out.print(items [i]);
                  System.out.println();
              }
          } */

        //рекурсивная сортировка первой части
        if(left < bottom) quicksort(items, left,bottom);
        //второй части
        if(top < right) quicksort(items,top, right);
    }
}

public class QuicklySorting {
    public static void main(String[] args) {
        char seq[] = {'h', 'e', 'd','a', 'c','i'};

        System.out.print("Исходный порядок символов: ");
        for(int i = 0; i < seq.length; i++){
            System.out.print(seq[i]);
        }

        System.out.println();
        DoingIt.sort(seq);

        System.out.print("Сортированный порядок: ");
        for(int i = 0; i<seq.length; i++){
            System.out.print(seq[i]);
        }
        System.out.println();
    }
}
