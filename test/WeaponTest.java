import com.example.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
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
        assertEquals("Kagura's umbrella", gintama.getLocation().get(0).getItems().get(0).getWeapon().get(0).getName());
    }

    @Test
    public void getDescriptionTest() {
        assertEquals("One of the strongest Yato Clan member's OP weapon",
                gintama.getLocation().get(0).getItems().get(0).getWeapon().get(0).getDescription());
    }

    @Test
    public void getCostTest() {
        assertEquals(4000, gintama.getLocation().get(0).getItems().get(0).getWeapon().get(0).getCost(), 0);
    }
}
