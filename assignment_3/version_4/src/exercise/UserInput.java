package exercise;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
    /**
     * class to group UserInput functionality
     */

    public static boolean getUserConfirmation(String prompt) {
        /**
         * Will prompt the user for input and return confirmation status
         * @param prompt Text to display the user after which the user will enter the confirmation
         */
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print(prompt);
        String input;
        try {
            input = reader.readLine();
        } catch (Exception e) {
            input = "n";
        }
        return input.compareTo("y") == 0;
    }
}
