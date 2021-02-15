package by.academy.homework3.general;

import  by.academy.homework3.Validator.AmericanPhoneValidator;
import by.academy.homework3.Validator.BelarusPhoneValidator;
import by.academy.homework3.Validator.DateValidator;
import by.academy.homework3.Validator.EmailValidator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User extends Person {
    private Date dateOfBirth;
    private String phoneNumber;
    private String email;
    private final static Pattern pattern = Pattern.compile("-");
    private final static DateValidator dv = new DateValidator();
    private final static AmericanPhoneValidator apv = new AmericanPhoneValidator();
    private final static BelarusPhoneValidator bpv = new BelarusPhoneValidator();
    private final static EmailValidator ev = new EmailValidator();

    public User() {
        super();
    }

    public User(String name, Double money, Date dateOfBirth, String phone, String email) {
        super(name, money);
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phone;
        this.email = email;
    }

    public void readNewUser() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше ФИО");
        setName(sc.nextLine());

        System.out.println("Введите располагаемое количество денег в y.e.($)");
        setMoney(sc.nextDouble());

        sc.nextLine();
        System.out.println("Введите дату рождения в формате dd/MM/yyyy или dd-MM-yyyy");
        String dateOfBirth = sc.nextLine();
        while (!dv.validate(dateOfBirth)) {
            System.out.println("Введите дату рождения корректно");
            dateOfBirth = sc.nextLine();
        }
        setDateOfBirth(dateOfBirth);

        System.out.println("Введите ваш номер телефона");
        phoneNumber = sc.nextLine();
        while (!apv.validate(phoneNumber) && !bpv.validate(phoneNumber)) {
            System.out.println("Введите номер телефона корректно");
            phoneNumber = sc.nextLine();
        }

        System.out.println("Введите вашу электронную почту");
        email = sc.nextLine();
        while (!ev.validate(email)) {
            System.out.println("Введите электронную почту корректно");
            email = sc.nextLine();
        }
    }

    public void setDateOfBirth(String strDate) throws ParseException {
        Matcher matcher = pattern.matcher(strDate.trim());
        if (matcher.find()) {
            dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").parse(strDate);
        } else {
            dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
        }
    }

    public String getDateOfBirth() {
        return "день: " + dateOfBirth.getDate() + ", месяц: " + (dateOfBirth.getMonth() + 1) + ", год: " + (dateOfBirth.getYear() + 1900);
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Пользователь{");
        sb.append("Имя - ").append(getName());
        sb.append(", деньги на момент сделки - ").append(getMoney()).append("$");
        sb.append(", дата рождения - ").append(getDateOfBirth());
        sb.append(", номер мобильного телефона - ").append(phoneNumber);
        sb.append(", электронная почта - ").append(email);
        sb.append('}');
        return sb.toString();
    }
}