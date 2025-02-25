package com.example.musicapp;

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
	public Object _takes_place;
	public Vector<Object> _processes = new Vector<Object>();

	public void updateEvent() {
		throw new UnsupportedOperationException();
	}

	public void checkAvailability() {
		throw new UnsupportedOperationException();
	}

	public void cancelEvent() {
		throw new UnsupportedOperationException();
	}

    public int getEventID() {
        return _eventID;
    }

    public String getTitle() {
        return _title;
    }

    public Object getDate() {
        return _date;
    }

    public Object getTime() {
        return _time;
    }

    public String getVenue() {
        return _venue;
    }

    public double getPrice() {
        return _price;
    }

    public int getAvailableTicket() {
        return _availableTicket;
    }

    public Vector<Artist> getHave() {
        return _have;
    }

    public Vector<Object> getProcesses() {
        return _processes;
    }
}