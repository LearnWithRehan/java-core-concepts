import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadURL {
    public static void main(String[] args) {
        try {
            // Create URL object
            URL url = new URL("https://www.blogger.com/blog/posts/2902873930902491164?hl=en-GB&tab=jj");

            // Open a stream to read from the URL
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            // Read and print each line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading from URL: " + e.getMessage());
        }
    }
}
