package gr.aueb.cf1.ch16.function;

public class main {

    public static void main(String[] args) {
        AdditionCalculator addition = new AdditionCalculator();

        int result = addition.operate(1, 2);
        System.out.println(result);


        ICalculator sub = new ICalculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };

        int result2 = sub.operate(10, 2);
        System.out.println(result2);

        ICalculator mul = (a, b) -> a * b; //lambda method
        int result3 =mul.operate(5, 3);
        System.out.println(result3);
    }
}
