import com.example.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YoruzuyaTest {
    private static Person gintama;

    @Before
    public void setUp() throws Exception {
        RuntimeTypeAdapterFactory<Location> locationParser = RuntimeTypeAdapterFactory.of(Location.class, "type");
        locationParser.registerSubtype(Yoruzuya.class, "Yoruzuya Gin-Chan");
        locationParser.registerSubtype(Shinsengumi.class, "Shinsengumi HQ");

        Gson gson = new GsonBuilder().registerTypeAdapterFactory(locationParser).create();
        String str = Data.getFileContentsAsString("Gintama.json");
    }

    @Test
    public void getNameTest() {
        assertEquals("Yoruzuya", gintama.getLocation().get(0).getName());
    }

    @Test
    public void getDescriptionTest() {
        assertEquals("Welcome to Yoruzuya Gin-Chan.  If you do not have any money, get out.",
                gintama.getLocation().get(0).getDescription());
    }

    @Test
    public void playTest() {
        assertEquals("Kagura and Sadaharu are happy that you played with them.  You have earned 100 yen",
                Yoruzuya.play());
    }

    @Test
    public void cleanTest() {
        assertEquals("Shinpachi is very happy that you helped him clean Yoruzuya Gin-Chan.  You have earned 200 yen",
                Yoruzuya.clean());
    }

    @Test
    public void napTest() {
        assertEquals("Congrats on napping for an hour.  Naps are important.  Naps are fun.",
                Yoruzuya.nap());
    }

    @Test
    public void lazeTest() {
        assertEquals("Congrats on successfully lazing around and wasting an entire hour",
                Yoruzuya.laze());
    }

    @Test
    public void hideTest() {
        assertEquals("Congrats on hiding from Otose-tanukibaba and not paying rent for the 4th month in a row!",
                Yoruzuya.hide());
    }
}
