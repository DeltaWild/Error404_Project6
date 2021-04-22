package com.error404.project6;

import org.junit.jupiter.api.*;

import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
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
        /* Mock customer data */
        SortedSet<Customer> customers = new TreeSet<>();
        Customer c1 = new Customer(testBank, "Doe", "John");
        Customer c2 = new Customer(testBank, "Smith", "Jane");
        customers.add(c1);
        customers.add(c2);

        /* Test Begins */
        SortedSet<Account> allAccts = new TreeSet<>();

        for (Customer c : customers) {
            allAccts.add(getCustAcct(c));
        }
        assertAll("Returns account ID in order (first, last) with two provided.",
                () -> assertEquals(0, allAccts.first().compareTo(getCustAcct(c1)), "FIRST ACCT TEST: " +
                        "Account ID does not match expected."),
                () -> assertEquals(0, allAccts.last().compareTo(getCustAcct(c2)), "SECOND ACCT TEST: " +
                        "Account ID does not match expected.")
        );
    }
    /* END Get All Accounts Test Suite */

    /* UNEXPECTED END OF TESTS */

    /* BEGIN Add Customer Test Suite */
    @Test
    @DisplayName("Add Customer Test - Method Execution")
    void testAddCustomer() {
        testBank.addCustomer("Doe", "John");
        assertEquals(testBank.getCustomer("Doe", "John"), testBank.getCustomer("Does", "John"), "Customer not found. " +
                "Add operation failed.");
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
    private Account getCustAcct(Customer c) {
        Account c1Savings = new SavingsAccount(c, 150.00, "John's Account");
        Account c2Savings = new SavingsAccount(c, 400.00, "Jame's Account");
        if (c.getLastName() == "Doe") return c1Savings;
        else return c2Savings;
    }
}