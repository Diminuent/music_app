package com.example.musicapp;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EventTest {

    private Event event;

    @BeforeEach
    public void setUp() {
        event = new Event();
    }

    @Test
    public void testGetEventID() {
        assertEquals(0, event.getEventID(), "Initial event ID should be 0");
    }

    @Test
    public void testGetTitle() {
        assertNull(event.getTitle(), "Initial title should be null");
    }

    @Test
    public void testGetDate() {
        assertNull(event.getDate(), "Initial date should be null");
    }

    @Test
    public void testGetTime() {
        assertNull(event.getTime(), "Initial time should be null");
    }

    @Test
    public void testGetVenue() {
        assertNull(event.getVenue(), "Initial venue should be null");
    }

    @Test
    public void testGetPrice() {
        assertEquals(0.0, event.getPrice(), "Initial price should be 0.0");
    }

    @Test
    public void testGetAvailableTicket() {
        assertEquals(0, event.getAvailableTicket(), "Initial available tickets should be 0");
    }

    @Test
    public void testGetHave() {
        Vector<Artist> artists = event.getHave();
        assertNotNull(artists, "Artists vector should not be null");
        assertTrue(artists.isEmpty(), "Initial artists vector should be empty");
    }

    @Test
    public void testGetProcesses() {
        Vector<Object> processes = event.getProcesses();
        assertNotNull(processes, "Processes vector should not be null");
        assertTrue(processes.isEmpty(), "Initial processes vector should be empty");
    }

    @Test
    public void testUpdateEvent() {
        assertThrows(UnsupportedOperationException.class, () -> {
            event.updateEvent();
        }, "updateEvent should throw UnsupportedOperationException");
    }

    @Test
    public void testCheckAvailability() {
        assertThrows(UnsupportedOperationException.class, () -> {
            event.checkAvailability();
        }, "checkAvailability should throw UnsupportedOperationException");
    }

    @Test
    public void testCancelEvent() {
        assertThrows(UnsupportedOperationException.class, () -> {
            event.cancelEvent();
        }, "cancelEvent should throw UnsupportedOperationException");
    }
}