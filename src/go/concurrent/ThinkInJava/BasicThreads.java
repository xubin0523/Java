package go.concurrent.ThinkInJava;

/**
 * Created by mark on 2/5/15.
 */
public class BasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new LiftOff());
            t.start();
            System.out.println("waiting");
        }
    }
}
