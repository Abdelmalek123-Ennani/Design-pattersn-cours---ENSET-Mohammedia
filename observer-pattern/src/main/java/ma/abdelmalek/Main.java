package ma.abdelmalek;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        ObserverImpl observer=new ObserverImpl();
        observable.setState(687);
        observable.addObserver(observer);
        observable.setState(654);
        System.out.println(observer.getState());
    }
}