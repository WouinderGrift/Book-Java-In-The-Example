package Recursion;

import javax.swing.*;

/**
 * !Это выжный пример!
 * Рекурсия - метод который вызывает сам себя называется рекурсией
 * Рекурсия образует бесконечный цикл, по этому там должно быть предусмотренно условие выхода из цикла
 *
 * Когда рекурсивный метод вызывает нового себя, параметры и локальные переменные текущего экземпляра сохраняются в стеке.
 * когда вызванный экземпляр возвращает управление, они извлекаются из стека. Если вызовов слишком много, стек может переполниться
 * и вызовет ошибку.
 * Примеры (Просмотр папок на диске, алгоритм быстрой сортировки QuickSort)
 */
class FactorialCicles{
    //Вычисление I - Iteration
    static long computeI (int n){
        long result = 1;
        for(int i = 1; i <= n; i++){
            result *=i;
        }
        return result;
    }

    //Вычисление R = recursion
    static long computeR (int n){
        if(n == 1) { return n;}
        return  computeR(n-1)*n;
    }
}

public class Factorial {
    public static void main(String[] args) {
        //Вычисление факториала в цикле
        FactorialCicles f = new FactorialCicles();
        System.out.println("Вычисление факториала в цикле: ");
        for (int i = 6; i > 0; i--){
            System.out.println(i + "! = " + FactorialCicles.computeI(i));
        }

        //Вычисление факториала рекурсией
        System.out.println("Вычисление факториала рекурсией: ");
        for(int r = 1; r <= 6; r++){
            System.out.println(r + "! = " + FactorialCicles.computeR(r));
        }

    }
}
