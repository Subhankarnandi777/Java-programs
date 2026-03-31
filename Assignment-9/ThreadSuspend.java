class ThreadSuspend extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSuspend t = new ThreadSuspend();
        t.start();
        t.suspend();
        t.resume();
    }
}
