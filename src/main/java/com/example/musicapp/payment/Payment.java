public class Payment {
	private int _paymentID;
	private int _userID;
	private int _ticketID;
	private double _price;
	public Ticket _linked;
	public User _makes;

	public void processPayment() {
		throw new UnsupportedOperationException();
	}

	public void retundPayment() {
		throw new UnsupportedOperationException();
	}
}