package Classes;

import javax.swing.*;

/**
 * Пример использования указателей на объекты
 */
class UnitAmunition {
    int weapon;
}

public class ExampleUsingPointersOnObject {
    public static void main(String[] args) {
        UnitAmunition Hero, Boss; //ссылки на объект

        Hero = new UnitAmunition(); //создаем объект и ссылку на него
        Hero.weapon = 50; //количество собранного оружия

        Boss = Hero; //эти переменные ссылаются на один объект
        //посмотрим:
        JOptionPane.showMessageDialog(null, "Количество снаряжения Boss равно " + Boss.weapon);

        Boss.weapon = 100;
        //Если Boss и Hero это один и тот же объект, то теперь Hero
        //имеет занчение 100
        JOptionPane.showMessageDialog(null, "Количество снаряжения Hero равно " + Hero.weapon);


    }
}
