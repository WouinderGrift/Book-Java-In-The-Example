package CollectionFramework;

import java.util.LinkedHashSet;

/**
 Класс LinkedHashSet наследует класс HashSet. Этот класс запоминает порядок добавления элементов.
 Поэтоmу, когда мы захотим увидеть содержимое структуры, то элементы будут выведены в том порядке, в котором они были довалены, а не упорядочены, как в случае с HashSet.
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();

        System.out.println("Adding element into linkedHashSet...");

        linkedHashSet.add("5");
        linkedHashSet.add("2");
        linkedHashSet.add("4");
        linkedHashSet.add("3");
        linkedHashSet.add("1");

        System.out.println("linkedHashSet content: ");
        System.out.println(linkedHashSet);
    }
}
