package HelloWorld;

public class Lesson3 {
	
	public static void main(String[] args) {
		int s = 370_000;
		int sec;
		int m;
		int min;
		int h;
		int day;
		int week;
		sec = s % 60;
		m = (s-sec) / 60;
		min = m % 60;
		h = (m -min) / 60;
		int hour = h % 24;
		System.out.println (hour + "часов" + min + "минут" +sec + "секунд");
		
		int d = (h - hour) / 24;
		int day1 = h%7;
		System.out.println(day1 + "суток");
		
}
}
