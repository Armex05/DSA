public class Hanoy {
    public static void move(int n, char s, char d, char a){
        /* n = number of rings
           s = start
           d = destination
           a = helper point
         */
        if (n == 1) System.out.println(s + " -> " + d);
        else { // we take others to  the helper point to open the way for the first one to get to destination
            move(n-1, s,a,d);
            System.out.println(s + " -> " + a);
            move(n-1, a, d,s);
        }
    }
}
