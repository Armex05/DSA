public class BigNumber {
    private int[] digits;
    private int size;
    private boolean isNegative;

    public BigNumber(String number) {
        if (number.charAt(0) == '-') {
            isNegative = true;
            number = number.substring(1);
        } else {
            isNegative = false;
        }
        size = number.length();
        digits = new int[size];
        for (int i = 0; i < size; i++) {
            digits[i] = Character.getNumericValue(number.charAt(i));
        }
    }
    public BigNumber add(BigNumber other) {
        if (this.isNegative == other.isNegative) {
            int maxSize = Math.max(this.size, other.size);
            int[] result = new int[maxSize + 1];
            int carry = 0;

            for (int i = 0; i < maxSize; i++) {
                int digit1 = (i < this.size) ? this.digits[this.size - 1 - i] : 0;
                int digit2 = (i < other.size) ? other.digits[other.size - 1 - i] : 0;
                int sum = digit1 + digit2 + carry;
                result[maxSize - i] = sum % 10;
                carry = sum / 10;
            }
            result[0] = carry;
            BigNumber res = new BigNumber(resultToString(result));
            res.isNegative = this.isNegative;
            return res;
        } else {
            return this.isNegative ? other.subtract(this.abs()) : this.subtract(other.abs());
        }
    }

    public BigNumber subtract(BigNumber other) {
        if (this.isNegative && other.isNegative) {
            return other.abs().subtract(this.abs());
        }
        if (this.isNegative) {
            return this.abs().add(other).negate();
        }
        if (other.isNegative) {
            return this.add(other.abs());
        }

        if (this.isLessThan(other)) {
            return other.subtract(this).negate();
        }

        int[] result = new int[this.size];
        int borrow = 0;

        for (int i = 0; i < this.size; i++) {
            int digit1 = this.digits[this.size - 1 - i];
            int digit2 = (i < other.size) ? other.digits[other.size - 1 - i] : 0;
            int sub = digit1 - digit2 - borrow;

            if (sub < 0) {
                sub += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[this.size - 1 - i] = sub;
        }
        return new BigNumber(resultToString(result));
    }

    private boolean isLessThan(BigNumber other) {
        if (this.size < other.size) return true;
        if (this.size > other.size) return false;

        for (int i = 0; i < this.size; i++) {
            if (this.digits[i] < other.digits[i]) return true;
            if (this.digits[i] > other.digits[i]) return false;
        }
        return false;
    }

    public BigNumber abs() {
        BigNumber result = new BigNumber(this.toString());
        result.isNegative = false;
        return result;
    }

    public BigNumber negate() {
        BigNumber result = new BigNumber(this.toString());
        result.isNegative = !this.isNegative;
        return result;
    }

    public BigNumber shiftLeft() {
        int[] result = new int[this.size + 1];
        System.arraycopy(this.digits, 0, result, 1, this.size);
        result[this.size] = 0;
        return new BigNumber(resultToString(result));
    }

    public BigNumber shiftRight() {
        if (this.size == 1) {
            return new BigNumber("0");
        }
        int[] result = new int[this.size - 1];
        System.arraycopy(this.digits, 1, result, 0, this.size - 1);
        return new BigNumber(resultToString(result));
    }

    private String resultToString(int[] result) {
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;

        for (int digit : result) {
            if (digit != 0) {
                leadingZero = false;
            }
            if (!leadingZero) {
                sb.append(digit);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    @Override
    public String toString() {
        return (isNegative ? "-" : "") + resultToString(this.digits);
    }

    public static void main(String[] args) {
        BigNumber num1 = new BigNumber("99999");
        BigNumber num2 = new BigNumber("67890");
        BigNumber num3 = new BigNumber("-77777");
        BigNumber num4 = new BigNumber("-88888");

        System.out.println("addition num1 & num2: " + num1.add(num2));
        System.out.println("sub of num2 from num1: " + num2.subtract(num1));
        System.out.println("sub of num1 from num2: " + num1.subtract(num2));
        System.out.println("addition num3 & num4: " + num3.add(num4));
        System.out.println("sub of num4 from num3: " + num4.subtract(num3));
        System.out.println("left shift num1: " + num1.shiftLeft());
        System.out.println("right shift num1: " + num1.shiftRight());
    }
}
