import java.util.List;
interface NumericBaseObserver {
    void updateState(int state);
    List<String> getEvents();
}