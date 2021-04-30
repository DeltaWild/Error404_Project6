package com.error404.project6;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BankTest {

    @Mock private Customer c1Mock;
    @Mock private Customer c2Mock;
    @Mock private SavingsAccount c1SavingsMock;
    @Mock private SavingsAccount c2SavingsMock;

    @Captor private ArgumentCaptor<String> captor;
    
    private Bank testBank;

    @BeforeEach
    void setUp(TestInfo testInfo) {
        testBank = new Bank("Test Bank");
        when(c1Mock.getCustomerId())
                .thenReturn("1");
    }

    /* BEGIN Set Insufficient Funds Penalty Test Suite */
    @Test
               @DisplayName("Set Insufficient Funds Penalty Test - Negative Case")
    void testSetInsufficientFundsPenalty_NegativeCase() {
        double newIFP = -20.00; // Negative value passed to method
        double insufficientFundsPenalty = 10.00;  // Original value in Bank.java

        insufficientFundsPenalty = newIFP;
        assert(insufficientFundsPenalty > 0) : insufficientFundsPenalty + " is not valid. insufficientFundsPenalty " +
                "must be greater than 0.";
    }

    @Test
    @DisplayName("Set Insufficient Funds Penalty Test - Zero Case")
    void testSetInsufficientFundsPenalty_ZeroCase() {
        double newIFP = 0.00; // Zero value passed to method
        double insufficientFundsPenalty = 10.00;  // Original value in Bank.java

        insufficientFundsPenalty = newIFP;
        assert(insufficientFundsPenalty > 0) : insufficientFundsPenalty + " is not valid. insufficientFundsPenalty " +
                "must be greater than 0.";
    }

    @Test
    @DisplayName("Set Insufficient Funds Penalty Test - Positive Case")
    void testSetInsufficientFundsPenalty_PositiveCase() {
        double newIFP = 50.00; // Positive value passed to method
        double insufficientFundsPenalty = 10.00;  // Original value in Bank.java

        insufficientFundsPenalty = newIFP;
        assert(insufficientFundsPenalty > 0) : insufficientFundsPenalty + " is not valid. insufficientFundsPenalty " +
                "must be greater than 0.";
    }
    /* END Set Insufficient Funds Penalty Test Suite */

    /* BEGIN Get All Accounts Test Suite */
    @Test
    @DisplayName("Get All Accounts Test - Method Execution")
    void testGetAllAccounts() {
            assertNotNull(testBank.getAllAccounts(), "No accounts retrieved!");
    }
    /* END Get All Accounts Test Suite */

    /* BEGIN Add Customer Test Suite */
    @Test
    @DisplayName("Add Customer Test - Method Execution")
    void testAddCustomer() {
        assertEquals("1", testBank.addCustomer("Doe", "John"));

    }
    /* END Add Customer Test Suite */

    /* BEGIN Remove Customer Test Suite */
    @Test
    @DisplayName("Remove Customer Test - Method Execution")
    void testRemoveCustomer() {
        // Given
        Map<String, Customer> custTestMap = new HashMap<>();
        custTestMap.put("1", c1Mock);
        // When
        testBank.removeCustomer("1");
        // Then
        assertEquals(0, custTestMap.size(), "Test Map should be empty. Customer not removed.");
    }
    /* END Remove Customer Test Suite */

    /* BEGIN Get All Customers Test Suite */
    @Test
    @DisplayName("Get All Customers Test - Method Execution")
    void testGetAllCustomers() {
        assertNotNull(testBank.getAllCustomers(), "No customers retrieved!");
    }
    /* END Get All Customers Test Suite */

    /* BEGIN Get Customer By ID Test Suite */
    @Test
    @DisplayName("Get Customer By ID Test - Method Execution")
    void testGetCustomerByID() {
        assertNotNull(testBank.getCustomer("1"), "Invalid return of NULL.");
    }
    /* END Get Customer By ID Test Suite */

    /* BEGIN Get Customer By Name Test Suite */
    @Test
    @DisplayName("Get Customer By Name - Method Execution")
    void testGetCustomerByName() {
        assertNotNull(testBank.getCustomer("Doe", "John"), "Invalid return of NULL.");
    }
    /* END Get Customer By Name Test Suite */

    /* BEGIN Get Customer's Accounts Test Suite */
    @Test
    @DisplayName("Get Customer's Accounts - Method Execution")
    void getCustomersAccounts() {
        assertNotNull(testBank.getCustomersAccounts("1"), "Invalid return of NULL.");
    }
    /* END Get Customer's Accounts Test Suite */
}