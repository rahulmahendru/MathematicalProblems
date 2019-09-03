Fascinating Number

Some numbers of 3 digits or more exhibit a very interesting property. 
The property is such that, when the number is multiplied by 2 and 3, and 
both these products are concatenated with the original number, all digits from 
1 to 9 are present exactly once, regardless of the number of zeroes.

Let’s understand the concept of Fascinating Number through the following example:
Consider the number 192,
192 x 1 = 192
192 x 2 = 384
192 x 3 = 576
Concatenating the results : 192384576

It could be observed that ‘192384576’ consists of all digits from 1 to 9 exactly once. 
Hence, it could be concluded that 192 is a Fascinating Number.
Some examples of fascinating Numbers are : 192, 219, 273, 327, 1902, 1920, 2019 etc.

Functions:

1. boolean isUnique(String q): Accepts a string version of the inputted number and checks if the digits in the number
are unique or not

2. String concatenate(int n): Accepts the user inputted integer and concatenates it with it's multiples of 2 and 3
