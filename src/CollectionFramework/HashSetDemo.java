package CollectionFramework;

import java.util.HashSet;

/**
 HashSetDemo наследует  AbstractSet и имплементирует интерфейс Set.
 Экземпляром этого класса является структура, которая использует хэш-таблицу для хранения данных.
 Распределение и хранение данных выполняется с использованием хэширования (создания уникального идентификатора – ключа, на основе значения элемента).
 Результатом хэширования является значение, которое называется хэш-код.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>();

        System.out.println("Adding element into hashSet...");
        hashSet.add("Charlie");
        hashSet.add("Delta");
        hashSet.add("Alpha");
        hashSet.add("Echo");
        hashSet.add("Bravo");

        System.out.println("hashSet content: ");
        System.out.println(hashSet);
    }
}
