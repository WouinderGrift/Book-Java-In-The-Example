package CollectionFramework.AlgorithmWith;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 Во время разработки приложений мы часто сталкиваемся с необходимостью получить доступ ко всем элементами коллекции. Например, вывести на экран эти элементы.
 Самым простым и эффективным способом сделать это, является использование итератора (iterator). Итератор – это объект, который реализовывает интерфесы Iterator, либо ListIterator.

 Iterator позволяет нам получить доступ ко всем элементам коллекции и удалять те из них, которые необходимо. ListIterator является наследником Iterator и позволяет нам “пробежаться” по коллекции в обоих направлениях. ListIterator также позволяет нам изменять элементы.

 Для того, чтобы использвоать итератор, нам прежде всего необходимо получить его. Для этого мы должны использовать метод iterator().

 Итератор имеет такие методы:

 bollean hasNext()
 Этот метод проверяет, есть ли в коллекции следующий элемент. Если есть, то метод возвращает true, если нет – false.

 Object next()
 Этот метод возвращает следующий элемент коллекции. Если элемент не обнаружен, то метод “бросает” NoSuchElementException.

 void remove()
 Этот метод удаляет текущий элемент. Важный момент заключается в том, что сначала этот элемент необходимо получить с помощью метода next(), если мы вызовем метод remove() до метода next(), то мы получим IllegalStateException.
 ListIterator имеет больший набор методов:

 void add(Object obj)
 Этот метод добавляет элемент в коллекцию на следующую позицию после элемента, полученного с помощью метода next().

 boolean hasNext()
 Этот метод проверяет, есть ли в коллекции следующий элемент. Если есть, то метод возвращает true, если нет – false.

 boolean hasPreviuos()
 Этот метод проверяет, есть ли в коллекции предыдущий элемент. Если есть, то метод возвращает true, если нет – false.

 Object next()
 Этот метод возвращает следующий элемент коллекции. Если элемент не обнаружен, то метод “бросает” NoSuchElementException.

 Object previous()
 Этот метод возвращает предыдущий элемент коллекции. Если элемент не обнаружен, то метод “бросает” NoSuchElementException.

 int nextIndex()
 Этот метод возвращает индекс следующего элемента. Если в коллекции остутствует следующий элемент – возвращается размер коллекции.

 int previousIndex()
 Этот метод возвращает индекс предыдущего элемента. Если в коллекции остутствует предыдущий элемент – возвращает значение -1.

 void set(Object obj)
 Этот метод присваивает текущеиу элементу значение, которое передано в качестве параметра метода.

 void remove()
 Этот метод удаляет текущий элемент. Важный момент заключается в том, что сначала этот элемент необходимо получить с помощью метода next()либо с помощью метода previous(), если мы вызовем метод remove() до метода next() или метода previous(), то мы получим IllegalStateException.
 */

public class IteratorDemo {
    public static void main(String[] args) {
        List arrList = new ArrayList<>();

        System.out.println("Adding elements into arrayList...");
        for(int i = 0; i < 10; i++){
            arrList.add((int)(Math.random() * 100));
        }
        System.out.println(arrList);

        System.out.println("\n====================\n");

        System.out.println("Updating elements using ListIterator...");

        ListIterator listIterator = arrList.listIterator();
        while(listIterator.hasNext()){
            Integer element = (Integer) listIterator.next();
            listIterator.set(element * 10);
        }

        System.out.println("\n====================\n");

        System.out.println("Final arrayList content (using Iterator): ");
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }

        System.out.println("\n====================\n");
    }
}
