package by.academy.homework3.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator{
    public static final String regexp = "\\+1\\d{10}";
    private static final Pattern pattern = Pattern.compile(regexp);

    @Override
    public boolean validate (String strPhoneNumber){
        Matcher matcher = pattern.matcher(strPhoneNumber.trim());
        return matcher.matches();
    }
}