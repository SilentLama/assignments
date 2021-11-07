package exercise;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {


    public static boolean getUserConfirmation(String prompt) {
        /**
         * Returns true if the user types in "y"
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
