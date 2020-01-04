package ca.uvic.seng330.m9;

class CCounter implements Runnable {

    private int counter = 0;
    private final int rounds = 100000;

    @Override
    public void run () {
      for(int i = 0; i < rounds; i++) {
      System.out.println(i);
      synchronized (this) {
        int tmp = counter + 1;
        counter = tmp;
        }
      }
    }

    public static void main (String[] args) {
      try {
        CCounter c = new CCounter();

        // Create two threads that run our run () method.
        Thread t1 = new Thread(c, "thread1");
        Thread t2 = new Thread(c, "thread2");

        t1.start(); t2.start();

        // Wait for the threads to finish.
        t1.join(); t2.join();

        // Print the counter
        System.out.println(c.counter);
      } catch (InterruptedException e) {
        System.out.println ("Interrupted!");
      }
    }
}