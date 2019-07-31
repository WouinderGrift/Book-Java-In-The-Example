package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 Для хранения групп обхектов одинакового типа в языке программирования Java был разработан Collections Framework.

 К нему были предъявлены следующие требования:

 Должен позволять работать с разными типами данных одинаково и с высокой степенью совместимости.
 Должен иметь выскоую производительность и эфективно реализовывать фундаментальные структуры данных такие, как связный список, деревья, хэш-таблицы и динамичесике массивы.
 Должен позволять легко создавать собственные коллекции для специфических задач.
 Для реализации этих целей, был разработан набор интерфейсов, на базе которых были созданы готовые коллекции и которые позволяют разрабатывать собственные.
 */

public class ArrayListDemo {

    public static void main(String[] args) {
        List arrayList = new ArrayList<>();

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Fourth");
        arrayList.add("Fift");

        System.out.println("Initial size of list: " + arrayList.size());
        System.out.println("Initial arraylist content: " + arrayList);

        arrayList.remove("Third");
        arrayList.remove(1);

        System.out.println("Final size of list: " + arrayList.size());
        System.out.println("Final arraylist content: " + arrayList);
    }
}
