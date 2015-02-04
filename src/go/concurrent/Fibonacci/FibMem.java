package go.concurrent.Fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Description
 * Created by xubin on 2015-02-01.
 */
public class FibMem {
    private static ArrayList<BigInteger> fibCache = new ArrayList<BigInteger>();
    static {
        fibCache.add(BigInteger.ZERO);
        fibCache.add(BigInteger.ONE);
    }
    public BigInteger get(int num) {
        if (num >= fibCache.size()) {
            fibCache.add(num, get(num-1).add(get(num-2)));
        }
        return fibCache.get(num);
    }
}
