package KeyWords;

import javax.swing.*;

/**
 * Спецификатор static и статические блоки
 * Он указывает, что метод или переменную можно использовать независимо от какого либо объекта данного класса.
 * Чтобы метод сделать статические, он должен иметь ряд ограничений:
 * 1. метод имеет доступ только к статическим переменным
 * 2. метод может вызывать статические методы
 * 3. метод не может использовать this
 * (не распространяется на main)
 *
 * Иногда нужно выполнить какое-то описание переменных еще до того,
 * как станет возможно физическое создание первого объекта этого класса.
 *
 * К примеру такая инициализация может состоять в установке соединения удаленным компьютером или бд.
 * Для этой цели и есть статические блоки - те блоки команд, которые выполняются намного раньше
 * того момента, когда на основе класса будут созданы объекты.
 */
class ExapleStaticBlocs{
    static double root9;
    static double root27;
    static double root81;
    int num;

    //Статический блок
    static{
        System.out.println("*Инициализация статических данных...");
        root9 = Math.sqrt(9.0);
        root27 = Math.sqrt(27.0);
        root81 = Math.sqrt(81.0);
    }

    ExapleStaticBlocs(int num){
        System.out.println("*Инициализация переменных экземпляра класса...");
        this.num = num;
    }
}

public class StaticBlocks {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Корень из 9 равен " + ExapleStaticBlocs.root9 + "\n "
                + "Корень из 27 равен " + ExapleStaticBlocs.root27 + "\n" +
        "Корень из 81 равен " + ExapleStaticBlocs.root81);

        ExapleStaticBlocs esb4 = new ExapleStaticBlocs(4);
        System.out.println("sb4.num = " + esb4.num);

        ExapleStaticBlocs esb16 = new ExapleStaticBlocs(16);
        System.out.println("sb16.num = " + esb16.num);
    }
}
