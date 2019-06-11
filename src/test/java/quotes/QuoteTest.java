package quotes;

import com.google.gson.Gson;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class QuoteTest {
    @Test
    public void canGetAuthor() throws FileNotFoundException {
        Gson gson = new Gson();
        Quote[] aQuote = gson.fromJson(new FileReader("json/recentquotes.json"), Quote[].class);

        String expected = "Marilyn Monroe";
        String actual = aQuote[0].getAuthor();

        assertEquals(expected, actual);
    }

    @Test
    public void canGetQuote() throws FileNotFoundException {
        Gson gson = new Gson();
        Quote[] aQuote = gson.fromJson(new FileReader("json/recentquotes.json"), Quote[].class);

        String expected = " “I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.” ";
        String actual = aQuote[0].getText();

        assertEquals("Should be equal", expected, actual);
    }

}
