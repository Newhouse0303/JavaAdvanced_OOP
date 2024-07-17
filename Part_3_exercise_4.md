#Exercise 4

## a:

Doing calculations with temperatures is tricky as Celsius and Fahrenheit have negative values. This could be resolved by converting them to Kelvin for overall compatibility, with appropriate exception handling to avoid zeroDivisionError with 0.00 K

Temperatures could be represented through abstract super class `Scale`, which would have subclasses for each scale. It would have a method ´getValueInKelvin` which would return the said value. Each subclass would override it to apply the appropriate conversion formula. The same goes for ToString which would be modified to each classes' required output.

## b:

Research and registering of new diseases is a long process, so there would be a super class `Disease` with fields `name` and `symptoms`. It would have three subclasses. One for emerging and fairly unknown diseases which might go by a temporary name, but would have some recognisable sympton patterns that have caucht researchers' attention. Another for recognised diseases and third for fully established diseases. 

Without any context it is difficult to imagine how the Human object is engaged in the scenario, maybe 


## c:
 
## d:

## e: