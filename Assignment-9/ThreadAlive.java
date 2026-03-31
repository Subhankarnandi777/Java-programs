class ThreadAlive extends Thread {
    public void run() {
        System.out.println("Thread Running");
    }

    public static void main(String[] args) {
        ThreadAlive t = new ThreadAlive();
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
    }
}
