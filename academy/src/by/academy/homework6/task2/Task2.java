package by.academy.homework6.task2;

import java.io.*;

public class Task2 {

    private static final String INPUT_FILE_PATH = "src\\by\\academy\\homework6\\tasktwo\\text.txt";
    private static final String OUTPUT_FILE_PATH = "src\\by\\academy\\homework6\\tasktwo\\result.txt";
    private static final String DIR = "src\\by\\academy\\homework6\\tasktwo";

    public static void main(String[] args) {

        File dir = new File(DIR);

        if (!dir.exists()) {
            dir.mkdirs();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_PATH));
             BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE_PATH))) {

            File outputFile = new File(OUTPUT_FILE_PATH);
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }

            String str;
            while ((str = reader.readLine()) != null) {
                writer.write(str.replaceAll("\\s", ""));
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}