package task_deadlock;

/**
 * Created by admin on 24.02.2015.
 */
public class DeadLockOne {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}
