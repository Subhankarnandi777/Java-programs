class StringDemo {
    public static void main(String[] args) {

        String s = "Hello Java";

        System.out.println("charAt: " + s.charAt(1));
        System.out.println("compareTo: " + s.compareTo("Hello"));
        System.out.println("equals: " + s.equals("Hello Java"));
        System.out.println("equalsIgnoreCase: " + s.equalsIgnoreCase("hello java"));
        System.out.println("indexOf: " + s.indexOf("Java"));
        System.out.println("length: " + s.length());
        System.out.println("substring: " + s.substring(0,5));
        System.out.println("toLowerCase: " + s.toLowerCase());
        System.out.println("toUpperCase: " + s.toUpperCase());
        System.out.println("trim: " + "  Java  ".trim());
        System.out.println("valueOf: " + String.valueOf(100));
    }
}
