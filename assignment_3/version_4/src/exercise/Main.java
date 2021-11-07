package exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        boolean active = true;
        ADT adt_1 = new ADT();
        ADT adt_2 = new ADT();
        if (UserInput.getUserConfirmation("Random Seed First Generator? (y/n): ")) {
            adt_1.randomSeed();
        }
        if (UserInput.getUserConfirmation("Random Seed Second Generator? (y/n): ")) {
            adt_2.randomSeed();
        }

        do {
            System.out.print(adt_1.random() + "\n");
            System.out.print(adt_2.random() + "\n");
            active = UserInput.getUserConfirmation("Another number? (y/n): ");
        } while(active);
    }
}
