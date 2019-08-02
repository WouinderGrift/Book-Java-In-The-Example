package CollectionFramework.OldDataStructure;

import java.util.BitSet;

/**
 * Класс BitSetDemo создаёт определённый вид массива, который содержит битовые значения. Эта структура данных является динамической, т.е. её размер может быть увеличен при необходимости.
 * <p>
 * С конструкторами и методами этого класса можно ознакомиться в официальной документации.
 * <p>
 * Для понимания того, как это работает на практике, рассмотрим пример простого приложения.
 */

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSetOne = new BitSet(8);
        BitSet bitSetTwo = new BitSet(8);

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                bitSetOne.set(i);
            } else {
                bitSetTwo.set(i);
            }

        }

        System.out.println("bitSetOne: " + bitSetOne);
        System.out.println("bitSetTwo: " + bitSetTwo);

        System.out.println("\n=======================\n");

        System.out.println("bitSetOne.xor(bitSetTwo): ");
        bitSetOne.xor(bitSetTwo);

        System.out.println(bitSetOne);
        System.out.println("\n=======================\n");

        System.out.println("bitSetTwo.and(bitSetOwo): ");
        bitSetTwo.and(bitSetOne);
        System.out.println(bitSetTwo);

        System.out.println("\n=======================\n");

    }
}
