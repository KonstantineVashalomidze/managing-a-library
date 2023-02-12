import java.util.HashSet;
import java.util.Set;

public class BookLibraryMediator implements Subject{

    Set<Observer> observers = new HashSet<>();

    // attach observer to observers' set
    @Override
    public void attach(Observer observer){
        this.observers.add(observer);
    }

    // detach observer from observers' set
    @Override
    public void detach(Observer observer){
        this.observers.remove(observer);
    }

    // notify observers
    @Override
    public void notifyObservers(){
        for(Observer observer : this.observers){
            observer.update();
        }
    }





}
