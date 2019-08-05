package Multithread.ThreadInteraction;

import java.lang.management.ThreadInfo;

public class Request implements Runnable {
    ThreadsInteract interact;

    String[] request = {
            "Dnipro Radar, Aeroflot 1816",
            "Request descent, Aeroflot 1816",
            "Descending to altitude 6,000 metres, Aeroflot 1816"
    };

    public Request (ThreadsInteract interact){
        this.interact = interact;
        new Thread(this, "Request").start();
    }

    @Override
    public void run() {
        for(int i = 0; i < request.length; i++){
            interact.Request(request[i]);
        }
    }
}
