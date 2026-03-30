class RangeException extends Exception {
    RangeException(String msg) {
        super(msg);
    }
}

class MarksheetMain {
    public static void main(String[] args) {
        try {
            String name = args[0];
            int total = 0;

            for(int i = 1; i <= 6; i++) {
                int marks = Integer.parseInt(args[i]);

                if(marks < 0 || marks > 50)
                    throw new RangeException("Marks out of range");

                total += marks;
            }

            double percent = (total / 300.0) * 100;
            System.out.println("Name: " + name);
            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percent);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
