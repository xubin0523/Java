package go.concurrent.ThinkInJava;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by mark on 2/9/15.
 */
public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;
    public EvenChecker(IntGenerator g, int ident) {
        generator = g;
        id = ident;
    }
    @Override
    public void run() {
     //   System.out.println("thread#" + id);
        while(!generator.isCanceled()) {
            int val = generator.next();
            if ((val % 2) != 0) {
                System.out.println("thread#" + id + "value:"+ val + " not even");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator gp, int count) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            executorService.execute(new EvenChecker(gp, i));
        }
        executorService.shutdown();
    }
}
