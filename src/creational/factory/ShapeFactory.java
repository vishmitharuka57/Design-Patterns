package creational.factory;

public class ShapeFactory {
    public Shape getShape(String shapeTye){
        if (shapeTye==null){
            return null;
        }else {
            if (shapeTye.equalsIgnoreCase("Circle")){
                return new Circle();
            } else if (shapeTye.equalsIgnoreCase("Rectangle")) {
                return new Rectangle();
            }
        }
        return null;
    }
}
