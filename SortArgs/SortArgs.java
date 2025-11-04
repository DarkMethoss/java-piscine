import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        
        int[] nbs = new int[args.length];

        for (int i= 0; i < args.length ; i++) {
            int nb;
            try {
                nb = Integer.parseInt(args[i]);
                nbs[i] = nb;
            } catch (Exception e) {
                System.out.println("Error");
                return;
            } 
        }

        String res = "";
        Arrays.sort(nbs);
        
        for (int nb: nbs) {
            res += nb + " "; 
        }
        System.out.println(res.trim());
    }
}