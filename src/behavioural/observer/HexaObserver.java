package behavioural.observer;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa Value  " +Integer.toHexString(subject.getState()));
    }
}
