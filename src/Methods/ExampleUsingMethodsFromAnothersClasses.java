package Methods;

import javax.swing.*;

/**
 * Пример использования методов
 */
class StateW{
    String Name;
    int damage;
    int health;
    int weight;

    //Метод
    void StateAfterShoot(double strongShoot){
        int damageShoot = (int) (damage * strongShoot);
        int healthSword = health - (damageShoot * weight)/3;

        JOptionPane.showMessageDialog(null, "нанесет урон, равный " + damageShoot + " ед." + "\n" +
        " и его меч останется цел на " + healthSword + " ед.");

    }
    //==========================================================
}

public class ExampleUsingMethodsFromAnothersClasses {
    public static void main(String[] args) {
        Methods.StateW Dagger = new Methods.StateW();
        Dagger.Name = "кинжалом";
        Dagger.damage = 50;
        Dagger.health = 100;
        Dagger.weight = 30;

        Methods.StateW Excalibure = new Methods.StateW();
        Excalibure.Name = "экскалибур";
        Excalibure.damage = 500;
        Excalibure.health = 100;
        Excalibure.weight = 1000;

        double strongHero = 1.5;
        JOptionPane.showMessageDialog(null, "Игрок с " + Dagger.Name + " ");
        Dagger.StateAfterShoot(strongHero);

        JOptionPane.showMessageDialog(null, "Игрок с " + Excalibure.Name + " ");
       Excalibure.StateAfterShoot(strongHero);
    }
}
