package Library;

class Library{
    Book[] books;
    int count;

    public Library(int size){
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book){
        if (count >= books.length){
            System.out.println("Library is full");
            return;
        }
        books[count] = book;
        count++;
    }

    public void showAllBooks(){
        for (int i = 0; i < count; i++){
            System.out.println("Title: " + books[i].title);
            System.out.println("Autrho: " + books[i].author);
            if (books[i].isAvailabe == true){
                System.out.println("Book is available");
            } else {
                System.out.println("Book is rented");
            }
        }
    }

    public static void main(String[] args){
        Library lib = new Library(3);

        Book book1 = new Book("자바의 정석", "남궁성");
        Book book2 = new Book("클린 코드", "로버트 C. 마틴");
        Book book3 = new Book("이펙티브 자바", "조슈아 블로크");
        Book book4 = new Book("이펙티브 자바", "조슈아 블로크");

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);

        System.out.println("=== Library total books ===");
        lib.showAllBooks();

        System.out.println("borrow");
        boolean success = book1.borrow(); 
        if (success) {
            System.out.println(book1.title + " 대출 성공!");
        }
        book1.printInfo(); 

        System.out.println("\n=== 반납 테스트 ===");
        book1.returnBook();
        book1.printInfo();
    }
}
