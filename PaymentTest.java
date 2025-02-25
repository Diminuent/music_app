import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    private PaymentGateway paymentGateway;
    private Payment payment;

    @BeforeEach
    public void setUp() {
        paymentGateway = mock(PaymentGateway.class);
        payment = new Payment(paymentGateway);
    }

    @Test
    public void testProcessPayment() {
        // Arrange
        when(paymentGateway.process(anyDouble())).thenReturn(true);

        // Act
        boolean result = payment.process(100.0);

        // Assert
        assertTrue(result, "The payment should be processed successfully");
        verify(paymentGateway, times(1)).process(100.0);
    }
}
