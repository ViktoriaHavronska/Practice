package basic_6_exercise.Inheritance;

 class Book extends LibraryItem{
    public int numberOfPages;

     public Book(String author, int publicationYear, int numberOfPages) {
         super(author, publicationYear);
         this.numberOfPages = numberOfPages;
     }

     public void displayInfo(){
         super.displayInfo();
         System.out.println("Number of pages: " + numberOfPages);
     }
 }
