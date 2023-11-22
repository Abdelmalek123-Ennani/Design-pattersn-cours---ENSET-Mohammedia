package ma.abdelmalek;

public class ObserverImpl implements Observer {
    private ObservableImpl observableImpl;
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public ObservableImpl getObservable() {
        return observableImpl;
    }
    public void setObservable(ObservableImpl observableImpl){
        this.observableImpl=observableImpl;
    }

    @Override
    public void update(int state) {
        this.state=state;
    }
}
