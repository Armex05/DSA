public class Hanoy2 {
    public static void move(int n, char s, char d, char a){
        /* n = number of rings
           s = start
           d = destination
           a = helper point
         */
        if (n == 1){ // in this one, all the cases should use the helper char
            System.out.println(s + " -> " + a);
            System.out.println(a + " -> " + d);
        }
        else {
            move(n-1, s,a,d);
            System.out.println(s + " -> " + a);
            move(n-1, a, d,s);
            System.out.println(a + " -> " + d);
        }
    }
}
