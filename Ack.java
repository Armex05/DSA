public class Ack {
    public static void main(String[] args) {

        int x = ack(3,2);
        System.out.println(x);
    }
   static int ack(int m, int n){
        if(n < 0 || m < 0) return 0;
        else if (m==0) return n+1 ;
        else if (n == 0) return ack(m-1, 1);
        else return ack(m-1, ack(m,n-1));
    }
}