## exercise 2 / a 

Inheritance is shown in the way `Problem` extends `Exception`, which itself extends `Throwable` showing an upward hierarchy of classes. `abstaract class problem` doesn't have any instances, but it morphs into two subclasses `WeirdProblem` and `TrickyProblem`, which inherit from all the above superclasses. 

The program seems to be designed exception-proof. `Experiment` throws two specific Exceptions and provides cases for each, which are then caught in the `main`. `Experiment2` throws a Problem, which doesn't have any instances, but as `WeirdProblem` and `TrickyProblem` are instances of it's subclasses, they don't necessarily have to be defined seaprately as in `Experiment`. To assure efficient exception handling, the the  `catch (Problem w)` in the `main` covers both specific exceptions leaving no room for error. However, using the more generic Problem exception might not provide as much information on the nature of the exception.

## exercise 2 / b

The the functionality cound be achieved by modifying the Decorater class to have two decoration options. 

```
interface Decorator {
    String decorate(String input);
    String decorate2(String input);
}

```
and further modifying `Fancy` so that sucsequently printer3 calls decorator.decorate2(String)

```
class Fancy implements Decorator {
    @Override
    public String decorate(String input) {              // Decorator method
        return "== " + input + " ==";
    }

    @Override 
    public String decorate2(String input) {              // Decorator method
        return "--== " + input + " ==--";
    }
}

```
This is of course too repetitive, and the way the decoration is embedded in the return statement of the `decorate` method in `Fancy` impedes the method's reusability. Maybe a more flexible solution would be add a field `printerNumber` to printers. Different decoration Strings could be stored in a data structure or even in their own class e.g. `DecorationCatalog` and could be fetched by the corresponding printer number as a parameter. 




