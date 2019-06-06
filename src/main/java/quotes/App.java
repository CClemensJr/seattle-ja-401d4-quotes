/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        Quote[] aQuote = gson.fromJson(new FileReader("json/recentquotes.json"), Quote[].class);

        int randIndex = (int) (Math.random() * (aQuote.length - 0) + 1);

        System.out.println(aQuote[randIndex].getText() + "\n\t- " + aQuote[randIndex].getAuthor());
    }
}

