Part 2
Exercise 4

class BusPaymentSystem

    Method: 'main'
    Meaning: Application entry point
    Postcondition: executes program

class UserRegistry

    This skeleton of a class used to create user accounts and manage storing them in the database, 
    which would most probably be in .json format and the users and cards would be easily accessed by theis IDs. 
    This class includes methods to create and delete users, to update info, to create, activate and deactivate cards. 
    Strong identification upon aqcuiring travel cards is the new norm so this class would need secure 
    methods to handle personal information and banking transactions.

    Method: createUser
    Method: deleteUser

    Method: createCard
    Method: checkCardBalance
    Method: updateCardStatus (activated / deactivated)

class User

    The class is used to create new users and store all their personal information.

    Method: 'User'
    Meaning: creating new user acccount and store it in the user database
    Parameter:
    Precondition: the user is identified and doesn't have an existing account
    Postcondition: the user is assigned a userID and an account is created.
    Exception: if the user already has an account throws ExistingAccountFoundException

class Card

    The class is used to create card objects and update balance and travel validity

    Has fields: String userID, String cardID, boolean isActivated, float balance, long travelTimeValidUntil

    Method: 'Card'
    Meaning: creates a new card
    Parameter: String cardId
    Preconditions: cardId must be 8 characters
    Postcondition: returns a Card object
    Exceptions: if cardID is not 8 characters throws ??

    Getters and setters for all fields.

    Method: 'makePurchase'
    Meaning: updates travelTimeUntil and balance when a purcase is made
    Parameters: 'float price' and 'long duration'
    Preconditions; balance must be greater than price
    Postconditions; substracts the price from balance using the setter, 
    updates the TravelTimeValidUntil to (System.currentTimeMillis() + parameter 'duration')
    Exception: if balance is smaller than price throws NoBalanceException

    Method: balanceTopUp
    Meaning: update balance when user wants to buy more credit
    Parameter: float amount
    Precondition: card isActivated
    Postcondition: new balance is current balance + 'float amount'
    Exception: if isActivated is false throws CardNotActviatedException

class Purchase

    Holds the hard coded values for travel price and duration e.g.

    private static final float PRICE_2H = 3.00f;
    private static final long DURATION_2H = 100060602 etc.

    Has two fields: 'float price' and 'long duration'

    Method: 'Purchase'
    Meaning: creates and returns a Purchase object using the final forms according to the parameter
    Parameter: int travelType (1 = 2h, 2 = day, 3 = month)
    Precondition: parameter is in range 1-3
    Postcondition: returns Purchase object with attributes price and duration
    Exception: if parameter is out of range throws IllegalArgumentException

class CardReader

    The CardReader objects serve as an interfaces between the application and individual cards. 
    There are numerous card readers which are stored in a database. The below method 'greenLight' 
    checks is any of the conditions that grant access to the bus are fulfilled.

    Method: greenLight
    Meaning: calls 'cardStatus' (and informs user if card is deactivated). Calls 'validTravelTimeLeft' 
    and indicates if there is transfer time left on the card (green light). If not, calls 'travelTypeInput' 
    which calls 'getPriceAndDuration'. If there is balance left on the card, 'payment' is called and user gains acccess.


    Method: 'cardStatus'
    Meaning: checks if the card introduced to the reader is activated
    Parameter: String cardID
    Precondition: cardId is valid
    Postcondition: returns a boolean value according to the status of the card
    Exception: if cardID is not valid, throws IllegalArgumentException

    Method: 'validTravelTimeLeft'
    Meaning: checks if the card has some valid travel time by checking if card travelTimeValidUntil 
    is greater than current time (via System.currentTimeMillis())
    Parameter: String cardID
    Precondition: card is activated
    Postcondition: returns boolean
    Exception: if card is deactivated throws DeactivatedCardError

    Method: 'TravelTypeInput'
    Meaning: asks user input about the desired travel choice via some sort of interface
    Postcondition: returns an integer in range 1-3 (1 = 2h, 2 = day, 3 = month)
    Exception: if the input is not valid thorows IllegalArgumentException

    Method: 'getPriceAndDuration'
    Meaning: creates a Purchase object to define the price and duration of the journey
    Parameter: int travelType is an integer in range 1-3
    Postcondition: returns Purchase object
    Exception: if their's no balance left throws an NoBlanceException

    Method: 'payment'
    Meaning: calls 'getPriceAndDuration' and the Card class's makePurcase methods to update the card attributes 'balance' and 'travelTimeValiduntil'
    Parameters: String cardID, 'float price' and 'long duration' (via Purchase object)
