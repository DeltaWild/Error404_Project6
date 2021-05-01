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

##### The following methods have been tested:
* deposit()
* withdraw()
* getTransaction()
* getTransactions()

##### The following methods cannot be tested:
* Account() constructor - CASE: Negative initialBalance passed
  * *Constructors cannot be tested.*
* transfer()
  * *Cannot be tested as Account is abstract and cannot be directly instantiated, and subclass SavingsAccount does
    not override method.*