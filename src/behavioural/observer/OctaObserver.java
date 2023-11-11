package behavioural.observer;

public class OctaObserver extends Observer{
    public OctaObserver(Subject subject) {
        this.subject=subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octa value"   +Integer.toOctalString(subject.getState()));
    }
}
