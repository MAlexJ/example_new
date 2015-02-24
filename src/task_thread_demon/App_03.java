package task_thread_demon;

/**
 * Created by admin on 24.02.2015.
 */
public class App_03 {

    public static void main(String[] args) {

        // IllegalThreadStateException
        Thread.currentThread().setDaemon(true);
        System.out.println(Thread.currentThread().isDaemon());
    }
}
