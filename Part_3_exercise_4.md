#Exercise 4

## a:

Doing calculations with temperatures is tricky as Celsius and Fahrenheit have negative values. This could be resolved by converting them to Kelvin for overall compatibility, with appropriate exception handling to avoid zeroDivisionError with 0.00 K

Temperatures could be represented through abstract super class `Scale`, which would have subclasses for each scale. It would have a method ´getValueInKelvin` which would return the said value. Each subclass would override it to apply the appropriate conversion formula. The same goes for ToString which would be modified to each classes' required output.

```
public abstract class Scale {
    double temperature; 

    public Scale(double temperature) {
        this.temperature = temperature;
    }

    // temperature to Kelvin
    public abstract double getValueInKelvin();

    @Override
    public abstract String toString();
}

```
```
public class Celsius extends Scale {

    public Celsius(double temperature) {
        super(temperature);
    }

    @Override
    public double getValueInKelvin() {
        double kelvin = temperature + 273.15;
        if (kelvin <= 0.0) {
            throw Exception("Temperature in Kelvin must be greater than 0.0 K");
        }
        return kelvin;
    }

    @Override
    public String toString() {
        return temperature + " °C";
    }
}

```
```
public class Fahrenheit extends Scale {

    public Fahrenheit(double temperature) {
        super(temperature);
    }

    @Override
    public double getValueInKelvin() {
        double kelvin = (temperature + 459.67) * 5/9;
        if (kelvin <= 0.0) {
            throw Exception("Temperature in Kelvin must be greater than 0.0 K");
        }
        return kelvin;
    }

    @Override
    public String toString() {
        return temperature + " °F";
    }
}

```
```
public class Kelvin extends Scale {

    public Kelvin(double temperature) {
        super(temperature);
        if (temperature <= 0.0) {
            throw new Exception("Temperature in Kelvin must be greater than 0.0 K");
        }
    }

    @Override
    public double getValueInKelvin() {
        return temperature;
    }

    @Override
    public String toString() {
        return temperature + " K";
    }
}

```

## b:

Research and registering of new diseases is a long process, so there would be a super class `Disease` with fields `name` and `symptoms`. It would have three subclasses. One for emerging and fairly unknown diseases which might go by a temporary name, but would have some recognisable sympton patterns that have caucht researchers' attention. Another for recognised diseases and third for fully established diseases. 

Without any context it is difficult to imagine how the Human object is engaged in the scenario, maybe Human object could call a disease methods to get a list of respective symptoms or cure. Maybe a Symptom interfaces which would have a list of nasty methods for the subclasses to implement.

## c:

Class `retriveData` interacts with the database, creates Row objects and returns a list with createList method. 

Class Row holds the row format, setters and getters for all the values:

Class `StudentInfo` calls retrieveData's method createList.
It has boolean filter(Row row) function.
 
## d:

Assuming the requests are made via command line or some other UI, class `User interface` handles user input and codes it to correspond with the index of the desired data on the row. The limit value for the boolean search is also acquired and these (data, limit) are passed to the filter function in `StudentInfo` as parameters, thus making it reusable. The class can be easily modified to accomodate more searches and or data input to update student info. In this case classes such as Filter or UpdateInfo might be in order. 

## e:

The class Point uses Array to store the values. Regardless of th `final` keyword the contents can be accessesed and modified by different clients using `point.values[{index}]` . The solution with `record Point` is more secure as Points are immutable. The values can however be read using `point.x() and point.y().
