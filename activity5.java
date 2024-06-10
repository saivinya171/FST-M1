package Activities;

//Abstract class
abstract class Book {
    String title;
    //Abstract method
    abstract void setTitle(String name);
    
    //Concrete method
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    //Define abstract method
    public void setTitle(String name) {
        title = name;
    }
}

public class activity5 {
    
    public static void main(String []args) {
        //Initialize title of the book
        String name = "Hover Car Racer";
        //Create object for MyBook
        Book newNovel = new MyBook();
        //Set title
        newNovel.setTitle(name);
        
        //Print result
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
    


