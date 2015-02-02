package week2.hometask.decorator;

/**
 * Created by Богдан on 25.01.2015.
 */
public class TestDecorator {
    public static void main(String[] args) {
        IShape circle = new Circle();

        IShape opaqueCircle = new OpaqueShape(new Circle());

        IShape opaqueSquare = new OpaqueShape(new Square());

        circle.draw();

        opaqueCircle.draw();

        opaqueSquare.draw();
    }
}
