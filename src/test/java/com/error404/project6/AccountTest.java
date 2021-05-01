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

    private Account testAcctZeroBal, testAcctPosBal;

    @BeforeEach
    void setUp() {
        testAcctZeroBal = new SavingsAccount(c1Mock, 0.00, "Test Account");
        testAcctPosBal = new SavingsAccount(c1Mock, 100.00, "Test Account Positive Balance");
    }

    /* BEGIN Deposit Test Suite */
    @Test
    @DisplayName("Deposit Test - Negative Case")
    void testDeposit_NegativeCase() {
        final double depAmt = -10.00;

        assertTrue(depAmt > 0, depAmt + " is an invalid deposit. Deposits must be greater than zero.");
    }

    @Test
    @DisplayName("Deposit Test - Zero Case")
    void testDeposit_ZeroCase() {
        final double depAmt = 0.00;

        assertTrue(depAmt > 0, depAmt + " is an invalid deposit. Deposits must be greater than zero.");
    }

    @Test
    @DisplayName("Deposit Test - Positive Case")
    void testDeposit_PositiveCase() {
        final double initBal = 0.00;
        final double depAmt = 10.00;
        final double finBal = initBal + depAmt;

        testAcctZeroBal.deposit(depAmt);

        assertEquals(finBal, testAcctZeroBal.getBalance(),
                "Balance should be " + finBal + " but was " + testAcctZeroBal.getBalance() + ".");
    }
    /* END Deposit Test Suite */

    /* BEGIN Withdraw Test Suite */
    @Test
    @DisplayName("Withdraw Test - Negative Case")
    void testWithdraw_NegativeCase() {
        final double withAmt = -10.00;

        assertTrue(withAmt > 0, withAmt + " is an invalid withdrawal: withdrawal must be greater than zero.");
    }

    @Test
    @DisplayName("Withdraw Test - Zero Case")
    void testWithdraw_ZeroCase() {
        final double withAmt = 0.00;

        assertTrue(withAmt > 0, withAmt + " is an invalid withdrawal: withdrawal must be greater than zero.");
    }

    @Test
    @DisplayName("Withdraw Test - Positive Case, Insufficient Funds")
    void testWithdraw_PositiveCase_InsufficientFunds() {
        final double initBal = 100.00;
        final double withAmt = 110.00;
        double finBal = initBal - withAmt;

        testAcctPosBal.withdraw(withAmt);
        final double ifp = 10.00;
        if (withAmt > initBal) {
            finBal -= ifp;
            testAcctPosBal.balance -= ifp;
        }

        assertEquals(finBal, testAcctPosBal.getBalance(),
                "Balance should be " + finBal + " but was " + testAcctPosBal.getBalance() + ".");
    }

    @Test
    @DisplayName("Withdraw Test - Positive Case, Sufficient Funds")
    void testWithdraw_PositiveCase_SufficientFunds() {
        final double initBal = 100.00;
        final double withAmt = 10.00;
        final double finBal = initBal - withAmt;

        testAcctPosBal.withdraw(withAmt);

        assertEquals(finBal, testAcctPosBal.getBalance(),
                "Balance should be " + finBal + " but was " + testAcctPosBal.getBalance() + ".");
    }
    /* END Withdraw Test Suite */

    /* BEGIN Get Transactions Test Suite */
    @Test
    @DisplayName("Get Transactions Test - Method Execution")
    void testGetTransactions() {
        assertNotNull(testAcctZeroBal.getTransactions(), "Invalid return of NULL.");
    }
    /* END Get Transactions Test Suite */

    /* BEGIN Get Transaction Test Suite */
    @Test
    @DisplayName("Get Transaction - Method Execution, Transaction Exists")
    void testGetTransaction_TransactionExists() {
        assertNotNull(testAcctZeroBal.getTransaction(1), "Invalid return of NULL.");
    }

    @Test
    @DisplayName("Get Transaction - Method Execution, Transaction Does Not Exist")
    void testGetTransaction_NoSuchTransaction() {
        assertThrows(
          IllegalArgumentException.class,
                () -> testAcctZeroBal.getTransaction(1),
                "No error thrown - should throw IllegalArgumentException."
        );
    }
    /* END Get Transaction Test Suite */
}