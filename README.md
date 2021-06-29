# Car Race

## Story

Your task will be to simulate a race. You will need to create 10
cars, 10 trucks, 10 motorcycles, and race them for 50 hours. After
simulating the race, print the results.

!> This is a **guided project**, a regular project with a step-by-step guide
   (see the Background materials). In order to learn the most, try and
   implement it on your own first, and check the solution only when you feel
   your version is ready. However, when you feel completely stuck, feel free
   to check the guide for hints.

## What are you going to learn?

- write a simulation with many objects
- design the way how the objects' states evolve and how they "communicate" with each other
- use inheritance and composition
- use random values

## Tasks

1. Set all the participants, constants, and random elements needed to start the race
    - The race itself, 10 cars, 10 trucks, and 10 motorcycles are created in the main method.

2. Race object has to store all the racers, also let us register them from outside. One race lasts 50 hours.
    - Register a car, truck, or motorcycle into the race with a method called `registerRacer()`
    - Race simulation can be done by `simulateRace()` this will:
  - call `moveForAnHour()` on every vehicle 50 times
  - set whether it is raining or not for every hour
    - Prints each vehicle's name, distance traveled, and type with `printRaceResults()`
    - It is possible to check if there is an active yellow flag for the current hour of the race with `boolean isYellowFlagActive()` returning `true` when there is a broken truck on the track.

3. We can check the weather during the current hour of the race and set a new random weather for the next hour.
    - The `advance()` method sets the weather with 30% chance to rain
    - The `isRaining()` method returns `true` if it is currently raining

4. Cars are vehicles with personality so they have imaginative names. Create a list of possible words from here: <http://www.fantasynamegenerators.com/car-names.php> and pick randomly two for each instance. Cars need to be careful and slow down when there is a broken truck on the race tracks.
    - The `name` property stores the name of the car composed of two random words form the above list.
    - The `normalSpeed` property stores the normal speed of the car, set to a random number in the constructor between 80 and 110 km/h
    - The actual speed of the car for this hour is stored in `actualSpeed`. If there is a yellow flag, limit the speed of car to 75 km/h otherwise use the value of `normalSpeed`
    - The `distanceTraveled` property holds the summarized distance traveled in the race so far
    - The `prepareForLap()` method is used to setup the actual speed used for the current lap
    - One hour of racing is simulated with the `moveForAnHour()` method. One hour of racing is simulated with the `moveForAnHour` method.

5. Motorcycles are pretty fast but making turns in rain is dangerous so they have to slow down in bad weather conditions. They don't care about broken down trucks.
    - The motorcycles are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... This is be a unique value based on the creation order, and stored in the `name` property
    - The actual speed of the motorcycle for this hour is stored in `actualSpeed`. Normally the speed is 100 km/h. In rain motorcycles slow down by a random value between 5 and 50 km/h.
    - The `distanceTraveled` property holds the summarized distance traveled in the race so far
    - The `prepareForLap()` method is used to setup the actual speed used for the current lap
    - One hour of racing is simulated with the `moveForAnHour` method. The motorcycle travels for an hour, increasing the distance traveled.

6. Trucks are real powerhouses but their intricate engines are prone to failure. When they break down, they have to stop for a while to repair the engine.
    - The actual speed of the vehicle for this race hour is stored in `actualSpeed`. The speed of a truck is 100 km/h or 0 when broken down
    - The `name` property stores the name. Truck drivers are boring, they call their trucks on a random number between 0 and 1000
    - The `distanceTraveled` property holds the summarized distance traveled in the race so far
    - The `prepareForLap()` method is used to setup the actual speed used for the current lap. Trucks have a 5% chance of breaking down for 2 hours
    - When a truck is broken down, it cannot break down again during the reparation
    - One hour of racing is simulated with the `moveForAnHour` method. The truck travels for an hour, increasing the distance traveled.

## General requirements

None

## Hints

- Have you noticed that `Car`, `Motorcycle` and `Truck` share some similarities?
  Use inheritance to abstract away the common parts.
- Use the built-in `Random` class to generate random numbers.
  Implement a custom utility class around it, if you find it useful.
- The actual speed of a vehicle sometimes depends on the state of other vehicles or
  on contextual features like weather. But we cannot set their speed from the outside
  since the speed setting logic should be encapsulated into the vehicle classes.
  How, then, can a specific vehicle get to such contextual information? Think about
  in terms of necessary communication between objects!

## Background materials

- [Creating objects](project/curriculum/materials/pages/java/creating-objects.md)
- [Methods](project/curriculum/materials/pages/java/methods.md)
- [OOP basics](project/curriculum/materials/pages/java/basics-of-object-oriented-programming.md)
- [OOP basics 2](project/curriculum/materials/pages/java/basics-of-object-oriented-programming-with-java-part-2.md)
- [Collections](project/curriculum/materials/competencies/java-data-structures/java-collections.md.html)
- [Abstraction, abstract classes and interfaces](project/curriculum/materials/pages/java/abstraction.md)
- [A step-by-step solution guide](project/curriculum/materials/pages/java/car-race-step-by-step.md)

