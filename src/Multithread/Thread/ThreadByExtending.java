package Multithread.Thread;

public class ThreadByExtending extends Thread{
    private Thread thread;
    private String threadName;

    public ThreadByExtending(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread " + threadName + " create successfully");
    }

    public void run(){
        System.out.println("Thread " + threadName + " is running...");

        try{
            for(int i = 0; i <= 5; i++){
                System.out.println("Thread " + threadName + " " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted " + e);
        }
        System.out.println("Leaving thread " + threadName);
    }

    public void start(){
        System.out.println("Thread " + threadName + " is started successfully...");
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
