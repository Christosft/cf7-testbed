package gr.aueb.cf1.ch15;

public class Main {

    public static void main(String[] args) {

        ISpeakable cat = new Cat("Alice");
        ISpeakable dog = new Dog("Bob");
        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(cat);
        GenericSpeakingSchool genericSpeakingSchool2 = new GenericSpeakingSchool(dog);

        //cat.speak();
        //dog.speak();

        //doSpeak(cat);
        //doSpeak(dog);

        genericSpeakingSchool1.LearnToSpeak();
        genericSpeakingSchool2.LearnToSpeak();


    }


    public static void doSpeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
