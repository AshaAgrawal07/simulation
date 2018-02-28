import com.example.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShinsengumiTest {
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
        assertEquals("Shinsengumi HQ", gintama.getLocation().get(1).getName());
    }

    @Test
    public void getDescriptionTest() {
        assertEquals("Welcome to Shinsengumi HQ.  Hopefully you have already read the Kyokucho Hatto; if you haven't, commit seppuku.  Also, we don't work for free.",
                gintama.getLocation().get(1).getDescription());
    }

    @Test
    public void arrestTest() {
        assertEquals("Congrats on helping arrest the head of the Joui Patriots.  You have been awarded 1000 yen",
                Shinsengumi.arrest("arrest Zura"));
    }

    @Test
    public void stakeOutTest() {
        assertEquals("Congrats on successfully wasting 1 hour of your time",
                Shinsengumi.stakeOut());
    }

    @Test
    public void readTest() {
        assertEquals("Congrats on finally realizing the true and innate beauty of the Kyokucho Hatto",
                Shinsengumi.read("read Kyokucho Hatto"));

        assertEquals("Why on earth are you wasting time reading trash??????",
                Shinsengumi.read("read Twilight"));
    }

    @Test
    public void trainTest() {
        assertEquals("You need a weapon if you want to train", Shinsengumi.train());
    }

    @Test
    public void fireTest() {
        assertEquals("You need either a bazooka, canon, or umbrella if you want to train",
                Shinsengumi.fire("fire bazooka"));
    }
}
