import java.util.*;

public class WeddingComplex {

    public static Map<String, String> createBestCouple(Map<String, List<String>> first,
        Map<String, List<String>> second) {
        Map<String, String> engagedTo = new HashMap<>(); 
        Map<String, String> womanPartner = new HashMap<>(); 
        Map<String, Integer> nextProposalIndex = new HashMap<>(); 

        Queue<String> freeMen = new LinkedList<>();
        for (String man : first.keySet()) {
            freeMen.add(man);
            nextProposalIndex.put(man, 0);
        }

        while (!freeMen.isEmpty()) {
            String man = freeMen.poll(); 
            List<String> preferences = first.get(man);
            int index = nextProposalIndex.get(man);
            String woman = preferences.get(index);
            nextProposalIndex.put(man, index + 1); 
            if (!womanPartner.containsKey(woman)) {
                engagedTo.put(man, woman);
                womanPartner.put(woman, man);
            } else {
                String currentMan = womanPartner.get(woman);
                if (prefersNewMan(woman, man, currentMan, second)) {
                    engagedTo.put(man, woman);
                    womanPartner.put(woman, man);
                    engagedTo.remove(currentMan);
                    freeMen.add(currentMan);
                } else {
                    freeMen.add(man);
                }
            }
        }

        return engagedTo;
    }

    
    private static boolean prefersNewMan(String woman, String manA, String manB,
        Map<String, List<String>> second) {

        List<String> preferences = second.get(woman);

        return preferences.indexOf(manA) < preferences.indexOf(manB);
    }
}
