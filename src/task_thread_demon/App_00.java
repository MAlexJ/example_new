package task_thread_demon;

/**
 * Created by admin on 24.02.2015.
 */
public class App_00 {

    public static void main(String[] args) {

        // Use an empty constructor
        Thread thread = new Thread();
        // To start a thread
        thread.start();

        //Create a new thread
        Thread thread1 = new Thread(new Runnable() {
            // Override the method "run()"
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName());
                        System.out.println(Thread.currentThread().getId());
                        System.out.println("This thread works");
                        Thread.sleep(700);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //To start a thread
        thread1.start();

        System.out.println(" The on main thread ");


    }


}
