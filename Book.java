/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    // 85
    private int pages;
    // 87
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    // 85 & 87
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // 83
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    // 85
    public int getPages(){
        return pages;
    }
    // 87
    public String getRefNumber(){
        return refNumber;
    }
    // 87 
    public void setRefNumber(String bookRefNumber){
        refNumber = bookRefNumber;
    }
    // 84
    public void printAuthor(){
        System.out.println("Author: " + author);
    }
    public void printTitle(){
        System.out.println("Title: " + title);
    }
    // 86
    public void printPages(){
        System.out.println("Pages: " + pages);
    }    
    // 88
    public void printRefNumber(){
        String tmpRefNumber = refNumber.length() > 0 ? refNumber : "ZZZ";
        System.out.println("Ref Number: " + tmpRefNumber);
    }
    // 88
    public void printDetails(){
        System.out.println("#############################");
        printAuthor();
        printTitle();
        printPages();
        printRefNumber();
        System.out.println("#############################");
    }
   
}

