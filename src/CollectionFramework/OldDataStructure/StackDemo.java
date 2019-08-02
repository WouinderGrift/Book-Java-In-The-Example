package CollectionFramework.OldDataStructure;

import java.util.Stack;

/**
 * Класс SelfStack является подклассом Vector и реализовывает структуру “крайний на вход – первый на выход”.
 * <p>
 * Этот класс имеет только один конструктор по умолчанию и все методы класса Vector. Плюс к этому SelfStack имеет ещё свои 5 методов:
 * <p>
 * boolean empty()
 * Этот метод проверяет является ли стэк пустым или нет. Если стэк пустой – возвращает true, если нет –  false.
 * Object peek()
 * Этот метод возвращает  элемент, который находится на вершине стэка.
 * Object pop()
 * Этот метод возвращает элемент, который находится на вершине стэка и удаляет его.
 * Object push(Object element)
 * Этот метод добавялет указанный элемент на вершину стэка.
 * int search(Object element)
 * Этот метод выполняет поиск указанного элемента в стэке. Если искомый элемент найден – вощвращается его “отдалённость” от вершины (порядковый номер). Если эе элемент не найден – возвращается значение -1.
 */

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Init stack: " + stack);

        System.out.println("Searching value 3 in stack...");
        System.out.println(stack.search(3));

        System.out.println("Searching value 10 in stack...");
        System.out.println(stack.search(10));

        stack.pop();
        stack.pop();

        System.out.println("Pushing values 6,7,8 into stack...");
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println("First element of the stack: " + stack.peek());

        System.out.println("Final stack" + stack);
    }
}
