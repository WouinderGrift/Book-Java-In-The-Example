package PrincipleOOP.Polymorphism;

import javax.swing.*;

/**
 * !Важная тема!
 *
 * Введение
 * В пакете Legacy приведен пример настоящих возможностей этой техники,
 * но не показывает настоящих возможностей этой техники.
 *
 * Удивительно, что переменная типа суперкласса может указывать на экземпляр подкласса,
 * и в этом случае Java выберит соответствующий метод динамически.
 *
 * Таким образом, можно обращаться с объектами надкласса и подкласса единообразно,
 * а реагировать на такое обращение они будут по разному. Такое поведение и называется полиморфизмом
 *
 * Если говорить в целом, то полиморфизм – это способность объекта иметь несколько форм. Если мы говрим об ООП, то здесь примером полиморфизма может служить перегрузка методов.
 * Необходимо помнить, что мы можем получить доступ к объекту только с помощью ссылочной переменной. Ссылочная переменная может иметь только один единственный тип. После того, как мы объявили переменную с определённым типом, мы уже не можем его изменить.
 *  Эта ссылка может быть пренеаправлена на другой объект, только если она не была объявлена, как финальная. И тип этой переменной будет определять какие методы она может вызвать.
 */

class Pistol{
    int ammo, magasine;
    Pistol(int ammo, int magasine){
        this.ammo = ammo;
        this.magasine = magasine;
    }

    public String toString(){
        return "Патроны: " + magasine + "/" + ammo;
    }
}

//расширяем пистолет до другого пистолета с прицелом
class PistolScope extends Pistol{
    boolean scope;
    PistolScope(boolean scope){
        this(10, 50, true);
    }

    PistolScope(int am, int mg, boolean scope){
        super(am, mg);
        this.scope = scope;
    }

    public String toString(){
        return "Патроны: " + ammo + "/" +  magasine + " Прицел: " + scope;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        PistolScope pistolScope = new PistolScope(true);
        Pistol pistol = new Pistol(30,7);


          //Поместим эти в массив типа pistol
         Pistol[] pis = {pistolScope, pistol};
         for(int i = 0; i < pis.length; i++){
             JOptionPane.showMessageDialog(null, pis[i].toString());
         }
    }
}