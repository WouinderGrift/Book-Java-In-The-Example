package PrincipleOOP.Legacy;

import javax.swing.*;

/**
 * Override или переопределение метдов
 *
 * Некоторые методы подкласса должны работать не в точности,
 * как унаследованные методы надкласса. В таком случае достаточно
 * в теле подкласса переопределить данный метод:
 * написать код этого метода, специфический для подкласса.
 *
 * Так если в классе-предке и классе-потомке есть методы с одинаковыми именами,
 * то для экземпляров каждого из этих классов вызывается соответствующий метод, определенный именно
 * в его классе. Если же его нет, то вызывается метод с этим же именем в суперклассе
 */
class Warlock{
    int health, magic, elemental;
    Warlock(int hp, int mg, int el){
        health = hp;
        magic = mg;
        elemental = el;
    }

    public String toString(){
        return "Здоровье " + health + "\n Магия " + magic + "\n Элементали " + elemental;
    }
}

class UberWarlock extends Warlock {
    boolean UberStaff; //наличие посоха

     UberWarlock(boolean UberStaff){
        this(4,4,100, true);
    }

    UberWarlock(int hp, int mg, int el, boolean UberStuff){
        super(hp, mg, el);
        this.UberStaff = UberStuff;
    }

    public String toString(){
        String us;
        if(this.UberStaff) {
            us = "еесь, он рили УберВарлок";
        }else{
            us = "неесь, он шарлатаан";
        }
        return "Здоровье " + health + "\n Магия " + magic + "\n Элементали " + elemental + "\n УберПосох " + us;
    }
}

public class ExampleCallMethodSuperclass {
    public static void main(String[] args) {
        Warlock warlock = new Warlock(100,100,14);
        UberWarlock uberWarlock = new UberWarlock(true);

        JOptionPane.showMessageDialog(null, "Warlock: \n" + warlock.toString() +
        "\n \nUberWarlock: \n" + uberWarlock.toString());
    }
}
