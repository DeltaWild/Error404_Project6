### Savings Account Test Documentation
#### Author: DeltaWild

##### The following methods DO NOT require testing:
* getDefaultInterestRate() does not warrant testing. Implementation is simple and unlikely to cause error.

##### The following methods DO require testing:
* SavingsAccount() constructor *with* additional param interestRate
* setDefaultInterestRate()

##### The following methods are under review:
* SavingsAccount() constructor *without* additional param - if tested under class Account, does it need to be tested 
  here too as no additional values are passed?
* deposit() - overridden method is tested in class Account, does it need to be tested here too?
* withdraw() - overridden method is tested in class Account, does it need to be tested here too?
* addInterestTransaction - CASE: if account balance is negative, adding interest will push it further negative which 
  is not the intent of a savings account; interest rates are not fees, and should not be paid out on negative balances