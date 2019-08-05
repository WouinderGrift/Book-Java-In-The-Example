package Multithread.SyncThread;

public class SyncThreadDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        SyncThread threadOne = new SyncThread("Syncronized Thread One", counter);
        SyncThread threadTwo = new SyncThread("Syncronized Thread Two", counter);

        threadOne.start();
        threadTwo.start();

        try{
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted " + e);
        }


    }
}
