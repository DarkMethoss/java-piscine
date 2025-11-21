import java.util.*;
class ValuePublisher  {   
    List<NumericBaseObserver> numericBaseObservers = new ArrayList<>();

    public void updateState(int value) {
        for (NumericBaseObserver observer: numericBaseObservers) {
            observer.updateState(value);
        }
    }
    public void subscribe(NumericBaseObserver observer) {
        numericBaseObservers.add(observer);
    }
    public void unsubscribe(NumericBaseObserver observer) {
        numericBaseObservers.remove(observer);
    }
}