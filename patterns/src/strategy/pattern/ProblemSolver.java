package strategy.pattern;

public class ProblemSolver {
    SortingAlgorithm sortingAlgorithm;
    String problemDescription;
    String procedureDiscription;
    Object[] arr = new Object[4];
    public ProblemSolver(){
    }
    public ProblemSolver(Object[] arr){
        this.arr = arr;
    }
    public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }
}
