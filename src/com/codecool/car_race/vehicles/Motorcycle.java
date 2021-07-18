package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.util.RandomHelper;

public class Motorcycle extends Vehicle {
    /**
     * Motorcycles go with their normal speed. In case of rain they
     * have to slow down.
     * @param race instance of the current race from where we can access data
     *             for example weather conditions and broken truck info
     */
    @Override
    public void prepareForLap(Race race) {
        actualSpeed = normalSpeed;

        if(race.isRaining()) {
            int slowDown = RandomHelper.nextInt(5, 50+1);
            actualSpeed -= slowDown;
        }
    }

    /**
     * Motorcycles have names with serial numbers.  We have to track
     * the numbering on a class level that's why this field is static.
     */
    private static int motorcycleNumber = 1;

    /**
     * Generate name using the 'Motorcycle' and a number
     *
     * @return the name of the motorcycle
     */
    @Override
    protected String generateName() {
        return "Motorcycle " + motorcycleNumber++;
    }

    // Motorcycle.java
    /**
     * Motorcycles go with 100 km/h in good weather conditions.
     */
    private static final int NORMAL_SPEED = 100;

    public Motorcycle() {
        super(NORMAL_SPEED);
    }
}
