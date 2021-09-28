package validateSDT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    //private static final String PHONE_NUMBER_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";
    private static final String PHONE_NUMBER_REGEX = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";

    public Example(){
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
