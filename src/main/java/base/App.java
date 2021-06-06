/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jamar Jackson
 */

package base;

import java.util.Scanner;

/*
Exercise 15 - Password Validation

        Passwords are validated by comparing a user-provided value with a known value that’s stored. Either it’s correct or it’s not.

        Create a simple program that validates user login credentials. The program must prompt the user for a username and password. The program should compare the password given by the user to a known password. If the password matches, the program should display “Welcome!” If it doesn’t match, the program should display “I don’t know you.”
        Example Output

        What is the password? 12345
        I don't know you.

        Or

        What is the password? abc$123
        Welcome!

        Constraints

        Use an if/else statement for this problem.
        Make sure the program is case sensitive.

        Challenges

        Investigate how you can prevent the password from being displayed on the screen in clear text when typed.
        Create a map of usernames and passwords and ensure the username and password combinations match.
        Encode the passwords using Bcrypt and store the hashes in the map instead of the clear-text passwords. Then, when you prompt for the password, encrypt the password using Bcrypt and compare it with the value in your map.
*/
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String password = "abc$123";
        String login = myApp.credentials();
        boolean verify = myApp.checkPassword(password, login);
        String outputString = myApp.generateOutputString(verify);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String credentials() {
        System.out.println("What is the password? ");
        return in.nextLine();
    }

    public boolean checkPassword(String password, String login) {
        return password.equals(login);
    }

    public String generateOutputString(boolean verify) {
        if(verify) {
            return "Welcome!";
        }else{
            return "I don't know you.";
        }
    }
}
