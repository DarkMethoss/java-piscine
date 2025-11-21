import java.util.List;
import java.util.ArrayList;

class HexaBaseObserver implements NumericBaseObserver{
    List<String> events = new ArrayList<>();

    @Override
    public void updateState(int state){
        events.add(Integer.toHexString(state));
    }

    @Override
    public List<String> getEvents()  {
        return this.events;
    }
}