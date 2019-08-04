package Overload;

import javax.swing.*;

/**
 * Пример перегружаемых методов
 * Сигнатурой метода является его имя, набоор параметров и их типы
 * В классе не могут быть два одинаковых метода, но компилятор различает по сигнатуре
 * Таким образом в классе могут быть несколько одинаковых имен метода, но с разным набором параметров
 * Использование методов с одинаковым именем, на разными параметрами -
 * называется перегрузкой методов, а сами методы перегружаемыми.
 *
 * Перегрузка - много одинаковых методов с разной сигнатурой в одном классе.
 * Переопределение - наследование метода многим классам из основного класса.
 */
class Basket{
    void pay (double money){
        JOptionPane.showMessageDialog(null, "Оплачено наличными: " + money);
    }

    void pay (String cardNum){
        JOptionPane.showMessageDialog(null, "Оплачено по карте #" + cardNum);
    }

    void pay (String accountNum, String backCode) {
        JOptionPane.showMessageDialog(null, "Переведенно на счет #" + accountNum + " в банке " + backCode);
    }

}
public class ExampleOverloadMethodes {
    public static void main(String[] args) {
        Basket b1 = new Basket();

        b1.pay(1500.0);
        b1.pay ("564756858");
        b1.pay ("547546845", "5500");
    }
}
