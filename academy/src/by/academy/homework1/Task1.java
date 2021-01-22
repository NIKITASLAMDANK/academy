package by.academy.homework1;
import java.util.Scanner;
public class Task1 {
		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter sum");
	        double a = sc.nextDouble();
	        System.out.println("Enter age");
	        int b = sc.nextInt();
	        System.out.println("Sum with a discount: " + sumpay(a, b));
	        sc.close();
	    }

	    public static double sumpay(double a, int b) {
	    	if (a < 100) {
				a -= a * 5 / 100;
			}
			if (a >= 100 && a < 200) {
				a -= a * 7 / 100;
			}
			if (a >= 200 && a < 300) {
				if (b > 18) {
					a -= a * 16 / 100;
				} else
					a -= a * 9 / 100;
			}
			if (a >= 300 && a < 400) {
				a -= a * 15 / 100;
			}
			if (a >= 400) {
				a -= a * 20 / 100;
			}
	        return a;
	    }
	}

