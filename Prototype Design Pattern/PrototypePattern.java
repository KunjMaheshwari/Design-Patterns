// Step1-> Create an Interface
interface Prototype{
    Prototype clone();
}

// Step2 -> Implement the Prototype Class
class Book implements Prototype{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    // Step 3 -> Implement a clone method
    @Override
    public Prototype clone(){
        return new Book(this.title, this.author);
    }

    public void showDetails(){
        System.out.println("Book: "+ title+" by "+ author);
    }
}

public class PrototypePattern {
    public static void main(String[] args){
        Book book1 = new Book("Design Patterns", "Kunj");
        book1.showDetails();

        // Step 4 -> Creating a new object using cloning 
        Book book2 = (Book) book1.clone();
        book2.showDetails();
    }
}
