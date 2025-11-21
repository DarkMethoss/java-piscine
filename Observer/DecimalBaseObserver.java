import java.util.List;
import java.util.ArrayList;

class DecimalBaseObserver implements NumericBaseObserver {
    List<String> events = new ArrayList<>();
    
    @Override
    public void updateState(int state){
        events.add(""+state);
    }

    @Override
    public List<String> getEvents()  {
        return this.events;
    }
}