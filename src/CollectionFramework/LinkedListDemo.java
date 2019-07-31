package CollectionFramework;

import java.util.LinkedList;

/**
 Класс LinkedList наследует абтсрактный класс AbstractSequentialList и реализует интерфейс List.
 Он является реализацеий такой страктуры данных, как связный список.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();

        System.out.println("Adding element to linkedlist...");

        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Fourth");

        linkedList.addFirst("First");
        linkedList.addLast("Fifth");

        linkedList.add(1, "One and half");

        System.out.println("Initial linkedlist content: ");
        System.out.println(linkedList);

        System.out.println("Removing elements First, Fifth and One and half...");

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove("One and half");

        System.out.println("Chanding element with value second");
        linkedList.set(0, "Changed " + linkedList.get(0));

        System.out.println("Final linkedlist content: ");
        System.out.println(linkedList);
    }
}
