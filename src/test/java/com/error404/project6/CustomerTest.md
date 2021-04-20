### Customer Test Documentation
#### Author: DeltaWild

##### The following methods DO NOT require testing:
* Customer() constructor does not warrant testing. Implementation is simple and existing.
* getBank() does not warrant testing. Implementation is simple and unlikely to cause error.
* getCustomerId() does not warrant testing. Implementation is simple and unlikely to cause error.
* getLastName() does not warrant testing. Implementation is simple and unlikely to cause error.
* getFirstName() does not warrant testing. Implementation is simple and unlikely to cause error.

##### The following methods DO require testing:
* getCustomerAccounts()
* removeAccount()

##### The following methods are under review:
* ytdFees() - Unknown cases
* ytdInterest() - Unknown cases
* addSavingsAccount() - CASE: Negative initBal passed
* getAccount() - CASE: invalid accountID returns null, how is that handled?