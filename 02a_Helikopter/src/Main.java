void main() {

    helicopter Helicopter1 = new helicopter(100, 1000);

}

public class helicopter{

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
        this.weightMaxKg = weightMaxKg;
        if (weightMaxKg - weightEmptyKg <= 500) {
            weightMaxKg = weightEmptyKg + 500;
            this.weightMaxKg = weightMaxKg;
            System.out.println("The maximum weight was set to " + this.weightMaxKg + " because the maximum weight should be at least 500kg higher than the minimum");
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
        System.out.println("The remaining load capacity are: " + remainingCapacity);
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
            System.out.println("The weight is to high");
        } else {
            this.actualWeightLoadKg += load;
            System.out.println("Your load was successfully added.");
        }
    }

    public void unloadAllCargo() {
        this.actualWeightLoadKg = 0;
        System.out.println("The weight is: " + this.actualWeightLoadKg + " kg");
    }

}
