package CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 Класс LinkedHashMapDemo хранит элементы типа “ключ – значение” в том порядке, в котором они были добавлены.
 Это означает, что когда мы захотим вывести содержимое структуры данных мы получим их не упорядоченными по возрастанию, а в порядке добавления.
 */

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();

        System.out.println("Adding elements into linkedHashMap");

        linkedHashMap.put(3, "Dima");
        linkedHashMap.put(2, "Alisa");
        linkedHashMap.put(5, "Dasha");
        linkedHashMap.put(1, "Dona");
        linkedHashMap.put(4, "Losya");

        System.out.println("LinkedHashMap init content: ");
        Set set = linkedHashMap.entrySet();

        for(Object element : set){
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + " Name: "+ mapEntry.getValue());
        }

        System.out.println("\n========================\n");

        System.out.println("Modify Dona");
        String name = (String) linkedHashMap.get(1);
        name += " Intruder";
        linkedHashMap.put(1, name);


        System.out.println("LinkedHasMap final content: ");
        set = linkedHashMap.entrySet();

        for(Object element : set){
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + " Name: "+ mapEntry.getValue());
        }
        System.out.println("\n========================\n");


    }
}
