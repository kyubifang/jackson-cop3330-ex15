package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_verify() {
        App myApp = new App();
        String password = "abc$123";
        String login = "12345";
        boolean verify = password.equals(login);
        String expectedOutput = "I don't know you.";
        String actualOutput = myApp.generateOutputString(verify);

        assertEquals(expectedOutput, actualOutput);
    }
}