import java.util.Vector;

public class Event {
	private int _eventID;
	private String _title;
	private Object _date;
	private Object _time;
	private String _venue;
	private double _price;
	private int _availableTicket;
	public Vector<Artist> _have = new Vector<Artist>();
	public Venue _takes_place;
	public Vector<Ticket> _processes = new Vector<Ticket>();

	public void updateEvent() {
		throw new UnsupportedOperationException();
	}

	public void checkAvailability() {
		throw new UnsupportedOperationException();
	}

	public void cancelEvent() {
		throw new UnsupportedOperationException();
	}
}