package basic_6_exercise.Inheritance;

 class LibraryItem {
     public String author;
     public int publicationYear;

     public LibraryItem(String author, int publicationYear) {
         this.author = author;
         this.publicationYear = publicationYear;
     }

     public void displayInfo(){
         System.out.println("Author: " + author);
         System.out.println("Publication Year: " + publicationYear);
     }

     public static void main(String[] args) {
         LibraryItem book = new Book("Adam Holmaly", 2018,658);
         book.displayInfo();
         System.out.println();

         LibraryItem magazine = new Magazine("VOGUE", 2022,4);
         magazine.displayInfo();
         System.out.println();

         LibraryItem dvd = new DVD("DVD", 2012,57);
         dvd.displayInfo();
     }
 }
