### Transaction Test Documentation
#### Author: DeltaWild

##### The following methods DO NOT require testing:
* getId() does not warrant testing. Implementation is simple and unlikely to cause error.
* getTimestamp() does not warrant testing. Implementation is simple and unlikely to cause error.
* getType() does not warrant testing. Implementation is simple and unlikely to cause error.
* getAmount() does not warrant testing. Implementation is simple and unlikely to cause error.
* getDescription() does not warrant testing. Implementation is simple and unlikely to cause error.

##### The following methods DO require testing:
* See under review list

##### The following methods are under review:
* Transaction() constructor - CASE: type passed not in TransactionType enum; CASE: zero or negative amount passed


### Transaction Type Documentation
TransactionType enum does not require testing. This documentation is included for clarity and completeness only; it is 
attached to Transaction Test Documentation as the most relevant document, as TransactionType does not warrant its own.