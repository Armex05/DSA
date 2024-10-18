public class Subsets {
    public static void generateSubsets(int[] set, int[] currentSubset, int index, int subsetSize) {
        System.out.print("{ ");
        for (int i = 0; i < subsetSize; i++) {
            System.out.print(currentSubset[i] + " ");
        }
        System.out.println("}");

        for (int i = index; i < set.length; i++) {
            currentSubset[subsetSize] = set[i];
            generateSubsets(set, currentSubset, i + 1, subsetSize + 1);
        }
    }

    public static void main(String[] args) {
        int[] set = {1, 2, 3,4};
        int[] currentSubset = new int[set.length];
        generateSubsets(set, currentSubset, 0, 0);
    }
}