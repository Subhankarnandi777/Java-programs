class ThreadName extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadName t = new ThreadName();
        t.start();
    }
}
