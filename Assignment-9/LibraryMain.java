class Book {
    String title;
    boolean issued = false;

    Book(String title) {
        this.title = title;
    }

    void borrow() {
        if(!issued) {
            issued = true;
            System.out.println(title + " borrowed");
        } else {
            System.out.println(title + " already issued");
        }
    }

    void returnBook() {
        issued = false;
        System.out.println(title + " returned");
    }
}

class LibraryMain {
    public static void main(String[] args) {
        Book b1 = new Book("Java");
        b1.borrow();
        b1.returnBook();
    }
}
