package com.error404.project6;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;

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
    void setUp() {
        testBank = new Bank("Test Bank");
    }
    void first(TestInfo testInfo) {
        String testingThis = testInfo.getTestMethod().get().getName();
        System.out.println(testingThis);
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
        // Given
        SortedSet<Customer> customers = new TreeSet<>();
        customers.add(c1Mock);
        customers.add(c2Mock);
        SortedSet<Account> allAccts = new TreeSet<>();
        // When
        for (Customer c : customers) {
            SortedSet<Account> custAccts = c.getCustomerAccounts();
            allAccts.addAll(custAccts);
        }
        // Then
        assertAll("Returns account ID in order (first, last) with two provided.",
                () -> assertEquals(1, c1SavingsMock.getAccountId(), "FIRST ACCT TEST: " +
                        "Account ID does not match expected."),
                () -> assertEquals(2, c2SavingsMock.getAccountId(), "SECOND ACCT TEST: " +
                        "Account ID does not match expected.")
        );
    }
    /* END Get All Accounts Test Suite */

    /* BEGIN Add Customer Test Suite */
    @Test
    @DisplayName("Add Customer Test - Method Execution")
    void testAddCustomer() {
        String firstName = "John";
        String lastName = "Doe";
        testBank.addCustomer(lastName, firstName);
        assertTrue(checkList(lastName, firstName), "Customer not found. Add operation failed.");
    }
    private boolean checkList(String lastName, String firstName) {
        List<String> name = Arrays.asList(lastName, firstName);
        try {
            if (testBank.getCustomer(lastName, firstName).containsAll(name)) return true;
        } catch (NullPointerException e) {
            System.out.println("Customer list is empty.");
            return false;
        }
        return false;
    }
    /* END Add Customer Test Suite */

    @Test
    void testRemoveCustomer() {
    }

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
    @AfterEach
    void last(TestInfo testInfo) {
        String testingThis = testInfo.getTestMethod().get().getName();
        System.out.println(testingThis);
    }
}