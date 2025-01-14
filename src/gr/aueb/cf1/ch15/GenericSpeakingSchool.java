package gr.aueb.cf1.ch15;

public class GenericSpeakingSchool {

    private final ISpeakable iSpeakable;

    /**
     * Dependency Injection (DI) - Ioc - Inversion of control
     * @param iSpeakable
     */

    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void LearnToSpeak() {
        iSpeakable.speak();
    }
}
