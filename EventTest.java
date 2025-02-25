import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class EventTest {

    @Test
    public void testIsUpcoming() {
        Event futureEvent = new Event("Concert", LocalDate.now().plusDays(10));
        assertTrue(futureEvent.isUpcoming(), "The event should be upcoming");

        Event pastEvent = new Event("Festival", LocalDate.now().minusDays(5));
        assertFalse(pastEvent.isUpcoming(), "The event should not be upcoming");
    }
}
