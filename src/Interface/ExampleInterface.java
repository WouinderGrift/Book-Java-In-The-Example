package Interface;

import javax.swing.*;

/**
 * Все деалется также как и абстракные классы, только у них свой рад особенностей
 * Здесь также показанно как использовать указатели в интерфейсах и полиморфизм
 */
interface Moveable{
    String move(int interval, int speed);
}

class Ork implements Moveable {

    @Override
    public String move(int interval, int speed) {
        return "Орк: " + "\nВремя " + interval + "\nСкорость " + speed * 0.5 + "\nРасстояние " + (interval * speed);
    }
}

class OrkMagican extends Ork implements Moveable {
    //даже если я уберу отсюда override, оно все равно работает
    @Override
    public String move(int interval, int speed) {
        return "Орк-Маг: " + "\nВремя " + (interval+5)+  "\nСкорость " + speed * 0.9f + "\nРасстояние " + (interval * speed);
    }
}

class OrkArcher extends Ork implements Moveable {
    //а сюда добавлю
    @Override
    public String move(int interval, int speed) {
        return "Орк-Лучник: " + "\nВремя " + (interval-10) + "\nСкорость " + speed * 1.5f + "\nРасстояние " + (interval * speed);
    }
}

class Werewolf implements Moveable{

    @Override
    public String move(int interval, int speed) {
        return "Оборотень: " + "\nВремя " + (interval-30) + "\nСкорость " + speed*3.5 + "\nРасстояние " + (interval * speed);
    }
}

public class ExampleInterface {
    public static void main(String[] args) {
        Moveable moveable;
        int step = 0;

        Ork ork = new Ork();
        OrkMagican orkMagican = new OrkMagican();
        OrkArcher orkArcher = new OrkArcher();

        Werewolf werewolf = new Werewolf();

        Moveable[] mv = {ork, orkMagican, orkArcher, werewolf};

        for(int i = 0; i < mv.length; i++) {
            moveable = mv[i];
            step = step + 10;
            if (mv[i] instanceof Moveable) {  //проверяет является ли объект к классу или интерфейсу
                JOptionPane.showMessageDialog(null, moveable.move(step, step));
            } else {
                JOptionPane.showMessageDialog(null, "Упс, он потерялся из виду");
            }
        }

    }

}
