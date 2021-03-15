package by.academy.homework6.taskfour;

import java.io.*;
import java.util.Random;

public class Taskfour {
    private static final String INPUT_FILE_PATH = "src\\by\\academy\\homework6\\tasktwo\\text.txt";
    private static final String OUTPUT_FILE_PATH = "src\\by\\academy\\homework6\\taskfour\\result.txt";
    private static final String DIR = "src\\by\\academy\\homework6\\taskfour\\files";

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String str;
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_PATH))) {
            while ((str = reader.readLine()) != null) {
                sb.append(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File dir = new File(DIR);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        Random random = new Random();
        File fileOutput = new File(OUTPUT_FILE_PATH);
        try (BufferedWriter writerResult = new BufferedWriter(new FileWriter(OUTPUT_FILE_PATH))) {
            if (!fileOutput.exists()) {
                fileOutput.createNewFile();
            }

            for (int i = 0; i < 100; i++) {
                File file = new File(dir, (i + 1) + ".txt");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    writer.write(sb.substring(0, random.nextInt(sb.length() + 1)));
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

                writerResult.write(file.getName() + ", размер " + file.length() + " байт");
                writerResult.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
