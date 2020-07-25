import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class JsonTest {

    @Test
    public void testJson_notNull(){
        JsonParser parser = new JsonParser();
        InputStream inputStream =  getClass().getClassLoader().getResourceAsStream("resourceOne.json");
        Reader reader = new InputStreamReader(inputStream);
        JsonElement rootElement = parser.parse(reader);
        Assert.assertNotNull(rootElement);
    }

    @Test
    public void testJson(){
        JsonParser parser = new JsonParser();
        InputStream inputStream =  getClass().getClassLoader().getResourceAsStream("resourceOne.json");
        Reader reader = new InputStreamReader(inputStream);
        JsonElement rootElement = parser.parse(reader);
        JsonObject rootObject = rootElement.getAsJsonObject();
        JsonObject nombre = rootObject.getAsJsonObject("empleados").getAsJsonObject("nombre");
        Assert.assertNotNull(nombre);

    }

}
