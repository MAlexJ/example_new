package task_thread_demon;

/**
 * Created by admin on 24.02.2015.
 */
public class App_02 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " isDaemon() ->" + Thread.currentThread().isDaemon());
    }
}
