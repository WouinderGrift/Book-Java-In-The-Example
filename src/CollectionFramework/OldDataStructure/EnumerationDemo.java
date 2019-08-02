package CollectionFramework.OldDataStructure;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Интерфейс Enumeration определяет методы, которые позволяют нам “перебирать” по одному все элементы структры данных.
 * <p>
 * Enumeration имеет следующие методы:
 * <p>
 * boolean hasMoreElements()
 * Имплементация данного метода позволяет узнать, есть ли в структуре данных следущий элемент.
 * Object nextElement()
 * Реализация этого метода позволяет нам получить следующий объект, который находится в структуре данных.
 */

public class EnumerationDemo {
    public static void main(String[] args) {
        Enumeration dev;
        Vector Names = new Vector();

        Names.add("First Dev");
        Names.add("Second Dev");
        Names.add("Third Dev");
        Names.add("Fourth Dev");
        Names.add("Fife Dev");

        dev = Names.elements();

        while (dev.hasMoreElements()) {
            System.out.println(dev.nextElement());
        }

    }
}
