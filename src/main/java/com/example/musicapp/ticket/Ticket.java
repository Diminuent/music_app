public class Ticket {
	private int _ticketID;
	private int _eventID;
	private int _userID;
	private double _price;
	public User _buys_belongs;
	public Payment _linked;

	public void sendTicket() {
		throw new UnsupportedOperationException();
	}

	public void refundTicket() {
		throw new UnsupportedOperationException();
	}
}