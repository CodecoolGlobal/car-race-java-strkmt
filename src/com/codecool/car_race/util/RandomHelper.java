package com.codecool.car_race.util;
import java.util.Random;

/**
 * A wrapper around the built-in {@link Random}.
 * <p>
 * Has only static methods which all use the same pseudorandom number
 * generator. In a real project it might be more finely controlled
 * which usecases share PRNGs.
 * <p>
 * Another approach would be to extend Random instead of a wrapping
 * it.
 */
public class RandomHelper {
    /**
     * An instance of a pseudorandom number generator shared for all
     * uses of methods.
     */
    private static final Random RANDOM = new Random();

    /**
     * No point in making instances of this class.
     */
    private RandomHelper() {}

    /**
     * Generate a random integer from a given range.
     *
     * @param upper upper limit of the range.
     * @return      a random number between 0 and an upper bound.
     */
    public static int nextInt(int upper) {
        return RANDOM.nextInt(upper);
    }

    /**
     * Choose a random element from an array of strings.
     *
     * @param possibilities array of strings to choose from.
     * @return              the chosen string.
     */
    public static String chooseOne(String[] possibilities) {
        if (possibilities == null || possibilities.length < 1) {
            final String msg =
                    "Possibilities should be a non-empty array of strings.";
            throw new IllegalArgumentException(msg);
        }

        return possibilities[nextInt(possibilities.length)];
    }

    /**
     * Generate a random integer from a given range.
     *
     * @param lower lower limit of the range.
     * @param upper upper limit of the range.
     *
     * @return      a random number between a lower and an upper bound.
     */
    public static int nextInt(int lower, int upper) {
        return lower + nextInt(upper - lower);
    }

    /**
     * Determine whether an event has occured given the chance for it.
     *
     * @param chance the chance of the event happening in percents.
     * @return       true if the event has happened.
     */
    public static boolean eventWithChance(int chance) {
        return RANDOM.nextInt(100) < chance;
    }
}
