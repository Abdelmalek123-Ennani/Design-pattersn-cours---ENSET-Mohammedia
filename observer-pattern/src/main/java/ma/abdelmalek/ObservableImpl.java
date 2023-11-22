package ma.abdelmalek;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private List<Observer> observers=new ArrayList<>();
    private int state=0;
    public void setState(int data){
        state=data;
        notifyObservers();
    }
    public int getState(){
        return state;
    }
    @Override
    public void addObserver(ObserverImpl o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverImpl o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(state);
        }
    }
}
