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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    // 85
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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
    public void printDetails(){
        System.out.println("#############################");
        printAuthor();
        printTitle();
        printPages();
        System.out.println("#############################");
    }
    
   
}

