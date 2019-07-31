package CollectionFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 Класс TreeMap является реализацией интерфейса Map, которая использует дерево для хранения данных.
 Это обеспечивает более высокую скорость получения данных.
 TreeMap гарантирует, что элементы будут отсортированы по возрастанию.
 */

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap<>();

        treeMap.put(2, "Huan");
        treeMap.put(1, "Dima");
        treeMap.put(3, "Tanya");
        treeMap.put(4, "Losik");
        treeMap.put(5, "Dasha");

        System.out.println("Init treeMap content...");

        Set set = treeMap.entrySet();
        for(Object element : set){
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + " Name: " + mapEntry.getValue());
        }

        System.out.println("\n========================\n");

        System.out.println("Modify Tanya");
        String name = (String) treeMap.get(3);

        name += " traitress";
        treeMap.put(2, name);

        System.out.println("\n========================\n");

        System.out.println("Final TreeMap content: ");
        set = treeMap.entrySet();

        for(Object element : set){
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + " Name: " + mapEntry.getValue());
        }
        System.out.println("\n========================\n");
    }
}
