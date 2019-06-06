package quotes;

public class Quote {
/********
 * Instance Variables
 * */
    private String author;
    private String text;


/********
 * Constructors
 * */
    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }


/********
 * Getters/Setters
 * */
    public String getAuthor() { return this.author; }
    public String getText() { return this.text; }

    public void setAuthor(String author) { this.author = author; }
    public void setText(String quote) { this.text = text; }
}
