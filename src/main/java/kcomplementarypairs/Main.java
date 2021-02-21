package kcomplementarypairs;

import java.util.Map;

import static kcomplementarypairs.KComplementaryPairs.findKComplementaryPairs;
import static kcomplementarypairs.KComplementaryPairs.printAllKComplementaryPairs;

public class Main {

    public static void main(String[] args) {
        Integer target = 4;
        Integer[] array = {0, -7, 2, 9, 4, -3, -1, 5};

        Map<Integer, Integer> kComplementaryPairs = findKComplementaryPairs(array, target);

        printAllKComplementaryPairs(kComplementaryPairs);
    }

}