package Multithread.SyncThread;

public class SyncThread extends Thread{
    private Thread thread;
    private String threadName;
    final Counter counter;

    public SyncThread(String threadName, Counter counter) {
        this.threadName = threadName;
        this.counter = counter;
    }

    public void run(){
        System.out.println("Thread " + threadName + " is running");

        synchronized (counter){
            counter.displayCounter();
        }
        System.out.println("Leaving " + threadName + " thread");
    }

    public void start(){
        System.out.println("Thread " + threadName + " successfully started");

        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
