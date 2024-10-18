public class Division {
    public static int divide(int a, int b) {
        // if it's less than b it's 0
        if (a < b) {
            return 0;
        }
        // for every time it has b in it, it should add 1 to answer recursively
        return 1 + divide(a - b, b);
    }
}
