class ThreadExt extends Thread {
    public void run() {
        System.out.println("Thread Running using Thread class");
    }

    public static void main(String[] args) {
        ThreadExt t = new ThreadExt();
        t.start();
    }
}
