package exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        /**
         * Moved the code for generating random numbers to the RandomADO
         */
        boolean active = true;
        // Get user input for random seed
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("Random Seed? (y/n): ");
        String input;
        try {
            input = reader.readLine();
        } catch (Exception e) {
            input = "n";
        }
        if (input.compareTo("y") == 0) {
            // seed the ADO
            RandomADO.randomSeed();
        }
        // print out random numbers while the user types in "y"
        do {
            // retrieve the static random number
            int random = RandomADO.random();
            System.out.print(random + "\n");
            System.out.print("Another number? (y/n): ");
            try {
                input = reader.readLine();
            } catch (Exception e) {
                input = "n";
            }
            active = input.compareTo("y") == 0;
        } while(active);
    }
}
