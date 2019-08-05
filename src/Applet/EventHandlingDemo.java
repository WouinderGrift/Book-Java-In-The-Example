package Applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventHandlingDemo extends Applet implements MouseListener {
    StringBuffer stringBuffer;

    public void init(){
        addMouseListener(this);
        stringBuffer = new StringBuffer();
        addItem("Applet is Init");
    }

    public void start(){
        addItem("Applet is started");
    }

    public void stop(){
        addItem("Applet is stoped");
    }

    public void destroy(){
        addItem("Applet is destroy");
    }

    void addItem(String str){
        System.out.println(str);
        stringBuffer.append(str);
        System.out.println("\n");
        repaint();
    }

    public void paint(Graphics graphics){
        graphics.drawRect(0,0,getWidth() -1, getHeight() - 1);
        graphics.drawString(stringBuffer.toString(), 10, 20);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        addItem("\nMouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        addItem("\nMouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        addItem("\nMouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
