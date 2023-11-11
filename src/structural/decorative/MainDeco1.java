package structural.decorative;

import structural.decorative.Circle;
import structural.decorative.Rectangle;
import structural.decorative.Shape;

public class MainDeco1 {

    public static void main(String[] args) {
        structural.decorative.Shape circle = new structural.decorative.Circle();
        structural.decorative.Shape redShapeCircle = new RedShapeDecorator(new Circle());
        Shape redShapeRectangle = new RedShapeDecorator(new Rectangle());


        System.out.println("without decoration");
        circle.draw();
        System.out.println("without decoration");
        redShapeCircle.draw();
        System.out.println("without decoration");
        redShapeRectangle.draw();
        System.out.println("without decoration");
    }
}
