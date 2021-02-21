package kcomplementarypairs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class responsible for implementing the search for K-Complementary pairs
 *
 * @author Laryssa Yumi - laryyumi@gmail.com
 */
public class KComplementaryPairs {

    /**
     * <p>Method that finds K-Complementary pairs.
     * </p>
     *
     * @param array  array of integer values
     * @param target value that represents K = A[i] + A[j]
     * @return map with all K-Complementary pairs
     * @since 1.0
     */
    public static Map<Integer, Integer> findKComplementaryPairs(Integer[] array, Integer target) {
        List<Integer> integerList = Arrays.asList(array);

        Map<Integer, Integer> missingPairMap = new HashMap<>();

        Map<Integer, Integer> kComplementaryPairs = new HashMap<>();

        for (Integer valueOfI : array) {
            Integer missingValue = target - valueOfI;
            missingPairMap.put(valueOfI, missingValue);
        }

        missingPairMap.forEach((i, j) -> {
            if (integerList.contains(j)) {
                kComplementaryPairs.put(i, j);
            }
        });

        return kComplementaryPairs;
    }

    /**
     * <p>Method that print all K-Complementary pairs.
     * </p>
     *
     * @param kComplementaryPairs map with all K-Complementary pairs
     * @since 1.0
     */
    public static void printAllKComplementaryPairs(Map<Integer, Integer> kComplementaryPairs) {
        kComplementaryPairs.forEach((i, j) ->
                System.out.printf("par(%d,%d)%n", i, j)
        );
    }
}
