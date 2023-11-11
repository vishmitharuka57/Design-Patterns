package structural.decorative;

import structural.decorative.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(structural.decorative.Shape decoratorShape) {
        super(decoratorShape);
    }



    @Override
    public void draw(){
        decoratorShape.draw();
        setRedShape(decoratorShape);
    }

    private void setRedShape(Shape redShape){
        System.out.println("set red border");
    }


}
