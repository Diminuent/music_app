package com.example.musicapp;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtistTest {

    private Artist artist;

    @BeforeEach
    public void setUp() {
        artist = new Artist();
    }

    @Test
    public void testGetArtistID() {
        artist = new Artist();
        assertEquals(0, artist.getArtistID(), "Initial artist ID should be 0");
    }

    @Test
    public void testGetName() {
        artist = new Artist();
        assertNull(artist.getName(), "Initial name should be null");
    }

    @Test
    public void testGetGenre() {
        artist = new Artist();
        assertNull(artist.getGenre(), "Initial genre should be null");
    }

    @Test
    public void testGetEvents() {
        artist = new Artist();
        Vector<Event> events = artist.getEvents();
        assertNotNull(events, "Events vector should not be null");
        assertTrue(events.isEmpty(), "Initial events vector should be empty");
    }

    @Test
    public void testAddEvent() {
        artist = new Artist();
        assertThrows(UnsupportedOperationException.class, () -> {
            artist.addEvent();
        }, "addEvent should throw UnsupportedOperationException");
    }

    @Test
    public void testUpdateEvent() {
        artist = new Artist();
        assertThrows(UnsupportedOperationException.class, () -> {
            artist.updateEvent();
        }, "updateEvent should throw UnsupportedOperationException");
    }

    @Test
    public void testManageProfile() {
        artist = new Artist();
        assertThrows(UnsupportedOperationException.class, () -> {
            artist.manageProfile();
        }, "manageProfile should throw UnsupportedOperationException");
    }
}