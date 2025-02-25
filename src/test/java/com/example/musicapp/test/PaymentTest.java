package com.example.musicapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class PaymentTest {

    private Payment payment;

    @Mock
    private Object mockLinked;

    @Mock
    private Object mockMakes;

    @BeforeEach
    public void setUp() {
        // Initialize mocks
        MockitoAnnotations.openMocks(this);

        // Create a new Payment instance
        payment = new Payment();
    }

    @Test
    public void testGetPaymentID() {
        assertEquals(0, payment.getPaymentID(), "Initial payment ID should be 0");
    }

    @Test
    public void testGetUserID() {
        assertEquals(0, payment.getUserID(), "Initial user ID should be 0");
    }

    @Test
    public void testGetTicketID() {
        assertEquals(0, payment.getTicketID(), "Initial ticket ID should be 0");
    }

    @Test
    public void testGetPrice() {
        assertEquals(0.0, payment.getPrice(), "Initial price should be 0.0");
    }

    @Test
    public void testGetLinked() {
        // Mock behavior for _linked
        payment._linked = mockLinked;
        when(mockLinked.toString()).thenReturn("Mocked Linked Object");

        assertNotNull(payment.getLinked(), "Linked object should not be null");
        assertEquals("Mocked Linked Object", payment.getLinked().toString(), "Linked object should return mocked value");
    }

    @Test
    public void testGetMakes() {
        // Mock behavior for _makes
        payment._makes = mockMakes;
        when(mockMakes.toString()).thenReturn("Mocked Makes Object");

        assertNotNull(payment.getMakes(), "Makes object should not be null");
        assertEquals("Mocked Makes Object", payment.getMakes().toString(), "Makes object should return mocked value");
    }

    @Test
    public void testProcessPayment() {
        assertThrows(UnsupportedOperationException.class, () -> {
            payment.processPayment();
        }, "processPayment should throw UnsupportedOperationException");
    }

    @Test
    public void testRetundPayment() {
        assertThrows(UnsupportedOperationException.class, () -> {
            payment.retundPayment();
        }, "retundPayment should throw UnsupportedOperationException");
    }
}