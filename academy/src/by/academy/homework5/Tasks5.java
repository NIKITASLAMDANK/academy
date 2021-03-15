package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;

public class Tasks5 {

    private static final String str = "Можно писать все в main. Не нужно создавать новых классов. Имеется текст." +
            " Следует составить для него частотный словарь: Создать Map<Character, Integer> для символов," +
            " в который мы заносим символ и его количество.";

    public static void main(String[] args) {
        char[] chars = str.replaceAll("[^a-zA_Zа-яёА-ЯЁ]", "").toLowerCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        fillInMap(map, chars);

        System.out.println("Частотный словарь");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static void fillInMap(Map<Character, Integer> map, char[] chars) {
        for (char oneChar : chars) {
            if (!map.containsKey(oneChar)) {
                map.put(oneChar, 1);
            } else {
                map.put(oneChar, map.get(oneChar) + 1);
            }
        }
    }
}