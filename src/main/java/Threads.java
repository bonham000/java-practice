public class Threads {
    private int count = 0;
    private synchronized void inc() {
        count++;
    }
    private void increment() {
        for (int i = 0; i < 10000; i++) {
            inc();
        }
    }
    public void run() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count);

    }

    public int getCount() {
        return count;
    }
}
