public class TruthTable {
    public static void generateTruthTable(int numPropositions) {
        int rows = (int) Math.pow(2, numPropositions);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < numPropositions; j++) {
                // محاسبه مقدار هر گزاره (۰ یا ۱)
                int value = (i / (int) Math.pow(2, numPropositions - j - 1)) % 2;
                System.out.print(value + "t");
            }
            System.out.println();
        }
    }
}
