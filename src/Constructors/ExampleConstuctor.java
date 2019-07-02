package Constructors;

import javax.swing.*;

/**
 * Пример создания конструктора без\с параметр(ов\ом)
 * Создание конструктора - способ задать объекту начальные значения
 * Конструктор - специальноый метот вызываемый в момент создания объекта
 * Он используется только для присвоения начальнывх значений переменным объекта.
 */

class StateHero{
    int health, strong, stamina, mana;
    //Конструктор без параметра
        StateHero() {
            health = 10;
            strong = 10;
            stamina = 10;
            mana = 10;
        }
    //Конструктор c параметром
        StateHero (int hp, int dmg, int stm, int mn){
            health = hp;
            strong = dmg;
            stamina = stm;
            mana = mn;
        }
}

class Sword{
    String Name;
    int damage, health, weight, speed;
    Sword(String Nm, int dmg, int hp, int wg, int sd){
        Name = Nm;
        damage = dmg;
        health = hp;
        weight = wg;
        speed = sd;
    }

    int npc_GetDamage(int strong){
        int DMG = damage +((strong * weight) + speed)/4;
        return DMG;
    }

    int sword_GetDamage(int strong){
        int crushedSword = health - strong / 4;
        return crushedSword;
    }
}

public class ExampleConstuctor {
    public static void main(String[] args) {

       StateHero Hero = new StateHero(15, 15,15,15);
        JOptionPane.showMessageDialog(null ,"Параметры героя: " + "\n" +
        "Урон " + Hero.strong + "\n" +
        "Выносливость " + Hero.stamina + "\n" +
        "Мана " + Hero.mana + "\n");

        Sword Dagger = new Sword("Кинжал",30,100, 10, 15);
        JOptionPane.showMessageDialog(null, Dagger.Name + " наносит урон, равный " + Dagger.npc_GetDamage(Hero.strong) + " ед. \n"
        + "В результате ваш " + Dagger.Name.toLowerCase() + " повредился на " + (Dagger.health - Dagger.sword_GetDamage(Hero.strong)) + " ед.");
    }
}
