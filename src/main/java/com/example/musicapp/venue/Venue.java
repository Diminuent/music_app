import java.util.Vector;

public class Venue {
	private int _venueID;
	private String _name;
	private String _location;
	private int _capacity;
	public Vector<Object> _takes_place = new Vector<Object>();

	public void checkAvailability() {
		throw new UnsupportedOperationException();
	}

	public void updateCapacity() {
		throw new UnsupportedOperationException();
	}
}