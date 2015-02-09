package go.concurrent.ThinkInJava;

/**
 * Created by mark on 2/9/15.
 */
public abstract  class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel() {
        canceled = true;
    }
    public boolean isCanceled() {
        return canceled;
    }
}

