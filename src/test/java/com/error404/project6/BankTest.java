package com.error404.project6;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BankTest {

    @Mock private Customer c1Mock;
    @Mock private Customer c2Mock;
    @Mock private SavingsAccount c1SavingsMock;
    @Mock private SavingsAccount c2SavingsMock;
    
    private Bank testBank;

    @BeforeEach
    void setUp(TestInfo testInfo) {
        testBank = new Bank("Test Bank");

        if (testInfo.getTestMethod().isPresent()) {
            String testingThis = testInfo.getTestMethod().get().getName();
            System.out.println(testingThis);
        }
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
    /* END Set Insufficient Funds Penalty Tests */

    /* BEGIN Get All Accounts Test Suite */
    @Test
    @DisplayName("Get All Accounts Test - Method Execution")
    void testGetAllAccounts() {
            assertNotNull(testBank.getAllAccounts(), "No accounts retrieved!");
        );
    }
    /* END Get All Accounts Test Suite */

    /* BEGIN Add Customer Test Suite */
    @Test
    @DisplayName("Add Customer Test - Method Execution")
    void testAddCustomer() {
        assertEquals(1, testBank.addCustomer("Doe", "John"));

    }
    /* END Add Customer Test Suite */

    /* BEGIN Remove Customer Test Suite */
    @Test
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

    @Test
    void testGetAllCustomers() {
    }

    @Test
    void testGetCustomerByID() {
    }

    @Test
    void testGetCustomerByName() {
    }

    @Test
    void getCustomersAccounts() {
    }
    /*@AfterEach
    void last(TestInfo testInfo) {
        String testingThis = testInfo.getTestMethod().get().getName();
        System.out.println(testingThis);
    }*/
}