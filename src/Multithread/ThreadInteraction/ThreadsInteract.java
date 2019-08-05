package Multithread.ThreadInteraction;

/**
 В реальных приложениях мы чатсо сталкиваемся с ситуацией, когда два потока обмениваются какой-либо информацией.
 Для обеспечения этого процесса применяются такие методы, как

 public void wait()
 Этот метод  метод переводит поток в режим ожидания до момента вызова метода notify().
 public void notify()
 Этот метод переводит один поток из режима ожидания в активный режим.
 public void notifyAll()
 Этот метод переводит все потоки, которые находятся в режиме ожидания в активный режим.
 Все эти методы реализованы, как финальные методы класса Object, что означает их доступность для любого класса в языке программирования Java.
 Все эти методы могут быть применены только в контексте синхронизации.
 */

public class ThreadsInteract {
    boolean isActive = false;

    public synchronized void Request(String request){
        if(isActive){
            try{
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Pilot");

        System.out.println(request);

        isActive = true;

        notify();
    }

    public synchronized void Response (String respone) {
        if(!isActive){
            try{
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Controller: ");
        System.out.println(respone);
        isActive = false;
        notify();
    }
}
