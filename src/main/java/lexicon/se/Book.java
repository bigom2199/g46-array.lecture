package lexicon.se;

public class Book {
    String name ;
      private String author = "firstName,lastName";
       boolean available;
       String color;
      int PrintPages ;
      int OfPages;
      int year;

     public String bookInfo(){
      return "Book { Name: " + author +" " + available +"}";
     }

     public void Read(){
         System.out.println(" is reading");

     }
       public String BookINfo(){
         return author;
       }
     public void setLoanBook() {
         if (color == null) color = "Red";
         else this.color = color;
     }
     public void getLoanBook() {



         public void setYear(){
             if (year == null) ;
             else this.year = year;

             public Integer getYear() {
                 System.out.println(year);
             }

             }
         }
     }