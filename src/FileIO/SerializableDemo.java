package FileIO;

import java.io.*;
import java.util.Scanner;

/**
 * Язык программирования Java поддерживает механизм, который может представить объекты могут быть представлены в виде последовательности байтов, которая содержит информацию как сам объект, так и информацию о типе объекта и типах данных, которые хранятся в этом объекте.
 * <p>
 * ТАкой мехнизм называется сериализацией.
 * <p>
 * После того, как сериализованный объект записан в виде файла, он может быть прочитан из файла и десериализован, то есть, восстановлен из памяти.
 * <p>
 * Наиболее важным моментом является то, что этот процесс не зависит от JVM, т.е. объект может быть сериализован на одной платформе, а десериализован (полностью воспроизведён) на абсолютно другой.
 * <p>
 * Такие классы, как ObjectInputStream и ObjectOutputStream, являются потоками, которые содержат методы для сериализации и десериализации объектов.
 * <p>
 * Для того, чтобы класс мог быть сериализован, должны быть соблюдены определённые условия:
 * <p>
 * Класс должен имплементировать интерфейс java.io.Serializable
 * Все поля класса должны быть сериализованы. Поля, которые мы хотим исключить, должны быть отмечены, как transient.
 */

class Developer implements Serializable {
    //transient - означает поле которое не надо сериализовывать
    private String name, speciality;
    private int experience, salary;

    public Developer(String name, String speciality, int experience, int salary) {
        this.name = name;
        this.speciality = speciality;
        this.experience = experience;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void DoJob() {
        System.out.println(this.speciality + " developer " + this.name + " is writing code...");
    }

    @Override
    public String toString() {
        return "Info: " +
                "\nName: " + name +
                "\nSpeciality: " + speciality +
                "\nExperience: " + experience +
                "\nSalary: " + salary + "\n";
    }
}

public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Developer developer = new Developer("Dima", "Java & C#", 5000, 5000);

        FileOutputStream fileOutputStream = new FileOutputStream("resources/Dima.info");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        outputStream.writeObject(developer);
        outputStream.close();
        fileOutputStream.close();

        System.out.println("Developer serialize successfully");

        Scanner sc = new Scanner(System.in);
        System.out.println("Wanna deserialization Dima.info? Y/N");

        while (true) {
            String sel = sc.next();
            if (sel.toUpperCase().equals("Y")) {
                DeserializationDemo deserializationDemo = new DeserializationDemo();
                deserializationDemo.mainus();
                break;
            } else if (sel.toUpperCase().equals("N")) {
                System.out.println("Ohhl, well bue");
                System.exit(0);
            } else {
                System.out.println("Sorry?");
            }
        }

    }
}

class DeserializationDemo {
    public void mainus() throws IOException, ClassNotFoundException {
        Developer developer = null;

        FileInputStream fileInputStream = new FileInputStream("resources/Dima.info");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

        developer = (Developer)inputStream.readObject();
        inputStream.close();
        fileInputStream.close();

        System.out.println("Deserializing Developer: \n");
        System.out.println(developer);
    }
}
