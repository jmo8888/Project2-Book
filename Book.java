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
    // 90
    private int borrowed;
    // 91
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    // 85 & 87 & 91
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookCourseText;
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
    // 90
    public int getBorrowed(){
        return borrowed;
    }
    // 91
    public boolean isCourseText(){
        return courseText;
    }
    // 87 & 89
    public void setRefNumber(String bookRefNumber){
        if (bookRefNumber.length() >= 3){
            refNumber = bookRefNumber;
        }
        else {
            System.out.println("Error - Reference Number must be at least 3 characters");
        }
    }
    // 90
    public void borrow(){
        borrowed = borrowed + 1;
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
    // 90
    public void printBorrowed(){
        System.out.println("Number of times book has been borrowed: " + borrowed);
    }
    // 88 & 90
    public void printDetails(){
        System.out.println("#############################");
        printAuthor();
        printTitle();
        printPages();
        printRefNumber();
        printBorrowed();
        System.out.println("#############################");
    }
   
}

