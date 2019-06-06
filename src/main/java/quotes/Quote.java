package quotes;

public class Quote {
/********
 * Instance Variables
 * */
    private String author;
    private String quote;


/********
 * Constructors
 * */
    public Quote(String author, String quote) {
        this.author = author;
        this.quote = quote;
    }


/********
 * Getters/Setters
 * */
    public String getAuthor() { return this.author; }
    public String getQuote() { return this.quote; }

    public void setAuthor(String author) { this.author = author; }
    public void setQuote(String quote) { this.quote = quote; }
}
