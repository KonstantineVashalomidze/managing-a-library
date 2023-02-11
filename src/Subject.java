import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
      Set<Observer> observers = new HashSet<>();

      // attach observer to observers' set
      public void attach(Observer observer){
          this.observers.add(observer);
      }

      // detach observer from observers' set
      public void detach(Observer observer){
          this.observers.remove(observer);
      }

      // notify observers
      public void notifyObservers(){
          for(Observer observer : this.observers){
              observer.update();
          }
      }

}
