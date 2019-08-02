package CollectionFramework.AlgorithmWith;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Основные алгоритмы: сортировки и перемешивание ArrList
 */

public class BasicAlgorithmWithArrayList {
    public static void main(String[] args) {
        List arrList = new ArrayList<>();

        arrList.add(-1);
        arrList.add(53);
        arrList.add(-65);
        arrList.add(90);
        arrList.add(14);
        arrList.add(36);
        arrList.add(15);

        System.out.println("Init arrayList");
        System.out.println(arrList);

        System.out.println("\n==================\n");

        System.out.println("Sorting arrayList...");
        Collections.sort(arrList);
        System.out.println("Sorted arrayList: ");
        System.out.println(arrList);

        System.out.println("\n==================\n");

        System.out.println("Inverting collection...");
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(arrList, comparator);
        System.out.println("Invert arrayList: ");
        System.out.println(arrList);

        System.out.println("\n==================\n");

        System.out.println("Shuffing arrayList...");
        Collections.shuffle(arrList);
        System.out.println("Shufled arrayList:");
        System.out.println(arrList);

        System.out.println("\n==================\n");
    }
}
