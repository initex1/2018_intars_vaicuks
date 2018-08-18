package homeWork5;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class BinarySearchTest {

    private static final int[] array = new int[]{5, 99, 2, 18, 45, 78, 23, 33, 65, 86};

    private BinarySearch binarySearch;
    private FastSorting fastSorting;


    @Before
    public void setUp() throws Exception {
        binarySearch = new BinarySearch();
        fastSorting = new FastSorting();
        fastSorting.quickSort(array, 0, array.length - 1);
    }

    @Test
    public void shouldFindIndex() {
        assertEquals(3, binarySearch.doBinarySearch(array, 23, 0, array.length - 1));
    }
}