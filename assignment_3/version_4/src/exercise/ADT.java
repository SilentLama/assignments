package exercise;
import java.util.Date;

public class ADT {
    private int max;
    private int factor;
    private int increment;
    private int start;
    private int actualRandom;

    ADT() {
        this.max = 1000;
        this.factor = 623;
        this.increment = 525;
        this.start = 157;
        this.actualRandom = ((this.factor * this.start) + this.increment) % this.max;
    }

    public int random() {
        /**
         * Retrieve a random number
         * @return random integer from zero to max
         */
        this.actualRandom = (this.factor * this.actualRandom + this.increment) % this.max;
        return this.actualRandom;
    }

    public void randomSeed() {
        /**
         * Randomly seed the generator with the current date
         */
        long current_date =  new Date().getTime();
        actualRandom = (int) (current_date / 10) % max;
    }

}
