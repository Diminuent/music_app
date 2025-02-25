import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Vector;
import Artist;

public class ArtistTest {

    @Test
    public void testConstructor() {
        Artist artist = new Artist();
        assertNotNull("Artist object should not be null", artist);
        assertEquals("Initial artist ID should be 0", 0, artist.getArtistID());
        assertNull("Initial name should be null", artist.getName());
        assertNull("Initial genre should be null", artist.getGenre());
        assertNotNull("Event vector should not be null", artist.getEvents());
        assertTrue("Event vector should be empty", artist.getEvents().isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddEvent() {
        Artist artist = new Artist();
        artist.addEvent();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateEvent() {
        Artist artist = new Artist();
        artist.updateEvent();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testManageProfile() {
        Artist artist = new Artist();
        artist.manageProfile();
    }
}
