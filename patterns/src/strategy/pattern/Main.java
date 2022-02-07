package strategy.pattern;

public class Main {
    public static void main(String[] args) {
        ProblemSolver p = new ProblemSolver();
        // when array contains many elements use quick sort
        Integer[] arr1 = new Integer[500];
        p.setArr(arr1);
        p.setSortingAlgorithm(new QuickSort());
        p.sortingAlgorithm.sort();
        // when array is set of bounded integers, use radix sort
        Integer[] arr2 = new Integer[100];
        p.setArr(arr2);
        p.setSortingAlgorithm(new RadixSort());
        p.sortingAlgorithm.sort();
        // when array contains non integer values use merge sort
        String[] arr3 = new String[20];
        p.setArr(arr3);
        p.setSortingAlgorithm(new MergeSort());
        p.sortingAlgorithm.sort();
    }
}
