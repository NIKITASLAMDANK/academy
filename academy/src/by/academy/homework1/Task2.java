package by.academy.homework1;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите тип данных");
        String dataType = sc.next();
        switch (dataType) {
            case "int" -> {
                System.out.println("¬ведите переменную типа int");
                int variable = sc.nextInt();
                System.out.println(variable % 2);
            }
            case "double" -> {
                System.out.println("¬ведите переменную типа double");
                double variable = sc.nextDouble();
                System.out.println(variable * 0.7);
            }
            case "float" -> {
                System.out.println("¬ведите переменную типа float");
                float variable = sc.nextFloat();
                System.out.println(variable * variable);
            }
            case "char" -> {
                System.out.println("¬ведите переменную типа char");
                char variable = sc.next().charAt(0);
                System.out.println((int) variable);
            }
            case "String" -> {
                System.out.println("¬ведите переменную типа String");
                String variable = sc.next();
                System.out.println("Hello " + variable);
            }
            default -> System.out.println("Unsupported type");
        }

        sc.close();
    }
}

