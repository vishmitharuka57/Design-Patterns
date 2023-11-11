package behavioural.observer;

public class MainObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();


        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctaObserver(subject);

        System.out.println("Value is 1");
        subject.setState(1);
        System.out.println("Value is 14");
        subject.setState(14);
    }
}
