import com.example.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoodTest {
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
        assertEquals("Sukonbu", gintama.getLocation().get(0).getItems().get(0).getFood().get(0).getName());
    }

    @Test
    public void getDescriptionTest() {
        assertEquals("Pickled seaweed from Kagura's stash (makes your breath smell bad)",
                gintama.getLocation().get(0).getItems().get(0).getFood().get(0).getDescription());
    }

    @Test
    public void getCostTest() {
        assertEquals(10, gintama.getLocation().get(0).getItems().get(0).getFood().get(0).getCost(), 0);
    }

    @Test
    public void getConsequenceTest() {
        assertEquals("Kagura drop kicked you. You somehow managed to stay alive.  Congrats.",
                gintama.getLocation().get(0).getItems().get(0).getFood().get(0).getConsequence());
    }
}
