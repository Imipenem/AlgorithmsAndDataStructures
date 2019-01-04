package main.java.Week1.Week1_DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

public class MergeSortImpl {
    public static void main(String[] args) {
        //Used for implementation testing
    }

    /**
     * With this method I try to implement the merge sort algorithm. It will sort the list ONLY in increasing order, but I´ll add
     * a decreasing option.
     *
     * @param listToBeSorted the list, that needs to be in sorted (increasing) order.
     * @return the "sorted by merge sort since 1899" list
     */

    public List<Integer> mergeSort(List<Integer> listToBeSorted) {

        if (listToBeSorted.size() <= 1) {
            return listToBeSorted;
        } else {
            List<Integer> leftList = listToBeSorted.subList(0, listToBeSorted.size() / 2);
            List<Integer> rightList = listToBeSorted.subList(listToBeSorted.size() / 2, listToBeSorted.size());
            return merge(mergeSort(leftList), mergeSort(rightList));
        }
    }

    /**
     * This method simply merges (and sort) the recursively splitted lists.
     *
     * @param leftList The lefthand list to be merged
     * @param rightList The righthand list to be merged
     * @return the merged (and sorted) (part)List
     */

    private List<Integer> merge(List<Integer> leftList, List<Integer> rightList) {
        List<Integer> sortedPartList = new ArrayList<>();
        int indLeft = 0;
        int indRight = 0;

        while (leftList.size() - 1 >= indLeft && rightList.size() - 1 >= indRight) {

            if (leftList.get(indLeft) <= rightList.get(indRight)) {
                sortedPartList.add(leftList.get(indLeft));
                indLeft++;
            } else {
                sortedPartList.add(rightList.get(indRight));
                indRight++;
            }
        }

        // as one list is empty at this point, simply add the remaining elements of the other list to the new sortedList

        if (leftList.size() == indLeft) {
            for (int i = indRight; i < rightList.size(); i++) {
                sortedPartList.add(rightList.get(indRight));
                indRight++;
            }
        } else {
            for (int i = indLeft; i < leftList.size(); i++) {
                sortedPartList.add(leftList.get(indLeft));
                indLeft++;
            }
        }
        return sortedPartList;
    }
}
