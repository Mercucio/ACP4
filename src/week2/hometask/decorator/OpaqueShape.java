package week2.hometask.decorator;

/**
 * Created by Богдан on 25.01.2015.
 */
public class OpaqueShape extends ShapeDecorator {

    public OpaqueShape(IShape decorShape) {
        super(decorShape);
    }


    public void draw(){
        decoratedShape.draw();
        setOpauence();
        }

    private void setOpauence() {
        System.out.println("Opaquence is 50%");
    }
}

