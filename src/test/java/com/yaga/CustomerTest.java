package com.yaga;


import com.yaga.model.Customer;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer();
    }

    @AfterEach
    void tearDown() {
        customer = null;
    }

    @Test
    void testGettersAndSetters() {
        customer.setFirstName("Sergei");
        customer.setLastName("Petrov");
        customer.setEmail("sergei@mail.ru");
        customer.setAge(30);
        customer.setAddress("123 Vladimir");
        customer.setPhoneNumber("555-1234");

        assertEquals("Sergei", customer.getFirstName());
        assertEquals("Petrov", customer.getLastName());
        assertEquals("sergei@mail.ru", customer.getEmail());
        assertEquals(30, customer.getAge());
        assertEquals("123 Vladimir", customer.getAddress());
        assertEquals("555-1234", customer.getPhoneNumber());
    }

    @Test
    void testEqualsAndHashCode() {
        Customer customer1 = new Customer("Sergei", "Petrov", "sergei@mail.ru", 30, "123 Vladimir", "555-1234");
        //Customer customer2 = new Customer("Serge", "Petrov", "sergei@mail.ru", 30, "123 Vladimir", "555-1234");
        Customer customer2 = new Customer("Sergei", "Petrov", "sergei@mail.ru", 30, "123 Vladimir", "555-1234");

        assertEquals(customer1, customer2);
        assertEquals(customer1.hashCode(), customer2.hashCode());
    }

    @Test
    void testNotEquals() {
        Customer customer1 = new Customer("Sergei", "Petrov", "sergei@mail.ru", 30, "123 Vladimir", "555-1234");
        //Customer customer2 = new Customer("Sergei", "Petrov", "sergei@mail.ru", 30, "123 Vladimir", "555-1234");
        Customer customer2 = new Customer("Petr", "Petrov", "petr@mail.ru", 30, "123 Vladimir", "555-1234");

        assertNotEquals(customer1, customer2);
        assertNotEquals(customer1.hashCode(), customer2.hashCode());
    }
}
