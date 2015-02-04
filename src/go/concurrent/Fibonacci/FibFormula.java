package go.concurrent.Fibonacci;

/**
 * Fibonacci formula: 1/sqrt5*(((sqrt5+1)/2)^n-((1-sqrt5)/2)^n)
 * Created by mark on 2/4/15.
 */
public class FibFormula {
    public static double sqrt5 = Math.sqrt(5);

    static class One implements Runnable {

        @Override
        public void run() {
            System.out.println("one run");
            Math.pow((sqrt5+1)/2, 40);
        }
    }

    static class Two implements Runnable {

        @Override
        public void run() {
            System.out.println("two run");

            Math.pow((1-sqrt5)/2, 40);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new One());
        Thread t2 = new Thread(new Two());
        t1.start();
        t2.start();
    }

}
