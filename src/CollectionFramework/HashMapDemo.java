package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 Класс HashMap имплементирует интерфейс Map и использует хэш-таблицу.
 Обеспечивает постоянное время для записи и доступа к элементам.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();
        System.out.println("Adding elements into hashMap...");

        hashMap.put("Proselyte" , "Java");
        hashMap.put("AsyaSmile", "UI/UX");
        hashMap.put("Peter", "C++");
        hashMap.put("Ann", "PHP");

        System.out.println("Init hashMap");
        System.out.println(hashMap);

        System.out.println("\n=============\n");
        System.out.println("Init hashMap content using set: ");
        Set set = hashMap.entrySet();

        for(Object element: set){
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println(mapEntry.getKey() + ":" + mapEntry.getValue());
        }

        System.out.println("\n=============\n");

        System.out.println("Modify proselyte's specialty...");
        String specialty = (String) hashMap.get("Proselyte");
        specialty += " Developer (Changed)";
        hashMap.put("Proselyte", specialty);

        for(Object element : set){
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println(mapEntry.getKey() + ":" + mapEntry.getValue());
        }
        System.out.println("\n=============\n");
    }
}
