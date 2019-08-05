package Multithread.ThreadInteraction;

public class ThreadInterActionDemo{
    public static void main(String[] args) {
        ThreadsInteract interact = new ThreadsInteract();

        Request request = new Request(interact);
        Response response = new Response(interact);
    }
}
