package com.error404.project6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AccountTest {

    @Mock private Customer c1Mock;
    @Mock private Account a1Mock;

    private Bank testBank; // possibly unneeded, will determine

    @BeforeEach
    void setUp() { // possibly unneeded, will determine
        testBank = new Bank("Test Bank");
    }

    /* BEGIN Deposit Test Suite */
    @Test
    @DisplayName("Deposit Test - Negative Case")
    void testDeposit_NegativeCase() {
    }

    @Test
    @DisplayName("Deposit Test - Zero Case")
    void testDeposit_ZeroCase() {
    }

    @Test
    @DisplayName("Deposit Test - Positive Case")
    void testDeposit_PositiveCase() {
    }
    /* END Deposit Test Suite */

    /* BEGIN Withdraw Test Suite */
    @Test
    @DisplayName("Withdraw Test - Negative Case")
    void testWithdraw_NegativeCase() {
    }

    @Test
    @DisplayName("Withdraw Test - Zero Case")
    void testWithdraw_ZeroCase() {
    }

    @Test
    @DisplayName("Withdraw Test - Positive Case, Insufficient Funds")
    void testWithdraw_PositiveCase_InsufficientFunds() {
    }

    @Test
    @DisplayName("Withdraw Test - Positive Case, Sufficient Funds")
    void testWithdraw_PositiveCase_SufficientFunds() {
    }
    /* END Withdraw Test Suite */

    /* BEGIN Transfer Test Suite */
    @Test
    @DisplayName("Transfer Test - Negative Case")
    void testTransfer_NegativeCase() {
    }

    @Test
    @DisplayName("Transfer Test - Zero Case")
    void testTransfer_ZeroCase() {
    }

    @Test
    @DisplayName("Transfer Test - Positive Case, Insufficient Funds")
    void testTransfer_PositiveCase_InsufficientFunds() {
    }

    @Test
    @DisplayName("Transfer Test - Positive Case, Sufficient Funds")
    void testTransfer_PositiveCase_SufficientFunds() {
    }
    /* END Transfer Test Suite */

    /* BEGIN Get Transactions Test Suite */
    @Test
    @DisplayName("Get Transactions Test - Method Execution")
    void testGetTransactions() {
    }
    /* END Get Transactions Test Suite */

    /* BEGIN Get Transaction Test Suite */
    @Test
    @DisplayName("Get Transaction - Method Execution, Transaction Exists")
    void testGetTransaction_TransactionExists() {
    }

    @Test
    @DisplayName("Get Transaction - Method Execution, Transaction Does Not Exist")
    void testGetTransaction_NoSuchTransaction() {
        assertThrows(
          IllegalArgumentException.class,
                () -> a1Mock.getTransaction(1),
                "No error thrown - should throw IllegalArgumentException."
        );
    }
    /* END Get Transaction Test Suite */
}