import java.util.Vector;

public class User {
	private int _userID;
	private String _name;
	private String _email;
	private String _password;
	public Vector<Ticket> _buys_belongs = new Vector<Ticket>();
	public Vector<Object> _follows = new Vector<Object>();
	public Vector<Object> _makes = new Vector<Object>();

	public void register() {
		throw new UnsupportedOperationException();
	}

	public void login() {
		throw new UnsupportedOperationException();
	}

	public void updateUser() {
		throw new UnsupportedOperationException();
	}

	public void searchEvent() {
		throw new UnsupportedOperationException();
	}

	public void purchaseTicket() {
		throw new UnsupportedOperationException();
	}

	public void followArtist() {
		throw new UnsupportedOperationException();
	}
}