import java.util.List;
import java.util.ArrayList;

class BinaryBaseObserver implements NumericBaseObserver{
    List<String> events = new ArrayList<>();
    @Override
    public void updateState(int state){
        events.add(Integer.toBinaryString(state));
    }

    @Override
    public List<String> getEvents()  {
        return this.events;
    }
}