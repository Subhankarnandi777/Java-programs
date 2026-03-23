import java.util.Scanner;

class DocumentProcessingSystemProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter document text: ");
        StringBuffer doc = new StringBuffer(sc.nextLine());

        System.out.println("Document: " + doc);
        System.out.println("Length: " + doc.length());
        System.out.println("Capacity: " + doc.capacity());

        System.out.print("Enter text to append: ");
        doc.append(sc.nextLine());

        System.out.println("Updated Document: " + doc);

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        int index = doc.indexOf(word);

        if(index != -1)
            System.out.println("Found at position: " + index);
        else
            System.out.println("Not Found");

        System.out.println("Final Document: " + doc.toString());

        sc.close();
    }
}
