public class SumFactorial {
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
        sum = sum + fact;
        calculate(n, i+1, sum, fact);
        // with this code we won't calculate the fact from bottom to top every time,
    }

}
