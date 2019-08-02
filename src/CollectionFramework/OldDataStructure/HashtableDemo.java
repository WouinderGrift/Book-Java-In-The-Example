package CollectionFramework.OldDataStructure;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Hashtable является частной реализацией абстрактного класса Dictionary.
 * На данный момент Hashtable является частью Collection Framework, крайне похожа на HashMap, но синзронизированна.
 * Hashtable храниит элементы типа “ключ – значение” и можем получать значение элемента по ключу.
 */

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> developers = new Hashtable<>();
        Enumeration experience;
        String name;
        double salary;

        developers.put("Dima", 5000.0);
        developers.put("Dasha", 3000.0);
        developers.put("Wifu", 4000.0);

        experience = developers.keys();

        while (experience.hasMoreElements()) {
            name = (String) experience.nextElement();
            System.out.println(name + "'s salary: $" + developers.get(name));
        }

        System.out.println("\n====================\n");

        System.out.println("Now we will increase Dima's salary by $500...");
        salary = developers.get("Dima");
        developers.put("Dima", (salary + 500));
        System.out.println("Dima's new salary: $" + developers.get("Dima"));

    }
}