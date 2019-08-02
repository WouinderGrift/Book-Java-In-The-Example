package CollectionFramework.OldDataStructure;

import java.util.Enumeration;
import java.util.Properties;

/**
 Properties является подклассом Hashtable.
 Этот класс хранит элементы типа “ключ – значения”, в котором в качестве ключа выступает строка (String).
 Множество классов в языке программирования используют эту структуру данных.
 */

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Enumeration countries; String country;

        capitals.put("Dubai", "Abu Dhaby");
        capitals.put("Espanol", "Madrid");
        capitals.put("France", "Paris");
        capitals.put("Italy", "Rome");
        capitals.put("Andorra", "Andorra-La-Vella");

        countries = capitals.keys();

        while (countries.hasMoreElements()) {
            country = (String) countries.nextElement();
            System.out.println(capitals.getProperty(country) + " is the capital of " + country);
        }
    }
}
