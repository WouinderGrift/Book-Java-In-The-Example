package PrincipleOOP.Legacy;

import javax.swing.*;

/**
 * Пример конструктора в наследственном классе, и обходом private
 * Конструкторы подкласса и ключеваое слово Super
 * И так ясно, что подкласс имееет свой конструктор он нужен для унаследования переменных.
 * Если они все открытые, то все нормально, а если нет?
 * То для этого нужно слово super, которое работает так же как и слово this
 * Отличие только в том, что оно указывает, что нужно вызвать в конструктор подкласса
 */

class elf_Warior{
    private int health, stamina, strong;

    elf_Warior(int hp, int stm, int str){
        health = hp;
        stamina = stm;
        strong = str;
    }

    public int getHealth() {
        return health;
    }

    public int getStrong() {
        return strong;
    }

    public int getStamina() {
        return stamina;
    }
}

// Так выглядит подкласс (расширение орка до мага)
class elf_Magican extends elf_Warior{
   private int mana;

    elf_Magican(int hp, int stm, int str, int mn) {
        super(hp, stm, str);
        mana = mn;
    }

    public int getMana() {
        return mana;
    }
}

public class ExampleConstuctorsSubclassesAndWorldSuper {
    public static void main(String[] args) {
        elf_Magican elfMagic = new elf_Magican(100, 100, 10, 100);

        JOptionPane.showMessageDialog(null, "Эльф-Маг: " +
                "\nЖизни " + elfMagic.getHealth() +
                "\nВыносливость " + elfMagic.getStamina() +
                "\nСила " + elfMagic.getStrong() +
                "\nМана " + elfMagic.getMana()); //а здесь смогли

    }
}
