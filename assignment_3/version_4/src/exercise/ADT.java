package exercise;
import java.util.Date;
/*
For implementing the fourth version you should use an ADT. This time you will have to implement
a  functional  change  to  the  program.  It  now  has  to  include  two  (pseudo)  random  number  generators,
which can be randomly seeded individually. Consequently, in each iteration of the program, two (pseudo)
random numbers are to be printed.
 */


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
        this.actualRandom = (this.factor * this.actualRandom + this.increment) % this.max;
        return this.actualRandom;
    }

    public void randomSeed() {
        /**
         * Modifies the static random variable by the current Date Modulo the max value
         */
        long current_date =  new Date().getTime();
        actualRandom = (int) (current_date / 10) % max;
    }

}
