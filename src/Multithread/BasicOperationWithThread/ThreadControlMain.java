package Multithread.BasicOperationWithThread;

public class ThreadControlMain {
    public static void main(String[] args) {
        ThreadControl threadOne = new ThreadControl("Thread One");
        threadOne.start();


        ThreadControl threadTwo = new ThreadControl("Thread Two");
        threadTwo.start();

        try{
            Thread.sleep(1000);
            threadOne.suspended();
            System.out.println("Thread One suspended");

            Thread.sleep(1000);
            threadOne.resume();
            System.out.println("Thread One activated");

            threadTwo.suspended();
            System.out.println("Thread Two suspended");

            Thread.sleep(1000);
            threadTwo.resume();
            System.out.println("Thread Two activated");
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupt");
        }


        try{
            System.out.println("Standing by for finishing threads");
            threadOne.thread.join();
            threadTwo.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Leaving main thread");
    }
}
