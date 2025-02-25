import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArtistTest {

    @Test
    public void testGetFullName() {
        Artist artist = new Artist("John", "Doe");
        String fullName = artist.getFullName();
        assertEquals("John Doe", fullName, "The full name should be 'John Doe'");
    }
}
