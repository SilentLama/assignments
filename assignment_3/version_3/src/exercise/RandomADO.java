package exercise;

import java.util.Date;

public abstract class RandomADO {
    /**
     * Random abstract Data object (can't be instantiated due to abstract keyword)
     * The class can be accessed via static methods
     */
    private static int max = 1000;
    private static int factor = 623;
    private static int increment = 525;
    private static int start = 157;
    private static int actualRandom = ((factor * start) + increment) % max;

    public static int random() {
        actualRandom = (factor * actualRandom + increment) % max;
        return actualRandom;
    }

    public static void randomSeed() {
        /**
         * Modifies the static random variable by the current Date Modulo the max value.
         */
        long current_date =  new Date().getTime();
        actualRandom = (int) (current_date / 10) % max;
    }

}
