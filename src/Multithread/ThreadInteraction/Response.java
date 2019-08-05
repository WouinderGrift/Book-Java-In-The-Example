package Multithread.ThreadInteraction;

public class Response implements Runnable{
    ThreadsInteract interact;

    String[] response = {
      "Aeroflot 1816, Dnipro Radar, go ahead",
            "Aeroflot 1816, descend to altitude 6,000 metres"
    };

    public Response (ThreadsInteract interact){
        this.interact = interact;
        new Thread(this, "Respone").start();
    }

    @Override
    public void run() {
        for(int i = 0; i<response.length; i++){
            interact.Response(response[i]);
        }
    }
}

