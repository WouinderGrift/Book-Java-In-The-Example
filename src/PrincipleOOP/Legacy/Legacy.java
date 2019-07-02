package PrincipleOOP.Legacy;

import javax.swing.*;

/**
 * !Важная тема!
 *
 * Введение
 * К принципам ООП относятся:
 * Изоляция данных, наследие, полиморфизм.
 * Изоляция сводится к тому, чтобы как можно меньше данных
 * о внутреннем устройстве класса должно быть известно с наружи класса.
 * (Данные должны быть скрыты от внешнего мира, в доступ к ним осуществлять через
 * get, set методы, ссмотреть ExampleUsingFewExemplarClasses)
 *
 *Наследование
 * Его цель является упорядочить классы в древовидную иерархию.
 * Образуется она так: в основу ее кладется самый большой класс,
 * описывающий только основные признаки, позволяющие отнести объекты к одной категории.
 *
 * Общий класс называется (базовый класс), а наследующий класс (подклассом).
 * Таким образом, подкласс является уточненным вариантом надкласса.
 *
 * Наследовaние - это расширение базового класса дополнительными элементами и методами.
 * Но оно не дает право доступа к закрытым членам надкласса
 */

//Так выглядит наш надкласс (общий шаблон орка)
class ork_Warior{
   int health, stamina, strong;

    ork_Warior(){
        health = 100;
        stamina = 100;
        strong = 10;
    }

}

// Так выглядит подкласс (расширение орка до мага)
class ork_Magican extends ork_Warior{
    int mana  = 100;

}
// Как мы видим от одного класса можно вести несколько подклассов (Лучник)
class ork_Arrcher extends ork_Warior {
    int arrow = 45;
}
// И подкласс от подкласса тоже можно проводить (УберМаг)
class ork_SuperUberMagican extends ork_Magican {
    boolean UberThings = true;
    String ReTrue;

    String RenameTrue(boolean UberThings){
       if(UberThings) {
           ReTrue = "А у меня есть убер штучка Ха-ха";
       } else {
           ReTrue = "У меня ее нету плак - плак";
       }
       return ReTrue;
    }

}

public class Legacy {

    public static void main(String[] args) {
        ork_Warior orkWarior = new ork_Warior();
        JOptionPane.showMessageDialog(null, "Орк-Берсерк: " +
                "\nЖизни " + orkWarior.health +
                "\nВыносливость " + orkWarior.stamina +
                "\nСила " + orkWarior.strong);
        /* Этот параметр мы не сможем добавить в орка война
               + "\nМана " + orkWarior.mana); */

        ork_Magican orkMagic = new ork_Magican();

       JOptionPane.showMessageDialog(null, "Орк-Маг: " +
                "\nЖизни " + orkMagic.health +
        "\nВыносливость " + orkMagic.stamina +
        "\nСила " + orkMagic.strong +
        "\nМана " + orkMagic.mana); //а здесь смогли

        ork_Arrcher orkArrcher = new ork_Arrcher();

        JOptionPane.showMessageDialog(null, "Орк-Лучник: " +
                "\nЖизни " + orkArrcher.health +
                "\nВыносливость " + orkArrcher.stamina +
                "\nСила " + orkArrcher.strong +
                "\nСтрелы " + orkArrcher.arrow); //и здесь смогли

        ork_SuperUberMagican orkSuperUberMagican = new ork_SuperUberMagican();

        JOptionPane.showMessageDialog(null, "Орк-CуперУберМагикан: " +
                "\nЖизни " + orkSuperUberMagican.health +
                "\nВыносливость " + orkSuperUberMagican.stamina +
                "\nСила " + orkSuperUberMagican.strong +
                "\nУбер Штучка " + orkSuperUberMagican.RenameTrue(orkSuperUberMagican.UberThings)); //и вот здесь смогли
    }
}
