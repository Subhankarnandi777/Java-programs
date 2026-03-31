class ThreadRun implements Runnable {
    public void run() {
        System.out.println("Thread Running using Runnable");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadRun());
        t.start();
    }
}
