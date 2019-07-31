package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 Класс TreeSet является реализацией интерфейса Set и реализует красно-чёрное дерево.
 Элементы в этой структуре данных хранятся в упорядоченном по возрастанию порядке.
 Эта структура данных является крайне эффективной, когда нам необходимо получить доступ к элементу при большом количестве элементов.
 */
class TreeSetPreview {
    public void Tree(){
        TreeSet treeSet = new TreeSet<>();

        System.out.println("Adding element into treeSet...");

        treeSet.add("9");
        treeSet.add("8");
        treeSet.add("4");
        treeSet.add("2");
        treeSet.add("1");
        treeSet.add("5");
        treeSet.add("6");
        treeSet.add("3");
        treeSet.add("7");
        treeSet.add("10");

        System.out.println("treeSet content:");
        System.out.println(treeSet);
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSetPreview treeSetPreview = new TreeSetPreview();
        // treeSetPreview.Tree();

        List arrayList = new ArrayList<>();
        TreeSet treeSet = new TreeSet<>();

        System.out.println("Filling our structures...");

        for(int i = 0; i < 1000000; i++){
            arrayList.add(i);
            treeSet.add(i);
        }

        elapsedArrayList(arrayList);

    }

    public static void elapsedArrayList(List arrayList){
        System.out.println("Trying to receive element 999.999 in arrayList");
        long start = System.nanoTime();
        arrayList.get(999999);

        long end = System.nanoTime();
        long timeElapsedArrayList = end - start;
        System.out.println("Time elapsed for arrayList: " + timeElapsedArrayList);

        System.out.println("Trying to receive element 999999 in TreeSet");
        start = System.nanoTime();
        arrayList.get(999_999);
        end = System.nanoTime();

        long timeElapsedTreeSet = end - start;

        System.out.println("Time elapsed for TreeSet: " + timeElapsedTreeSet);

        System.out.println("TreeSet " + (int)(timeElapsedArrayList/timeElapsedTreeSet) + " times more effective");


    }

}
