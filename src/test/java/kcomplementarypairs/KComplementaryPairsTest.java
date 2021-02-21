package kcomplementarypairs;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static kcomplementarypairs.KComplementaryPairs.findKComplementaryPairs;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class KComplementaryPairsTest {

    @Test
    public void shouldReturnAllKComplementaryPairsGivenPositiveIntegerArrayWhenFindKComplementaryPairs() {
        Integer target = 1;
        Integer[] array = {0, 7, 3, 2, 1};

        Map<Integer, Integer> kComplementaryPairs = findKComplementaryPairs(array, target);

        assertNotNull(kComplementaryPairs, "Should not be null.");
        assertEquals(2, kComplementaryPairs.size());
        assertEquals("{0=1, 1=0}", kComplementaryPairs.toString());
    }

    @Test
    public void shouldReturnAllKComplementaryPairsGivenNegativeIntegerArrayWhenFindKComplementaryPairs() {
        Integer target = 4;
        Integer[] array = {0, -7, 2, 9, 4, -3, -1, 5};

        Map<Integer, Integer> kComplementaryPairs = findKComplementaryPairs(array, target);

        assertNotNull(kComplementaryPairs, "Should not be null.");
        assertEquals(5, kComplementaryPairs.size());
        assertEquals("{0=4, -1=5, 2=2, 4=0, 5=-1}", kComplementaryPairs.toString());
    }

}