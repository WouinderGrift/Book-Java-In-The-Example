package CollectionFramework;


import java.util.Map;

/**
 Класс WeakHashMap является реализацией интерфейса Map, который хранит только слабые ссылки в качестве ключей.
 Это позвоялет сборщику мусора удалять элемент структуры в том случае, если на ключ элемента типа “ключ – значение” за пределами таблицы никто не ссылается.

 Этот класс крайне полезен, если нам необходимо сразу удалять значение, когда оно становится недоступным для других процессов (в условиях ограниченности физических ресурсов).
 Например, при учёте активных пользователей.

 Тут стоит остановиться и кратко объяснить, как JVM работает со слабой ссылкой (weak reference).
 Если на объект ссылается только слабая ссылка, он будет удалён при мервом же вызове сборщика мусора.
 Что и позволяет нам избежать OutOfMemoryError.
 */

public class WeakHashMap {
    private static Map map;

    public static void main(String[] args) {
       map = new java.util.WeakHashMap<>();

       map.put(new Integer(1), "Dima");

       Runnable runner = new Runnable() {
           @Override
           public void run() {
                while(map.containsKey(1)){
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    System.out.println("Thread is waiting...");
                    System.gc();
                }
           }
       };

       Thread thread = new Thread(runner);
       thread.start();
        System.out.println("Application is waiting...");

        try{
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
