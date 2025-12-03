void main() {
    System.out.println("*******************************");
    // 5 Arrays

    String[] car = {"auto1", "auto2", "auto3"};
    String[] brand = {"Audi", "Opel", "Porsche"};
    String[] color = {"Blue", "White", "Black"};
    int[] year = {2022, 2019, 2024};
    int[] strenght = {180, 120, 250};

    for (int i = 0; i < 3; i++) {
        System.out.println(car[i] + "\t " + brand[i] + "\t " + color[i] + " \t" + year[i] + "\t " + strenght[i]);
    }

    System.out.println("*******************************");
    // Ein Drei-Dimensionaler Array

    String[][] cars = {{ "auto1", "auto2", "auto3"}, {"Audi", "Opel", "Porsche"}, {"Blue", "White", "Black"}, {"2022", "2019", "2024"}, {"180", "120", "250"}};

    for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i][0] + "\t " + cars[i][1] + "\t " + cars[i][2] + "\t");
    }

    System.out.println("*******************************");
}

