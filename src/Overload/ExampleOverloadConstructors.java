package Overload;

import javax.swing.*;

/**
 * Пример перегружаемых конструкторов
 * Когда определить конструктор с параметрами, это сделало невозможным использование
 * старого конструктора без параметров. Если нужно, чтобы конструктор без параметров
 * был доступен, его нужно объявить дополнительно
 */

class Yachta {
    String Name;
    int weight;
    int height;
    int cabine;
    Yachta(){
        this("Bigest Yachta", 15, 6, 50);
    }

    Yachta(String Name, int weight, int height, int cabine){
        this.Name = Name;
        this.weight = weight;
        this.height = height;
        this.cabine = cabine;
    }
    double price (int uslow) {
        return price ((double) uslow);
    }
    double price (double uslow){
        double value = this.weight * this.height * this.cabine * uslow;
        return  value;
    }

}
public class ExampleOverloadConstructors {
    public static void main(String[] args) {
        Yachta yachta = new Yachta();

        JOptionPane.showMessageDialog(null, "Цена яхты " + yachta.Name + " равна " + yachta.price(30));
    }
}
