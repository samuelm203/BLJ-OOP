import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        helicopterFactory factory = new helicopterFactory("Awesome Helicopters Inc.");
        System.out.println("--- Factory initialized: " + factory.getName() + " ---\n");

        factory.produceHelicopter();
        factory.produceHelicopter();

        factory.listAllHelicopters();
    }
}

// Class: helicopter
class helicopter {

    // Automatic Properties
    int weightEmptyKg;
    int weightMaxKg;
    int actualWeightLoadKg;
    float coordinateX;
    float coordinateY;
    float coordinateZ;

    // Constructor
    public helicopter(int weightEmptyKg, int weightMaxKg) {
        this.weightEmptyKg = weightEmptyKg;
        if (weightMaxKg - weightEmptyKg <= 500) {
            this.weightMaxKg = weightEmptyKg + 500;
            System.out.println("The maximum weight was set to " + this.weightMaxKg + " because the maximum weight should be at least 500kg higher than the minimum");
        } else {
            this.weightMaxKg = weightMaxKg;
        }

        this.actualWeightLoadKg = 0;
        this.coordinateX = 0;
        this.coordinateY = 0;
        this.coordinateZ = 0;
    }

    // Methods

    public void moveHelicopter(int additionPositionX, int additionPositionY,  int additionPositionZ) {
        this.coordinateX += additionPositionX;
        this.coordinateY += additionPositionY;
        this.coordinateZ += additionPositionZ;
        System.out.println("The coordinates are: " + this.coordinateX + " / " + this.coordinateY + " / " + this.coordinateZ);
    }

    public void landHelicopter() {
        this.coordinateZ = 0;
        System.out.println("The Helicopter is landed. Your coordinates are: " + this.coordinateX + " / " + this.coordinateY + " / " + this.coordinateZ);
    }

    public void calculateRemainingLoadCapacity() {
        int remainingCapacity = this.weightMaxKg - this.actualWeightLoadKg - this.weightEmptyKg;
        System.out.println("The remaining load capacity is: " + remainingCapacity + " kg");
    }

    public void printWeightOverview() {
        System.out.println("Your Weight-Dashboard: ");
        calculateRemainingLoadCapacity();
        System.out.println("The Helicopter's weight without load is " + this.weightEmptyKg + " kg");
        int currentWeight = this.weightEmptyKg + this.actualWeightLoadKg;
        System.out.println("The Helicopter's current weight is " + currentWeight + " kg");
    }

    public void addLoad(int load) {
        int remainingCapacity = this.weightMaxKg - this.actualWeightLoadKg - this.weightEmptyKg;

        if (load > remainingCapacity) {
            System.out.println("The weight is too high! Cannot add " + load + "kg. Remaining capacity is " + remainingCapacity + "kg.");
        } else {
            this.actualWeightLoadKg += load;
            System.out.println("Your load of " + load + "kg was successfully added.");
        }
    }

    public void unloadAllCargo() {
        this.actualWeightLoadKg = 0;
        System.out.println("All cargo unloaded. The current load weight is: " + this.actualWeightLoadKg + " kg");
    }

}

class helicopterFactory {

    // Automatic Properties

    private String name;

    public String getName () {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private List<helicopter> helicopters;

    public List<helicopter> getHelicopters () {
        return helicopters;
    }

    public void setHelicopters(List<helicopter> helicopters) {
        this.helicopters = helicopters;
    }

    // Constructor

    public helicopterFactory (String name) {
        this.name = name;
        this.helicopters = new ArrayList<>(); // FIX: Use ArrayList
    }

    // Methods

    public void produceHelicopter () {
        helicopter newHelicopter = new helicopter(5000, 10000);
        helicopters.add(newHelicopter);
        System.out.println("\n--- Producing new Helicopter ---");
        System.out.println("Helicopter produced: " + newHelicopter.toString());
        makeTestFlight(newHelicopter);
        System.out.println("--- Production complete ---\n");
    }

    public void listAllHelicopters () {
        System.out.println("\n--- " + this.name + " - List of all Helicopters (" + helicopters.size() + ") ---");
        for (helicopter helicopter : helicopters) {
            System.out.println("-> " + helicopter.toString());
        }
        System.out.println("-------------------------------------------------------------------\n");
    }

    // FIX: Implemented the logic for a test flight
    public void makeTestFlight (helicopter helicopter) {
        System.out.println("\n--- Starting Test Flight ---");

        helicopter.printWeightOverview();

        int testLoad = 3000;
        System.out.println("Attempting to add " + testLoad + "kg of test cargo.");
        helicopter.addLoad(testLoad);
        helicopter.printWeightOverview();

        System.out.println("Taking off and moving to test coordinates...");
        helicopter.moveHelicopter(15, 25, 300);

        helicopter.landHelicopter();
        helicopter.unloadAllCargo();
        helicopter.printWeightOverview();

        System.out.println("--- Test Flight successful ---\n");
    }
}