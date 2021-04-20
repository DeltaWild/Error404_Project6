package com.error404.project6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank testBank;

    @BeforeEach
    void setUp() {
        testBank = new Bank("Test Bank");
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

    @Test
    void testGetAllAccounts() {
    }

    @Test
    void testAddCustomer() {
    }

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
}