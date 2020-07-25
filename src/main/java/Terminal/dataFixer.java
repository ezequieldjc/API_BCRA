package Terminal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class dataFixer {

    public static void main (String[] args) throws IOException {

        String url = "http://data.fixer.io/api/latest?access_key=265f6d0519cb1582523176c6f6b41591&format=1";
        URL obj = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
        int responseCode = conn.getResponseCode();
        System.out.println("Sending get request to url: " + url);
        System.out.println("Response code: " + responseCode);





    }

}
