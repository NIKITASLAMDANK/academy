package by.academy.homework3.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    public static final String regexp = "\\w+@\\w+\\.[a-zA-Z]{2,4}";
    private static final Pattern pattern = Pattern.compile(regexp);

    @Override
    public boolean validate(String strEmail) {
        Matcher matcher = pattern.matcher(strEmail.trim());
        return matcher.matches();
    }
}