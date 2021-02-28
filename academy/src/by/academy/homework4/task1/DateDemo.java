package by.academy.homework4.task1;

public class DateDemo {

    public static void main(String[] args) {
        Date date1 = new Date("26-02-2020");
        Date date2 = new Date("23-02-2021");
        date2.setDate("28-02-2021");
        System.out.println(date1.getDay());
        System.out.println(date2.getDayOfWeek());
        System.out.println(date1.getDaysBetweenTwoDates(date2));
        System.out.println(date1.isLeapYear());
    }
}
