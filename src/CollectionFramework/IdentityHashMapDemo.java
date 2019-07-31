package CollectionFramework;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/**
 Класс IdentityHashMapDemo является реализацией абстрактного класса AbstractMap.
 Его отличие от HashMap состоит в том, что при сравнении элементов используется сравнение ссылок, а не значений.
 При сравнении не используется класс equals().
 Этот класс обеспечивает постоянное время для операция добавления и получения элемента и формирует хэш-код с помощью метода Systen.identityHashCode(Object).
 */

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap identityHashMap = new IdentityHashMap<>();

        System.out.println("Adding elements into IdentityHashMapDemo...");
        identityHashMap.put(3, "Dima");
        identityHashMap.put(2, "Dasha");
        identityHashMap.put(5, "Wifu");
        identityHashMap.put(1, "Nina");
        identityHashMap.put(4, "Cock");

        System.out.println("Initial identityHashMap content:");
        Set set = identityHashMap.entrySet();

        for (Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + ", Name: " + mapEntry.getValue());
        }

        System.out.println("\n================================\n");

        System.out.println("Modifying Proselyte...");
        String name = (String) identityHashMap.get(3);
        name += " Changed";
        identityHashMap.put(3, name);

        System.out.println("\n================================\n");

        System.out.println("Initial identityHashMap content:");
        set = identityHashMap.entrySet();

        for (Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + ", Name: " + mapEntry.getValue());
        }

        System.out.println("\n================================\n");
    }
}
