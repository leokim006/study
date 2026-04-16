package Library;

class Book{
    String title;
    String author;
    boolean isAvailabe;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailabe = true;
    }

    public void printInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (isAvailabe == true){
            System.out.println("Book is available");
        } else {
            System.out.println("Book is rented");
        }
    }

    public boolean borrow(){
        if (isAvailabe != true){
            return false;
        }
        isAvailabe = false;
        return true;
    }

    public void returnBook(){
        isAvailabe = true;
    }
}
