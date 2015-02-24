package task_deadlock;

/**
 * Created by admin on 24.02.2015.
 */
public class DeadLockTwo {

    public static void main(String[] args) {

       final Thread [] arrThread = new Thread[2];

        arrThread[0] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("arrThread[0] join ->  arrThread[1].join()");
                    arrThread[1].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        arrThread[1] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("arrThread[1] join ->  arrThread[0].join()");
                    arrThread[0].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        arrThread[0].start();
        arrThread[1].start();
    }

}
