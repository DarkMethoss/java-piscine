import java.util.stream.Stream;

public class StreamReduce {
    public static Integer sumAll(Stream<Integer> s) {
        return s.reduce((a, b) -> a + b).orElse(0);
    }

    public static Integer divideAndAddElements(Stream<Integer> s, int divider) {
                return s.map(nb -> nb / divider).reduce((a, b) -> a + b).orElse(0);

    }
}