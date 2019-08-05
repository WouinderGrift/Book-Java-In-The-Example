package Multithread.Runnable;

public class MultithreadingDemo {
    public static void main(String[] args) {
        CreateThreadWithRunnable threadOne = new CreateThreadWithRunnable("ThreadOne");
        CreateThreadWithRunnable threadTwo = new CreateThreadWithRunnable("ThreadTwo");

        threadOne.start();
        threadTwo.start();
    }
}
