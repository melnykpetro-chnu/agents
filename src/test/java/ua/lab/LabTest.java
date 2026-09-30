package ua.lab;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LabTest {

    private final OrderService orderService = new OrderService();
    private final UserService userService = new UserService();

    @Test
    void shouldApplyDiscount() {
        List<Product> products = List.of(
                new Product("Laptop", 1000.0, 1)
        );

        double result = orderService.calculateTotal(products, 0.10);

        assertEquals(900.0, result, 0.001);
    }

    @Test
    void shouldReturnZeroForEmptyProducts() {
        double result = orderService.averagePrice(List.of());

        assertEquals(0.0, result, 0.001);
    }

    @Test
    void shouldFormatUser() {
        User user = new User("John Smith");

        assertEquals("User: John Smith", userService.formatUser(user));
    }
}
