class ThreadYield extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        ThreadYield t1 = new ThreadYield();
        ThreadYield t2 = new ThreadYield();

        t1.start();
        t2.start();
    }
}
