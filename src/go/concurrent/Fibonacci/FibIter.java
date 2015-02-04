package go.concurrent.Fibonacci;

/**
 * Created by mark on 2/4/15.
 */
public class FibIter {
    public int get(int n) {
        int f0 = 0;
        int f1 = 1;
        if (n == 0) return f0;
        if (n == 1) return f1;
        for (int i = n; i > 1; i--) {
            int k = f0 + f1;
//            if (k > 10000) k %= 10000;
            f0 = f1;
            f1 = k;
        }
        return f1;
    }
}
