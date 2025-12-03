void main() {

    List<Animal> animalList = new ArrayList<>();
    animalList.add(new Animal("ape", 12, "Tim"));
    animalList.add(new Animal("bob", 3, "Bob"));
    animalList.add(new Animal("cat", 4, "Lisa"));
    animalList.add(new Animal("dog", 5, "Ivo"));
    animalList.add(new Animal("pig", 6, "Peppa"));
    animalList.add(new Animal("lama", 34, "Nial"));

    for (Animal animal : animalList) {
        System.out.println(animal.animalName + " is a " + animal.animalSpecies + " and is " + animal.animalAge + " years old.");
    }

}

public class Animal {
    String animalSpecies;
    int animalAge;
    String animalName;

    Animal(String animalSpecies, int animalAge, String animalName) {
        this.animalSpecies = animalSpecies;
        this.animalAge = animalAge;
        this.animalName = animalName;
    }
}
