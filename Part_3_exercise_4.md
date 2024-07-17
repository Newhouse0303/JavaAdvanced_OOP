## a:

Doing calculations with temperatures is tricky as Celsius and Fahrenheit have negative values. This could be resolved by converting them to Kelvin for overall compatibility, with appropriate exception handling to avoid zeroDivisionError with 0.00 K

Temperatures could be represented through abstract super class `Scale`, which would have subclasses for each scale. It would have a method ´getValueInKelvin` which would return the said value. Each subclass would override it to apply the appropriate conversion formula. The same goes for ToString which would be modified to each classes' required output.

## b:



## c:
 
## d:

## e: