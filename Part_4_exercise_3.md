# Part 4 Exercise 3

The methods utilize inheritance and generics. In the original code, class `Bird` implements interfaces `Winged` and `Bipedal`, and when an abstract sublass `Bird` is then created, all instances of its subclasses will implement the said interfaces - in this case class `Crow`. 

Challenge1 requires the parameter be `Bird` object, which will then fly and walk. Challenge2 is not concerned with the type of the parameter as long as it implements `Winged` and `Bipedal`. A class `Bat` was created to demostrate this feature. 

Generics can be used to treat objects from different unrelated classes in the similar way as long as they share some predefined features. Winged and bipedal creatures are far and few so the program was extended to include classes `Ladybug implements Wingerd` and `Aeroplane implements Winged` and method `challenge3` to demonstrate the benefits of generics even further with method.


```
class Bat implements Winged, Bipedal {
    private static int idx = 0;
    private int id = ++idx;

    @Override
    public String toString() {
        return "Bat " + id;
    }
}

class Ladybug implements Winged {
    private static int idx = 0;
    private int id = ++idx;

    @Override
    public String toString() {
        return "Ladybug " + id;
    }
}

class Aeroplane implements Winged {
    private static int idx = 0;
    private int id = ++idx;

    @Override
    public String toString() {
        return "Boeing747 " + id;
    }
}

public class Exercise3 {
    public Exercise3() {
        System.out.println("Exercise 3");

        challenge1(new Crow());
        
        challenge2(new Crow());
        challenge2(new Bat());
        
        challenge3(new Crow());
        challenge3(new Bat());
        challenge3(new Ladybug());
        challenge3(new Aeroplane());
    }

    void challenge1(Bird b) {
        System.out.println("In this challenge, we fly and then we walk!");

        b.fly();
        b.walk();
    }

    <X extends Winged & Bipedal> void challenge2(X b) {
        System.out.println("In this challenge, we fly and then we walk!");

        b.fly();
        b.walk();
    }

    <X extends Winged> void challenge3(X b) {
        System.out.println("In this challenge, we only fly!");
        
        b.fly();
    }

}
```

