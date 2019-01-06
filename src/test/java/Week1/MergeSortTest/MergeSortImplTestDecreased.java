package test.java.Week1.MergeSortTest;

import main.java.Week1.Week1_DivideAndConquer.MergeSortImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortImplTestDecreased {

    @Test
    void mergeSortWithSmallUnsortedList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(3, 6, 8, 2, 5, 9));
        List<Integer> sortedList = Arrays.asList(9, 8, 6, 5, 3, 2);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithEmptyList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList());
        List<Integer> sortedList = Arrays.asList();
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithOneElementList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(42));
        List<Integer> sortedList = Arrays.asList(42);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithTwoElementList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(21, 42));
        List<Integer> sortedList = Arrays.asList(42, 21);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithSmallSortedList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        List<Integer> sortedList = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithListWithOnlyZeros() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        List<Integer> sortedList = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithSmallSortedListOnlySingleDigits() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11));
        List<Integer> sortedList = Arrays.asList(11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithReversedSortedList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> sortedList = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithLargerUnsortedList1() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(12, 15, 23, 4, 6, 10, 35, 28, 100, 130, 500, 1000, 235, 554, 75, 345, 800, 222, 333, 888, 444, 111, 666, 777, 60));
        List<Integer> sortedList = Arrays.asList(1000, 888, 800, 777, 666, 554, 500, 444, 345, 333, 235, 222, 130, 111, 100, 75, 60, 35, 28, 23, 15, 12, 10, 6, 4);

        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithLargerUnsortedList2() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(21313, 2132142, 543546, 234324, 54757, 34, 54645, 34543, 54654, 324, 658658, 34234, 123123, 6588, 244, 0, 0, 21424, 1244, 6765));
        List<Integer> sortedList = Arrays.asList(2132142, 658658, 543546, 234324, 123123, 54757, 54654, 54645, 34543, 34234, 21424, 21313, 6765, 6588, 1244, 324, 244, 34, 0, 0);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithLargerSortedList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(100001, 10000, 100000, 56789, 34568, 34567, 2500, 2000, 45, 22, 15, 12, 9, 7, 5, 3));
        List<Integer> sortedList = Arrays.asList(100001, 100000, 56789, 34568, 34567, 10000, 2500, 2000, 45, 22, 15, 12, 9, 7, 5, 3);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithUnsortedListWithNegativeNumbersAndDuplicates() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(12, 12, 23, 4, 6, 6, 10, -35, 28));
        List<Integer> sortedList = Arrays.asList(28, 23, 12, 12, 10, 6, 6, 4, -35);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithUnsortedListWithNegativeNumbersOnly() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(-100, -1, -30, -45, -405759, -3849374, -99999999));
        List<Integer> sortedList = Arrays.asList(-1, -30, -45, -100, -405759, -3849374, -99999999);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithSmallUnsortedListWithGreaterNumbers() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(false);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(10000000, 78963, 4859337, 4759602, 4000000, 3485, 2, 4859));
        List<Integer> sortedList = Arrays.asList(10000000, 4859337, 4759602, 4000000, 78963, 4859, 3485, 2);

        assertEquals(sortedList, testList);
    }
}
