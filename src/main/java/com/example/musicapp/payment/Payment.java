package com.example.musicapp;

public class Payment {
	private int _paymentID;
	private int _userID;
	private int _ticketID;
	private double _price;
	public Object _linked;
	public Object _makes;

	public void processPayment() {
		throw new UnsupportedOperationException();
	}

	public void retundPayment() {
		throw new UnsupportedOperationException();
	}

    public int getPaymentID() {
        return _paymentID;
    }

    public int getUserID() {
        return _userID;
    }

    public int getTicketID() {
        return _ticketID;
    }

    public double getPrice() {
        return _price;
    }

    public Object getLinked() {
        return _linked;
    }

    public Object getMakes() {
        return _makes;
    }
}