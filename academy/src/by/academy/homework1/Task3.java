package by.academy.homework1;
import java.util.Scanner;
public class Task3 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("������� ����� �� 1 �� 10");
	        int number = sc.nextInt();
	        System.out.println("������� ��������� ��� ����� " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(i * number);
	        }
	        sc.close();
	    }
	}

