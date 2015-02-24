package task_thread_demon;

public class App_01 {


    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (; ; ) {
                    try {
                        Thread.sleep(100);
                        System.out.println("Demon");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.setDaemon(true);
        thread.start();

        Thread.sleep(500);
        System.out.println("========= Main ========");

    }
}
