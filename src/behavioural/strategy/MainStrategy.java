package behavioural.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("Add operation(3,1) :" +  context.executeOperation(3,1));

        Context context1 = new Context(new SubstractOperation());
        System.out.println("Subtract operation(5,2) :" +  context1.executeOperation(5,2));

        Context context2 = new Context(new MultipyOperation());
        System.out.println("Multiply operation(3,5) :" +  context2.executeOperation(3,5));

        Context context3 = new Context(new DivideOperation());
        System.out.println("Divide operation(6,2) :" +  context3.executeOperation(6,2));
    }
}
