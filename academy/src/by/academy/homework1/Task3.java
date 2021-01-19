package by.academy.homework1;
import java.util.Scanner;
public class Task3 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("введите число от 1 до 10");
	        int number = sc.nextInt();
	        System.out.println("Таблица умножения для " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(i * number);
	        }
	        sc.close();
	    }
	}

