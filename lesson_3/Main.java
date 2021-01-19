package lesson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //list1();

        PhoneNumbers phoneNumbers = new PhoneNumbers();

        phoneNumbers.add("Иванов", "88001111111");
        phoneNumbers.add("Петров", "88002222222");
        phoneNumbers.add("Сидоров", "88003333333");
        phoneNumbers.add("Петров", "88004444444");
        phoneNumbers.add("Петров", "88004444444");

        phoneNumbers.get("Иванов");
        phoneNumbers.get("Петров");
        phoneNumbers.get("Козлов");
    }

    public static void list1() {
        List<String> list = new ArrayList<>(25);
        list.addAll(Arrays.asList("A","B","C","D","E","F","G","H","I","A","C","F"));

        Map<String, Integer> map = new HashMap<>();

        for (String l : list) {
            map.put(l, map.getOrDefault(l, 0) + 1);
        }

        // список уникальных слов
        System.out.println(map.keySet());

        // сколько  раз встречается каждое слово
        System.out.println(map);
    }
}
