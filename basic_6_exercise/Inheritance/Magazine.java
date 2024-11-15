package basic_6_exercise.Inheritance;

 class Magazine extends LibraryItem{
    public int issueNumber;

     public Magazine(String author, int publicationYear, int issueNumber) {
         super(author, publicationYear);
         this.issueNumber = issueNumber;
     }

     public void displayInfo(){
         super.displayInfo();
         System.out.println("Issue Number: " + issueNumber);
     }
 }
