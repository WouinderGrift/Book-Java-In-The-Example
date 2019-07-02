package Methods;

import javax.swing.*;

/**
 * Пример использования методов возвращающих значение
 * (по производительности этот код не оптимизирован, но он корректен (с)))
 */

 class StateWeapon{
        String Name;
        int damage;
        int health;
        int weight;

        //Методы возвращающие значения
        int StateAfterShoot(double strongShoot){
            int damageShoot = (int) (damage * strongShoot);
            return damageShoot;
        }

        int StateHealthAfterShoot(int damageShoot){
            int healthSword = health - (damageShoot * weight)/3;
            return healthSword;
        }
        //========================================================
 }

public class ExampleMethodReturnValue {
    public static void main(String[] args) {
        StateWeapon Dagger = new StateWeapon();
        Dagger.Name = "кинжалом";
        Dagger.damage = 50;
        Dagger.health = 100;
        Dagger.weight = 30;

        StateWeapon Excalibure = new StateWeapon();
        Excalibure.Name = "экскалибур";
        Excalibure.damage = 500;
        Excalibure.health = 100;
        Excalibure.weight = 1000;

        double strongHero = 1.5;
        JOptionPane.showMessageDialog(null, "Игрок с " + Dagger.Name + " нанесет урона " + Dagger.StateAfterShoot(strongHero) + " ед." + "\n"+
        " и повредит свой меч на " + Dagger.StateHealthAfterShoot(Dagger.StateAfterShoot(strongHero)));

        JOptionPane.showMessageDialog(null, "Игрок с " + Excalibure.Name + " нанесет урона " + Excalibure.StateAfterShoot(strongHero) + " ед." + "\n"+
                " и повредит свой меч на " + Excalibure.StateHealthAfterShoot(Excalibure.StateAfterShoot(strongHero)));

    }
}