package gr.aueb.cf1.ch14;

public class Rectangle extends Shape {

    public Rectangle() {
        super();
    } //Ο constructor γραφτει δεν γραφτει υπαρχει

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
