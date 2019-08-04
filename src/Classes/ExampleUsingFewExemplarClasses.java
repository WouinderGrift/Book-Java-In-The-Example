package Classes;

import javax.swing.*;

/**
 * Пример использования нескольких экземпляров одного класса
 * О модификаторах доступа, всего их 4:
 *
 * 1. Private - когда доступ к элементу возможен только из класса,
 * где этот элемент объявлен. Но из другого класса можно получить доступ
 * написав get метод( он представляет из себя публичный метод с возвращаемым значением)
 *
 * 2. Public - доступ к элементу можно получить даже из далекой далекой галактики
 *
 * 3. Protected - доступ к элементу можно получить из подклассов этого класса
 * или других классов одного пакета.
 *
 * 4. Якобы дружественный доступ (когда не указан тип доступа) - возможен из любого класса
 * или там, где он обитает (если он не заключен в скобочки)
 */


class WeaponsOfHero {
   private int sword;
   public int bows;
   protected int arrows;
    int potion;
    int acid;

    int UnitAmmunition(){
        return sword + bows + arrows + potion + acid;
    }
//get method
    public int getSword() {
        return sword;
    }
//set method
    public void setSword(int sword) {
        this.sword = sword;
    }
}

public class ExampleUsingFewExemplarClasses {
    public static void main(String[] args) {
        //Экземпляры одного класса
        WeaponsOfHero LordOfTheDarkness = new WeaponsOfHero();
        LordOfTheDarkness.setSword(4);
        LordOfTheDarkness.bows = 3;
        LordOfTheDarkness.arrows = 10;
        LordOfTheDarkness.potion = 5;
        LordOfTheDarkness.acid  = 4;

        WeaponsOfHero LordOfTheLightness = new WeaponsOfHero();
        LordOfTheLightness.setSword(4);
        LordOfTheLightness.bows = 4;
        LordOfTheLightness.arrows = 10;
        LordOfTheLightness.potion = 5;
        LordOfTheLightness.acid = 0;

        JOptionPane.showMessageDialog(null, "Количетсво снаряжения у" + "\n" + "Лорда Тьмы " + LordOfTheDarkness.UnitAmmunition() + "\n" +
        "Лорда Света " + LordOfTheLightness.UnitAmmunition());

    }
}
