package Multithread.Deadlock;

import java.io.ObjectInputStream;

/**
 * Взаимная блокировка – это ситуация, при которой два или более потоков заблокированы навсегда, ожидая друг друга.
 */

public class DeadLockDemo {
    public static final Object Lock1 = new Object();
    public static final Object Lock2 = new Object();

    public static void main(String[] args) {
        DeadThreadOne threadOne = new DeadThreadOne();
        DeadThreadTwo threadTwo = new DeadThreadTwo();

        threadOne.start();
        threadTwo.start();

    }

    private static class DeadThreadOne extends Thread{
        public void run(){
            synchronized (Lock1){
                System.out.println("DeadThreadOne is holding lock1...");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("DeadThreadOne is waiting for Lock 2");

                synchronized (Lock2){
                    System.out.println("DeadThreadOne is holding Lock1 and Lock2");
                }
            }
        }


    }

    private static class DeadThreadTwo extends Thread {
        public void run() {
            synchronized (Lock2){
                System.out.println("DeadThreadTwo is holding Lock2");

                try{
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                System.out.println("DeadThreadTwo is waiting Lock1");
                synchronized (Lock1){
                    System.out.println("DeadThreadOne is holding Lock2");
                }
            }
        }

    }

}
