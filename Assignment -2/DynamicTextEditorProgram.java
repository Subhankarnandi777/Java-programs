import java.util.Scanner;

class DynamicTextEditorProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial text: ");
        StringBuffer text = new StringBuffer(sc.nextLine());

        System.out.println("Current Text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Capacity: " + text.capacity());

        System.out.print("Enter text to append: ");
        text.append(sc.nextLine());
        System.out.println("After Append: " + text);

        System.out.print("Enter position to access character: ");
        int pos = sc.nextInt();
        System.out.println("Character: " + text.charAt(pos));

        sc.nextLine();

        System.out.print("Enter text to insert: ");
        String insertText = sc.nextLine();

        System.out.print("Enter position to insert: ");
        int insertPos = sc.nextInt();

        text.insert(insertPos, insertText);
        System.out.println("After Insert: " + text);

        sc.nextLine();
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        int index = text.indexOf(word);
        if(index != -1)
            System.out.println("Word found at position: " + index);
        else
            System.out.println("Word not found");

        sc.close();
    }
}
