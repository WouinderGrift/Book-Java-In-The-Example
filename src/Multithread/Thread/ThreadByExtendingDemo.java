package Multithread.Thread;

/**
 * Наследование класса Thread.
 * Этот способ даёт нам больше гибкости при работе с потоками, благодаря методам класса Thread.
 */

public class ThreadByExtendingDemo {
    public static void main(String[] args) {
        ThreadByExtending threadOne = new ThreadByExtending("Thread One");
        ThreadByExtending threadTwo = new ThreadByExtending("Thread Two");

        threadOne.start();
        threadTwo.start();
    }
}
