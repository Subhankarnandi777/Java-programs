import java.util.Scanner;

class TextEditor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial text: ");
        StringBuffer text = new StringBuffer(sc.nextLine());

        System.out.println("Text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Capacity: " + text.capacity());

        System.out.print("Enter text to append: ");
        text.append(sc.nextLine());
        System.out.println("After append: " + text);

        System.out.print("Enter position to access character: ");
        int pos = sc.nextInt();
        System.out.println("Character: " + text.charAt(pos));

        sc.nextLine();

        System.out.print("Enter text to insert: ");
        String insert = sc.nextLine();
        System.out.print("Enter position: ");
        int p = sc.nextInt();

        text.insert(p, insert);
        System.out.println("After insert: " + text);

        sc.nextLine();
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        int index = text.indexOf(word);
        if(index != -1)
            System.out.println("Found at position: " + index);
        else
            System.out.println("Not found");
    }
}
