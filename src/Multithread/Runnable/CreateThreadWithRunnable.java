package Multithread.Runnable;

/**
 * зык программирования Java поддержиает многопоточность.
 * Это означает, что мы можем разарбатывать многопоточные приложения.
 * Многопоточные приложения – это программы, которые имеют два и более потоков, которые выполняются одноверменно.
 * Т.е. одна часть программы выполняет одну задачу, а вторая часть – другую.
 * Механизм мнгопоточности может применяться только к таким компьюьюерам, котоыре имеют 2 и более процессоров.
 * Суть этого механизма заключается в том, что мы создаём два и более потока, которые работают параллельно.
 * <p>
 * Жизненный цикл потока
 * Новый (New)
 * Созданный поток назодится  в состоянии новый и назодится в нём до начала его работы.
 * Исполняемый (Runnable)
 * После того, как поток начал свою работу он становится исполняемым (runnable). Это означает, что данный поток выполняет какую-то работу.
 * Ожидающий (Waiting)
 * Временами поток не может выполнять свою работу, например ожидает другой поток, который выполняет определённые вычисления. Поток находится в состоянии ожидания до момента, когда получит опредлённый сигнал, например о том, что все необходимые вычисления выолнены.
 * Временно ожидающий (Timed waiting)
 * Мы можем задать потоку определённое время ожидания, по истечении которого он продолжит свою работу.
 * Остановленный (Terminated)
 * После того, как поток выполнит свою работу, он преходит в состояние остановленный (прекращённый).
 */

public class CreateThreadWithRunnable implements Runnable {
    private Thread thread;
    private String threadName;

    public CreateThreadWithRunnable(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread " + threadName + " created successfully");
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is running...");

        try{
            for(int i = 1; i<=5; i++){
                System.out.println("Thread " + threadName + " " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted: " + e);
        }

        System.out.println("Leaving thread " + threadName);

    }

    public void start(){
        System.out.println("Thread " + threadName + " is started successfully");

        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
