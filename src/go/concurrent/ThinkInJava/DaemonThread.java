package go.concurrent.ThinkInJava;

import java.util.concurrent.TimeUnit;

/**
 * Created by mark on 2/9/15.
 */
public class DaemonThread {
    public static void main(String[] args) {
        try {
            System.out.println("daemon start!");
            TimeUnit.SECONDS.sleep(60);
            System.out.println("daemon end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
