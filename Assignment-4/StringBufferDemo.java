class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        System.out.println("append: " + sb);

        System.out.println("capacity: " + sb.capacity());
        System.out.println("charAt: " + sb.charAt(2));

        sb.delete(0, 4);
        System.out.println("delete: " + sb);

        sb.insert(0, "Java ");
        System.out.println("insert: " + sb);

        System.out.println("length: " + sb.length());

        sb.setCharAt(0, 'J');
        System.out.println("setCharAt: " + sb);

        sb.setLength(5);
        System.out.println("setLength: " + sb);

        System.out.println("substring: " + sb.substring(0,3));
        System.out.println("toString: " + sb.toString());
    }
}
