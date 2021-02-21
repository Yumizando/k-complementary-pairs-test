package kcomplementarypairs;

import java.util.Map;

import static kcomplementarypairs.KComplementaryPairs.findKComplementaryPairs;
import static kcomplementarypairs.KComplementaryPairs.writeKComplementaryPairs;

public class main {
    public static void main(String[] args) {

        Integer[] array = {5,8,5,6,2,7,6,4,4,9};
        Integer target = 8;

        Map<Integer, Integer> kComplementaryPairs = findKComplementaryPairs(array, target);

        writeKComplementaryPairs(kComplementaryPairs);
    }
}
