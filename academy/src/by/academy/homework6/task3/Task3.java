package by.academy.homework6.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

    private static final String DIR = "src\\by\\academy\\homework6\\task3\\users";

    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        list.add(new User("Максим", "Абрамович", 20));
        list.add(new User("Илья", "Демко", 21));
        list.add(new User("Владислав", "Клещенок", 22));
        list.add(new User("Андрей", "Таратин", 23));
        list.add(new User("Артем", "Романюк", 24));
        list.add(new User("Александр", "Кисель", 25));
        list.add(new User("Сергей", "Петрович", 26));
        list.add(new User("Дмитрий", "Гапеенко", 27));
        list.add(new User("Антон", "Семашко", 28));
        list.add(new User("Иван", "Булойчик", 29));

        File dir = new File(DIR);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        for (User user : list) {
            String userFileName = user.getName() + "_" + user.getSurname() + ".txt";
            File userFile = new File(dir, userFileName);

            try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(userFile)))) {
                output.writeObject(user);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}