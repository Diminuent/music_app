import java.util.Vector;

public class Venue {
	private int _venueID;
	private String _name;
	private String _location;
	private int _capacity;
	public Vector<Event> _takes_place = new Vector<Event>();

	public void checkAvailability() {
		throw new UnsupportedOperationException();
	}

	public void updateCapacity() {
		throw new UnsupportedOperationException();
	}
}