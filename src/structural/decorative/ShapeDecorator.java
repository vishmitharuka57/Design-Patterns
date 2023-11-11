package structural.decorative;

import structural.decorative.Shape;

public class ShapeDecorator implements structural.decorative.Shape {

    protected structural.decorative.Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }
    @Override
    public void draw() {
        decoratorShape.draw();
    }


}
