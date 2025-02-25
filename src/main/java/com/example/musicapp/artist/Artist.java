import java.util.Vector;

public class Artist {
	private int _artistID;
	private String _name;
	private String _genre;
	public Vector<Event> _have = new Vector<Event>();

	public Artist() {
		this._artistID = _artistID;
		this._name = _name;
		this._genre = _genre;
		this._have = _have;
	}

	public void addEvent() {
		throw new UnsupportedOperationException();
	}

	public void updateEvent() {
		throw new UnsupportedOperationException();
	}

	public void manageProfile() {
		throw new UnsupportedOperationException();
	}

    public int getArtistID() {
        return _artistID;
    }

    public String getName() {
        return _name;
    }

    public String getGenre() {
        return _genre;
    }

    public Vector<Event> getHave() {
        return _have;
    }
}