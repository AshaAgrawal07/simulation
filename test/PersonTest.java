import com.example.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PersonTest {

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
    public void getBalanceTest() {
        gintama.setBalance(30000);
        assertEquals(30000, gintama.getBalance(), 0);
    }

    @Test
    public void getStartingLocationTest() {
        assertEquals("Yoruzuya Gin-Chan", gintama.getStartingLocation());
    }

    @Test
    public void getStartingTimeTest() {
        assertEquals(0, gintama.getStartingTime(), 0);
    }

    @Test
    public void getCarryItemsTest() {
        ArrayList<Thing> expected = new ArrayList<>();
        assertEquals(expected, gintama.getCarryItems());
    }
}
