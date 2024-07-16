## exercise 1 / a

This is a case of specialization inheritance. As the super class is abstract, it is not even intended to be used to produce instances. It simply offers a user input functionality which can be modified to fit the prospective subclasses' needs. The subclass here is used for authentication purposes, but the super class could easily be extended to create various sublcasses which require user input, thus showing a case of polymorphism. 



## exercise 1 / b

The `interface NaturalResource` seems a little redundant. `float Amountleft()`is overridden with both classes in the same way, so maybe it could be written in the interface directly. Also the `@pre true`seems odd, it should surely check that the `amount >= 0`? 

If other natural resources were to be included in the comparison perhaps a different logic alltogether would be clearer e.g. 

- class NaturalResource 
- class RenewableResource extends NaturalResource 
- class Hydroelectric extends RenewableRecourse 

Similar chain would be created for non_renewables such as coal, oil and gas. Here the functionalities of the interface could be created with regular getters and setters in the `class NaturalReasource`. The `Exception("Renewable is limitless!")` would be a feature of `class RenewableResource` 

## exercise 1 / c

The super class seems unnecessarily complicated. In terms of typecasting, randomized type of return seems problematic, for instance if the client is prepared to receive an Integer but not a String. Also the hardcoded `switch` cases are not very flexible. 

Perhaps a sort of  `RandomTypeGenerator` could do just the type lottery and then the program would proceed to engage separate classes `IntegerGenerator`, `StringGenerator` and `ObjectGenerator` accordingly. This would help to avoid type conflicts and also offer an easier way to modify and maintain the output in different cases, for example generating random integer in the range of 64 as shown in the example. 
