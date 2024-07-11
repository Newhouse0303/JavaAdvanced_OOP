Part 2
Exercise 3

The programs objective is to inquire information from a customer regarding a prospective loan. It consists of to classes public class Bank which includes main method and additional methods for customer input and class Loan which is used to store the information and offer methods to calculate the monthly installments and additional data. The required functionalities are quite simple, but as the plan is to develop it further into a web application, the use of a separate class for loans sets a solid foundation for additional functionalities. Also this way the means to gather customer input is easier to replace as they are not embedded in the main method. Additionally, the Loan class makes it easy to update dynamic attributes such as interest rates (perhaps by creating an API functionality), bank margin etc. to be used alongside the customer interface.

Public class Bank {

    Method: 'main'
    Meaning: Application entry point
    Postcondition: executes program

    Method: 'userInput'
    Meaning: Ask user input via scanner and convert it into an integer
    Parameters: int minNumber, int maxNumber (the appropriate ranges for amount and loan term)
    Precondition: input must be between minNumber and maxNumber, minNumber < maxNumber
    Postcondition: returns an integer, no side effects
    Exceptions: throws NumberFormatException if customer input is not a number

    Method: 'calculateInstallment'
    Meaning: uses parameters to create a Loan object and calculate monthly installment
    Parameters: int principalAmount, int loanTerm
    Preconditions: both parameters must be greater than 0
    Postcondition: returns calculated installment by calling 'getMonthlyInstallment' on the Loan object

class Loan

    Method: 'Loan'
    Meaning: constructor for Loan objects
    Parameters: int principalAmount, int loanTerm, both must be > 0
    Preconditions: Both parameters must be greater than 0
    Postconditions: creates a Loan object

    Method: 'getMonthlyInstallment'
    Meaning: calculates installment
    Parameters: the object's parameters this.principalAmount and this.loanTerm
    Preconditions: Both parameters must be greater than 0
    Postconditions: returns the result of (principal / loanTerm + principal / 240)

    The class would af course have setters and getters for all the attributes, but as they are somewhat
    self explanatory they were excluded from the definitions.
