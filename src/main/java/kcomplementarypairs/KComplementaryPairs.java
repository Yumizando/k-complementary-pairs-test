package kcomplementarypairs;

import java.util.HashMap;
import java.util.Map;

public class KComplementaryPairs {

    public static Map<Integer, Integer> findKComplementaryPairs(Integer[] array, Integer target){
        Map<Integer, Integer> kComplementaryPairs = new HashMap<>();

        for (int i = 0 ; i < array.length ; i++) {
            Integer valueOfI = array[i];
            for (int j = 0 ; j < array.length ; j++) {
                Integer valueOfJ = array[j];
                if (valueOfI + valueOfJ == target) {
                    kComplementaryPairs.put(valueOfI, valueOfJ);
                }
            }
        }
        return kComplementaryPairs;
    }

    public static void writeKComplementaryPairs(Map<Integer, Integer> kComplementaryPairs){
        kComplementaryPairs.forEach((i, j) -> System.out.printf("par(%d,%d)%n", i, j));
    }
}
