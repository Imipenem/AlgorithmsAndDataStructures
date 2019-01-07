package main.java.Week1.Week1_DivideAndConquer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInversions {
    public static void main(String[] args) {
        ArrayInversions test = new ArrayInversions();
        System.out.println("Number of Inversions are "+test.mergeSort(Arrays.asList(1,6,8,10,7,5,2,9,4,3)));
    }

    /**
     * This method counts the inversions of a list, that means how many steps need to be done to sort the list
     *
     * @param invList the list, The list whose inversions are to be counted
     * @return the number of inversions of invList
     */

    public int mergeSort(List<Integer> invList) {

        if (invList.size() <= 1) {
            return 0;
        } else {
            int invCount = 0;
            List<Integer> leftList = invList.subList(0, invList.size() / 2); //replace them with proper indexing
            List<Integer> rightList = invList.subList(invList.size() / 2, invList.size()); //replace them with proper indexing
            invCount+=mergeSort(leftList);
            invCount+=mergeSort(rightList);
            invCount+=merge(leftList,rightList);
            return invCount;

        }
    }

    /**
     * This method simply merges (and sort) the recursively splitted lists and counts the inversions that occur.
     * An inversion is defined as the number of elements remaining until the end of the leftList after inserting an element
     * from the rightList.
     *
     * @param leftList The lefthand list to be merged
     * @param rightList The righthand list to be merged
     * @return the inversions counted
     */

    private int merge(List<Integer> leftList, List<Integer> rightList) {
        List<Integer> sortedList = new ArrayList<>();
        int splitInvCount = 0;
        int indLeft = 0;
        int indRight = 0;

        while (leftList.size() - 1 >= indLeft && rightList.size() - 1 >= indRight) {


                if (leftList.get(indLeft) <= rightList.get(indRight)) { //change here
                    sortedList.add(leftList.get(indLeft));
                    indLeft++;
                } else {
                    sortedList.add(rightList.get(indRight));
                    indRight++;
                    splitInvCount+=(leftList.size()-indLeft);
                }
        }

        // as one list is empty at this point, simply add the remaining elements of the other list to the new sortedList

        if (leftList.size() == indLeft) {
            for (int i = indRight; i < rightList.size(); i++) {
                sortedList.add(rightList.get(indRight));
                indRight++;
            }
        } else {
            for (int i = indLeft; i < leftList.size(); i++) {
                sortedList.add(leftList.get(indLeft));
                indLeft++;
            }
        }
        return splitInvCount;
    }
}
