package by.academy.homework6.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    private static final String OUTPUT_FILE_PATH = "src\\by\\academy\\homework6\\task1\\task1.txt";
    private static final String DIR = "src\\by\\academy\\homework6\\task1";

    public static void main(String[] args) {

        File dir = new File(DIR);

        if (!dir.exists()) {
            dir.mkdirs();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE_PATH));
             Scanner scanner = new Scanner(System.in)) {

            File outputFile = new File(OUTPUT_FILE_PATH);
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }

            String str = scanner.nextLine();
            while (!"stop".equals(str)) {
                writer.write(str);
                writer.newLine();
                str = scanner.nextLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}