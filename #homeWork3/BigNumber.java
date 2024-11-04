class BigNumber {
    private static final int MAX = 500;
    private int[] digits = new int[MAX];
    private int size;

    public BigNumber() {
        size = 1;
        digits[0] = 1;
        for (int i = 1; i < MAX; i++) {
            digits[i] = 0;
        }
    }

    public void multiply(int num) {
        int carry = 0;
        for (int i = 0; i < size; i++) {
            int product = digits[i] * num + carry;
            digits[i] = product % 10;
            carry = product / 10;
        }
        while (carry > 0) {
            digits[size] = carry % 10;
            carry /= 10;
            size++;
        }
    }

    public void print() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
