package go.concurrent.Fibnacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description
 * Created by xubin on 2015-02-01.
 */
public class CalFib {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        String num;
        FibMem fib = new FibMem();
        while((num = stdin.readLine()) != null) {
            long start = System.currentTimeMillis();
            System.out.println(fib.get(Integer.parseInt(num)));
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }
    }
}
