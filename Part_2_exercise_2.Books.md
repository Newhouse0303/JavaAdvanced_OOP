The integrity of the book class could be ensured by creating two user roles (class librarian and class customer) where the customer would only see a immutable versions of the titles. This could be archieved by making the class attributes private and providing the information to the customers by using only getters giving or even creating a separate BookView class.

A new Book object is initialised when a new item is acquired. All the attributes are added and until something out of the ordinary happens, the item is available for viewing via customer search methods which would look for a match in the database. The information would be accessed through methods such as
getTitle(), getYear(), getPublisher(), getDescription(), getCover() etc.

In the cases of librarians, the info would be returned as above but there would be a setter for each attribute as well as remove() method.
