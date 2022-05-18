import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSum {
    public StringSum(String sumNumbersOfString){
    Pattern pattern = Pattern.compile("(\\d+)");
    Matcher matcher = pattern.matcher(sumNumbersOfString);
    Integer sum = 0;
while (matcher.find()) {
        sum += Integer.parseInt(matcher.group(1));

    }
        System.out.printf("%d\n", sum);
}}
