### Account Test Documentation
#### Author: DeltaWild

##### The following methods DO NOT require testing:
* getAccountDescription() does not warrant testing. Implementation is simple and unlikely to cause error.
* setAccountDescription() does not warrant testing. Implementation is simple and unlikely to cause error.
* getBalance() does not warrant testing. Implementation is simple and unlikely to cause error.
* getAccountID() does not warrant testing. Implementation is simple and unlikely to cause error.
* getCustomerID() does not warrant testing. Implementation is simple and unlikely to cause error.
* getAccountCreationDate does not warrant testing. Implementation is partially existing, simple, and unlikely to 
  cause error.

##### The following methods DO require testing:
* deposit()
* withdraw()
* transfer()
* getTransaction()

##### The following methods are under review:
* Account() constructor - CASE: Negative initialBalance passed
* getTransactions() - CASE: List is empty, what is return value and how is it handled?