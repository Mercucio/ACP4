package week2.hometask.decorator;

/**
 * Created by Богдан on 25.01.2015.
 */
public abstract class ShapeDecorator implements IShape {
    protected IShape decoratedShape;


    public ShapeDecorator( IShape decorShape){
        this.decoratedShape = decorShape;
    }

    public void drawDecorated(){
        this.decoratedShape.draw();
    }


}
