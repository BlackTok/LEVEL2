package lesson_3;

import java.util.*;

public class PhoneNumbers {
    private final Map<String, List<String>> phoneMap = new LinkedHashMap<>();

    void add(String surname, String  number) {
        List<String> numbers = new LinkedList<>();
        if (phoneMap.containsKey(surname)) {
            numbers = phoneMap.get(surname);
            if (numbers.contains(number)) {
                System.out.println("Такой номер уже существует");
            } else {
                numbers.add(number);
                System.out.println("Номер добавлен");
            }
        } else {
            numbers.add(number);
            System.out.println("Абонент добавлен");
        }

        phoneMap.put(surname, numbers);
    }

    void get(String surname) {
        if (!phoneMap.containsKey(surname)) {
            System.out.println("Абонента " + surname + " не существует");
            return;
        }
        List<String> numbers = phoneMap.get(surname);

        System.out.println(surname + ":");
        for (String n : numbers) {
            System.out.println(n);
        }
    }
}
