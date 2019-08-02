package CollectionFramework.OldDataStructure;

import java.util.Vector;

/**
 * Класс Vector является реализацией динмаического массива, который похож на ArrayList за исключением того, что:
 * <p>
 * Класс Vector содержит много устаревших мтеодов, которые не являются частью Collection Framework.
 * Класс Vector синхронизирован.
 * Эта структура данных крайне полезна в том случае, если мы изначально не знаем сколько именно элементов в массиве данных.
 * Мы можем добавлять новые элементы в процессе работы программы.
 */

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add("one");
        vector.add("two");
        vector.add("three");

        System.out.println("Init vector: ");
        System.out.println(vector);

        System.out.println("Init vector's size: " + vector.size());
        System.out.println("Vector capacity: " + vector.capacity());

        System.out.println("Adding new elements...");
        vector.add("four");
        vector.add("five");
        vector.add("six");
        vector.add("seven");
        vector.add("eight");
        vector.add("nine");
        vector.add("ten");
        vector.add("eleven");

        System.out.println("Final vector: ");
        System.out.println(vector);
        System.out.println("Final vector size:" + vector.size());
        System.out.println("Final vector capacity: " + vector.capacity());

    }
}
