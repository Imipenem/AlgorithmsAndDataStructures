package test.java.Week1.MergeSortTest;

import main.java.Week1.Week1_DivideAndConquer.MergeSortImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortImplTestIncreased {

    @Test
    void mergeSortWithSmallUnsortedList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(3, 6, 8, 2, 5, 9));
        List<Integer> sortedList = Arrays.asList(2, 3, 5, 6, 8, 9);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithEmptyList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList());
        List<Integer> sortedList = Arrays.asList();
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithOneElementList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(42));
        List<Integer> sortedList = Arrays.asList(42);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithTwoElementList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(42, 21));
        List<Integer> sortedList = Arrays.asList(21, 42);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithSmallSortedList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithListWithOnlyZeros() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        List<Integer> sortedList = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithSmallSortedListOnlySingleDigits() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11));
        List<Integer> sortedList = Arrays.asList(11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithReversedSortedList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        List<Integer> sortedList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithLargerUnsortedList1() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(12, 15, 23, 4, 6, 10, 35, 28, 100, 130, 500, 1000, 235, 554, 75, 345, 800, 222, 333, 888, 444, 111, 666, 777, 60));
        List<Integer> sortedList = Arrays.asList(4, 6, 10, 12, 15, 23, 28, 35, 60, 75, 100, 111, 130, 222, 235, 333, 345, 444, 500, 554, 666, 777, 800, 888, 1000);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithLargerUnsortedList2() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(21313, 2132142, 543546, 234324, 54757, 34, 54645, 34543, 54654, 324, 658658, 34234, 123123, 6588, 244, 0, 0, 21424, 1244, 6765));
        List<Integer> sortedList = Arrays.asList(0, 0, 34, 244, 324, 1244, 6588, 6765, 21313, 21424, 34234, 34543, 54645, 54654, 54757, 123123, 234324, 543546, 658658, 2132142);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithLargerSortedList() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(3, 5, 7, 9, 12, 15, 22, 45, 2000, 2500, 34567, 34568, 56789, 100000, 100001, 100001));
        List<Integer> sortedList = Arrays.asList(3, 5, 7, 9, 12, 15, 22, 45, 2000, 2500, 34567, 34568, 56789, 100000, 100001, 100001);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithUnsortedListWithNegativeNumbersAndDuplicates() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(12, 12, 23, 4, 6, 6, 10, -35, 28));
        List<Integer> sortedList = Arrays.asList(-35, 4, 6, 6, 10, 12, 12, 23, 28);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithUnsortedListWithNegativeNumbersOnly() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(-100, -1, -30, -45, -405759, -3849374, -99999999));
        List<Integer> sortedList = Arrays.asList(-99999999, -3849374, -405759, -100, -45, -30, -1);
        assertEquals(sortedList, testList);
    }

    @Test
    void mergeSortWithSmallUnsortedListWithGreaterNumbers() {
        MergeSortImpl dummy = new MergeSortImpl();
        dummy.setIncreased(true);
        dummy.setDecreased(!dummy.isIncreased());
        List<Integer> testList = dummy.mergeSort(Arrays.asList(10000000, 78963, 4859337, 4759602, 4000000, 3485, 2, 4859));
        List<Integer> sortedList = Arrays.asList(2, 3485, 4859, 78963, 4000000, 4759602, 4859337, 10000000);
        assertEquals(sortedList, testList);
    }
}