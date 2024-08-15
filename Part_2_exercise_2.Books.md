The integrity of the book class could be ensured by creating two user roles (class librarian and class customer) where the customer would only see a immutable versions of the titles. This could be archieved by making the class attributes private and providing the information to the customers by using only getters giving or even creating a separate BookView class.

UPDATED Details about `class Book`

Upon creating a new book in the librarian class `Book newBook1 = new Book (String name, int year, String publisher etc.)` the `Book` class generates an id and adds it to the the `String id;` field. All fields are private and all dynamic actions (updating loan status, remarks about condition etc.) use this id as areference via `getId()` method. Other fields are accessible for search purposes and viewing through similar methods which would look for a match in the database. The information would be accessed through methods such as
`getTitle(), getYear(), getPublisher(), getDescription(), getCover()` etc.

In the cases of librarians, the info would be returned as above but there would be a setter for each attribute including `setLoanStatus()` , `setCondition(), isMissing() `as well as `remove()` method.
