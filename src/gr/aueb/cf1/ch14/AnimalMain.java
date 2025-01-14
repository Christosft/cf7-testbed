package gr.aueb.cf1.ch14;

public class AnimalMain {

    public static void main(String[] args) {
        Dog retriever = new Dog("Tommy", 5, "Golden Retriever");
        Dog pitbull = new Dog("Jack", 3, "Pitbull");
        retriever.makeSound();
        retriever.searchForFood();
        pitbull.makeSound();
        pitbull.searchForFood();

        doMakeSound(retriever);
        doMakeSound(pitbull);
    }

    public static void doMakeSound(Animal animal) {
        animal.makeSound();
    }
}
