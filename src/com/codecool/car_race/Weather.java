package com.codecool.car_race;

import com.codecool.car_race.util.RandomHelper;

/**
 * A class representing the weather. Advances its state by each call
 * to {@link Weather#randomize()}.
 */
public class Weather {
    /**
     * Chance that it will rain in a new time-step.
     */
    private static final int CHANCE_OF_RAIN = 30;

    /**
     * State of rain.
     */
    private boolean isRaining = false;

    /**
     * Randomize the state of the rain in the constructor
     */
    public Weather() {
        randomize();
    }

    /**
     * Whether it is raining in the current time-step.
     *
     * @return true if it is raining.
     */
    public boolean isRaining() {
        return isRaining;
    }

    /**
     * Calculate the new state of the weather.
     */
    public void randomize() {
        isRaining = RandomHelper.eventWithChance(CHANCE_OF_RAIN);
    }
}
