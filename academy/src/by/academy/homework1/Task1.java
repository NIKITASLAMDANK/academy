package by.academy.homework1;
import java.util.Scanner;
public class Task1 {
		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter sum");
	        double a = sc.nextDouble();
	        System.out.println("Enter age");
	        int b = sc.nextInt();
	        System.out.println("Sum with a discount: " + amountToPlay(a, b));
	        sc.close();
	    }

	    public static double amountToPlay(double a, int b) {
	        if (a >= 400) {
	            a = a*0.8;
	        } else if (a >= 300) {
	            a = a*0.85;
	        } else if (a >= 200) {
	            if (b > 18) {
	                a = a*0.84;
	            } else {
	                a = a*0.91;
	            }
	        } else if (a >= 100) {
	            a = a*0.93;
	        } else {
	            a = a*0.95;
	        }
	        return a;
	    }
	}

