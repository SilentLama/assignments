package exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        boolean active = true;
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
            RandomADO.randomSeed();
        }

        do {
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
