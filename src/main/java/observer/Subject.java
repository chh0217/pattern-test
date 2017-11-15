package observer;


/**
 * Created by chenh on 2017/11/15.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
