import java.util.Set;

public class ExerciseRunner {

    public static void main(String[] args) {
        System.out.println(KeepTheChange.computeChange(18, Set.of(1, 3, 7)));
        System.out.println(KeepTheChange.computeChange(9, Set.of(5,2,1)));

    }
}