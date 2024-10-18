public class SumFactorialInverse {
    public static void calculate(int n,int i, int sum, int fact){
        // first call i and fact ard sum are 1
        if (n == 0){
            System.out.println(" the sum is 1" );
            return;
        }
        if(i == n){
            System.out.println(" the sum is " + sum);
            return;
        }
        fact = (i+1) * fact;
        sum = sum + 1/fact;
        calculate(n, i+1, sum, fact);
        // it's all like the previous one except that it is 1/fact
    }
}
