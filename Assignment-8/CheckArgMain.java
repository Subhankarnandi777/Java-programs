class CheckArgument extends Exception {
    CheckArgument(String msg) {
        super(msg);
    }
}

class CheckArgMain {
    public static void main(String[] args) {
        try {
            if(args.length < 5)
                throw new CheckArgument("Less than 5 arguments");

            int sum = 0;
            for(int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            System.out.println("Sum = " + sum);

        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        }
    }
}
