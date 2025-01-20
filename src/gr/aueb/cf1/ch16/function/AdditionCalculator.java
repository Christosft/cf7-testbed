package gr.aueb.cf1.ch16.function;

public class AdditionCalculator implements ICalculator {


    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
