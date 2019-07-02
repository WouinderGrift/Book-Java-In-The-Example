package AbstractClassesAndMethodes;

import javax.swing.*;

/**
 * !Важная тема!
 *
 * Абстрактный класс тесно связан с наслодованием.
 * Он формирует внешюю оболочку для подклассов и только подклассы наполняют эту оболочку
 * конкретным содержанием - кодом реализующим задачи программы.
 *
 * Абстрактный метод - метод с пустым телом, в котором нет кода... WTF??? O___O
 * Абстрактные методы не могут быть статическими...
 * Если класс является абстрактным, то он не обязательно должен иметь абстрактные методы,
 * Если абстрактный метод есть, то и класс долженг быть таковым.
 *
 * Поскольку абстрактный класс реализован не полностью, невозможно создать его экземпляр.
 * !Объектов абстрактного класса не бывает!
 *
 * Класс-потомок абстрактного класса обязан либо переопределить все абстрактные методы надкласса,
 * либо быть объявлен тоже абстрактным классом. Его атрибут "abstract" наследуется до тех пор, пока все
 * методы не будут переопределены.
 *
 * Этот пример является еще и полиморфизмом, но я его внес в отдельный пакет абстрактных классов
 */

abstract class Forma{
    abstract double area();
}

class Point extends Forma{
    public String toString() { return "Точка";}

    @Override   //площадь точки равна 0
    double area() {
        return 0;
    }
}

class Triangle extends Forma{
    int cathetus1;
    int cathetus2;

    Triangle(int cat1, int cat2){
        cathetus1 = cat1;
        cathetus2 = cat2;
    }

   public String toString(){ return "Треугольник";}

    /**Как видно на примере, мы в каждом подклассе абстрактного класса
     * переопределяем (объявляем заного) абстрактный метод
     * @return
     */

   @Override
    double area(){
       return ((cathetus1 * cathetus2) / 2.0);
   }
}

class Circle extends Forma{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    public String toString(){ return "Круг";}

    @Override
    double area() {
        return ((radius * radius) * 3.14);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Point point = new Point();
        Triangle triangle = new Triangle(5,4);
        Circle circle = new Circle(10);

        Forma[] figure = {point, triangle, circle};
        for(int i = 0; i < figure.length; i++) {
            JOptionPane.showMessageDialog(null, figure[i].toString() + " " + figure[i].area());
        }
        //Если убрать из вывода figure[i].area(); отввет он не вернет
    }
}
