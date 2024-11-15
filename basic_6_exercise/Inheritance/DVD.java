package basic_6_exercise.Inheritance;

 class DVD extends LibraryItem{
     public int  duration;

     public DVD(String author, int publicationYear, int duration) {
         super(author, publicationYear);
         this.duration = duration;
     }

     public void displayInfo(){
         super.displayInfo();
         System.out.println("Duration: " + duration + " minutes");
     }
 }
