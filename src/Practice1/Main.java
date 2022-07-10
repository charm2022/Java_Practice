package Practice1;

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        Animal myPig = new Pig(); //Create a Pig object
        Animal myDog = new Dog(); //Create a dog object
        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }
}
