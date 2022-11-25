import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkPasswordTooShort() {
        //Given
        String password = "2.Klm";
        //When
        boolean actual = Main.checkPassword(password);
        //Then
        //Assertions.assertEquals(false, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordOnlyLetters() {
        //Given
        String password = "gHilamsjesfa";
        //When
        boolean actual = Main.checkPassword(password);
        //Then
        //Assertions.assertEquals(false, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordOnlyNumbers() {
        //Given
        String password = "1947234827";
        //When
        boolean actual = Main.checkPassword(password);
        //Then
        //Assertions.assertEquals(false, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordOnlySpecialCharacters() {
        //Given
        String password = "-.-.-+-.+.-+.";
        //When
        boolean actual = Main.checkPassword(password);
        //Then
        //Assertions.assertEquals(false, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordOnlyCapitals() {
        //Given
        String password = "HDKSOFKCLEJF";
        //When
        boolean actual = Main.checkPassword(password);
        //Then
        //Assertions.assertEquals(false, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordNoNumbers() {
        //Given
        String password = "Ksm.opjsk--k";
        //When
        boolean actual = Main.checkPassword(password);
        //Then
        //Assertions.assertEquals(false, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordNoSpecialCharacters() {
        //Given
        String password = "kcHU9382msl";
        //When
        boolean actual = Main.checkPassword(password);
        //Then
        //Assertions.assertEquals(false, actual);
        Assertions.assertFalse(actual);
    }

    @Test
    void checkPasswordNoCapitals() {
        //Given
        String password = "hdk98nk.-d";
        //When
        boolean actual = Main.checkPassword(password);
        //Then
        //Assertions.assertEquals(false, actual);
        Assertions.assertFalse(actual);

    }



}