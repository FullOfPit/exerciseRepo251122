

import java.util.regex.*;

public class Main {

    public static boolean checkPassword(String password) {

        String characterContainer = "^(?=.\\p{Punct})(?=.*\\d)(?=.*[a-zA-Z])?";
        return password.length() > 6 && Pattern.matches(characterContainer, password);
    }
        /*
        boolean lengthCheck = false;
        boolean containsCapitals = false;
        boolean containsNumbers = false;
        boolean containsSpecials = false;

        lengthCheck = password.length() > 6;

        for (int i = 0; i < password.length(); i++) {
            containsCapitals = Pattern.matches(characterContainer, Character.toString(password.charAt(i)));
            containsNumbers = Pattern.matches(characterContainer,  Character.toString(password.charAt(i)));
            containsSpecials = Pattern.matches(characterContainer,  Character.toString(password.charAt(i)));
        }
        // "^(?=.*\\d)(?=.*[])$"


        //char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] capitals = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] specials = {'!', '.', ':', '-', '_', ',', ';', '+', '*'};
        if(password.length() > 6) {
            lengthCheck = true;
        }

        for (int i = 0; i < password.length(); i++) {

            for (char capital : capitals) {
                if (password.charAt(i) == capital) {
                    containsCapitals = true;
                    break;
                }
            }
            /*              -- OLD --
            for (int j = 0; j < capitals.length; j++) {
                if (password.charAt(i) == capitals[j]) {
                    containsCapitals = true;
                    break;
                }
            }


            for (char number : numbers) {
                if (password.charAt(i) == number) {
                    containsNumbers = true;
                    break;
                }
            }
            for (char special : specials) {
                if (password.charAt(i) == special) {
                    containsSpecials = true;
                    break;
                }
            }
        }




        return lengthCheck && containsCapitals && containsNumbers && containsSpecials;
        */

        //return true;


    public static void main(String[] args) {


    }
}
