

public interface Subject {


      // attach observer to observers' set
      void attach(Observer observer);

      // detach observer from observers' set
      void detach(Observer observer);

      // notify observers
      void notifyObservers();

}
