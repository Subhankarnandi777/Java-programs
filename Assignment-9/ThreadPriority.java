class ThreadPriority extends Thread {
    int count = 0;

    public void run() {
        long end = System.currentTimeMillis() + 10;
        while(System.currentTimeMillis() < end) {
            count++;
        }
        System.out.println("Priority " + getPriority() + " Count = " + count);
    }

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();
        ThreadPriority t4 = new ThreadPriority();

        t1.setPriority(1);
        t2.setPriority(3);
        t3.setPriority(5);
        t4.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
