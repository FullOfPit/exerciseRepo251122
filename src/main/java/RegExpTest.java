import java.util.regex.*;

public class RegExpTest {

    Pattern p = Pattern.compile("a*b");
    Matcher m = p.matcher("aaaaaab");
    boolean b = m.matches();

    public static void main(String[] args) {

        String testString = "H";
        String testString2 = "184792";
        boolean onlyCharacters = Pattern.matches("[a-zA-Z]", testString);
        boolean numbersAgainstCharacters = Pattern.matches("[abc]", testString2);
        boolean numbersAgainstNumbers = Pattern.matches("[0-9]", testString2);

        System.out.println(onlyCharacters);
        System.out.println(numbersAgainstCharacters);
        System.out.println(numbersAgainstNumbers);



    }
}
