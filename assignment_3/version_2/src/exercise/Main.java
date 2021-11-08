package exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /**
         * Initialize variables needed in scope which will act as globals in this case
         * Get user input whether to seed random or keep standard
         * print a random number and repeat until user types something else than "y"
         */
        int max = 1000;
        int factor = 623;
        int increment = 525;
        int start = 157;
        boolean active = true;
        int actualrandom;
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
            // get the current date as number
            // use the formula from slide 23
            // cast back into integer
            long current_date =  new Date().getTime();
            actualrandom = (int) (current_date / 10) % max;
        } else {
            actualrandom = ((factor * start) + increment) % max;
        }


        do {
            System.out.print(actualrandom + "\n");
            actualrandom = ((factor * actualrandom) + increment) % max;
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
