package by.academy.homework1;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип данных");
        String dataType = sc.next();
        switch (dataType) {
            case "int" -> {
                System.out.println("Введите переменную типа int");
                int a1 = sc.nextInt();
                System.out.println(a1 % 2);
            }
            case "double" -> {
                System.out.println("Введите переменную типа double");
                double a2 = sc.nextDouble();
                System.out.println(a2 * 0.7);
            }
            case "float" -> {
                System.out.println("Введите переменную типа float");
                float a3 = sc.nextFloat();
                System.out.println(a3 * a3);
            }
            case "char" -> {
                System.out.println("Введите переменную типа char");
                char a4 = sc.next().charAt(0);
                System.out.println((int) a4);
            }
            case "String" -> {
                System.out.println("Введите переменную типа String");
                String a5 = sc.next();
                System.out.println("Hello " + a5);
            }
            default -> System.out.println("Unsupported type");
        }

        sc.close();
    }
}

