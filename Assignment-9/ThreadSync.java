class Counter {
    synchronized void count() {
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
    }
}

class ThreadSync extends Thread {
    Counter c;

    ThreadSync(Counter c) {
        this.c = c;
    }

    public void run() {
        c.count();
    }

    public static void main(String[] args) {
        Counter c = new Counter();

        ThreadSync t1 = new ThreadSync(c);
        ThreadSync t2 = new ThreadSync(c);

        t1.start();
        t2.start();
    }
}
