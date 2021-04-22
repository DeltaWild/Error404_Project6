### Bank Test Documentation
#### Author: DeltaWild

##### The following methods DO NOT require testing:
* Bank() constructor does not warrant testing. Implementation is simple and existing.
* main() does not (currently) warrant testing. Console print-out not likely to produce errors.
* getInsufficientFundsPenalty() does not warrant testing. Implementation is simple and existing.
* getNAME() does not warrant testing. Implementation is simple and existing.
* addAccountWizard() is (presumably) a GUI element, based on comments of similarly-named addCustomerWizard() and 
cannot be tested with JUnit.
* addCustomerWizard() is a GUI element and cannot be tested with JUnit.

##### The following methods DO require testing:
* setInsufficientFundsPenalty()
* getAllAccounts()
* addCustomer()
* removeCustomer()
* getAllCustomers()
* getCustomer() *OVERLOADED METHOD* Both variants need testing!
* getCustomerAccounts()