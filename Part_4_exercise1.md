## Part 4 Exercise 1

#A

Zipper: 

```
abstract public class Zipper implements AutoCloseable {

    //constructor: 
    public Zipper(String zipFile) throws IOException {}

    //methods:
    public void close() throws IOException {}
    private void unzip() throws IOException {}
    public void run() throws IOException {}
    protected List<Handler> createHandlers() throws IOException {}
    protected abstract Handler createHandler(Path file);

    // nested class:
    protected abstract static class Handler {
        
        //constructor: 
        public Handler(Path file) {}

        //method: 
        abstract public void handle() throws IOException;
    }   
}

```
ZipperTest:

```
class TestZipper extends Zipper {

    //methods
    @Override 
    protected Handler createHandler(Path file) {

            // creates new Handler object and overrides abstract public void handle() to define how an individual file should be handled        
    }
} 
```
Exercise 3: 

Exercise1 object is created to create TestZipper instance which will call parent class Zippers run() to eventually implement TestZipper class's versions of `class Handle` abstract methods: `createHandler()`and `handle()`.

B#

Zipper class provides the basic funtionality for file handling (retrieving, opening, reading, creating temp, closing) files. It how ever does not define how the data should be presented / dealt with, which is evident as the handle methods are abstract. Child class TestZipper overrides the abstract methods `createHandler()`and `handle()`. This way the Zipper class could be extended to serve numerous child classes spezialized in data presentation. The Exercise1 class remains tidy and if more Zipper subclasses were to be created only this line would have to be modified: 
`try (var zipper = new {nameHolder}Zipper("books.zip"))`

C#

Zipper extends closeable so the close() method is automatically closed after try/catch bloc to get rifd of the temp file in the manner describerd in the overridden close() definition.  

D#

Handler is a static nested class, so it engages with the outer Zipper class but is dependent on Zipper instances. Being static makes it possible for TestZipper and other subclasses to modify it. It encapsulates abstract behavior (handle() method) for handling files (Path file), allowing subclasses to define specific file processing logic while maintaining encapsulation and modularity in the design.