# Calculator
Calculator Project

The program reads numbers and operations from the console and executes those operations on the numbers. 
The numbers are positive integers, while the operations can be single symbols (e.g. the star symbol '*' means multiplication), or strings of characters 
(e.g. the operation "=" stops the program and prints out the result).
Operations are executed immediately after they receive all their needed operands. For example, the expression 3 * 4 / 2 will first store 3, 
then see the multiplication and wait for a number to multiply – when it receives 4 it will calculate 3 * 4 = 12, 
then see the division and wait for a number to divide by – when it receives 2, it will divide 12 by 2.
Any number input overwrites the current result of the calculator, just like in normal calculators. 
For example, if the expression 3 1 * 4 16 / 2 is input, we’d first have 3, overwrite it with 1, multiply by 4 and get 4, 
but then we overwrite with 16 and divide that by 2 – the result will be 8.
It contains the following files:
    • Main.java– contains the main(String[] args) method, reads input and prints output on the console
    • Operation.java – contains a base class for any operation done by the calculator
    • MultiplicationOperation.java – defines a class which inherits the base Operation class and implements the multiplication operation (*)
    • CalculationEngine.java – defines the calculator’s central logic of handling number and operations input
    • InputInterpreter.java – defines a class which can interpret a string into either a number or an operation and invoke the engine accordingly
      The files you are given support all logic necessary to implement the multiplication operation, 
      as well as console input and output (note that input items don’t need to be on the same line – you can write 1 operation or number per line and the code will still work) .
We have the following operations:
    • Multiplication, division, sum up, substract
    • ms – saves the current result of the calculator to "memory". The result of this operation is the current result of the calculator. 
    For example, the expression 3 * 4 ms * 5 and the expression 3 * 4 * 5 are equivalent in their result
    • mr – memory recall, removes the last item from memory, and sends it to the calculator. Note that this operation can be used in combination with other operations, 
    for example the expression 3 ms * 4 ms * 5 * mr * mr will save 3 to memory, calculate to 12, save to memory, calculate 60, multiply that by 12 from memory, 
    resulting in 720, then multiply that by 3 from memory, resulting in 2160. It can also be used without operations –  3 ms 4 mr is the same as 3 4 3
Input:  The program defined in Main.java reads the following input:
      Strings, representing numbers or operations, separated by spaces (or new lines, or any "blank" space), ending with the "=".
Output: The program defined in Main.java writes the following output: The calculated result of all the numbers and operations from the input.
Restrictions: The numbers in the input will always be positive integers and no operation will result in a number larger than 1 billion.
There will always be at least 1 ms operation before any mr operation. There will be no more mr operations than the preceding ms operations. 
There will be no ms operation following an operation expecting a value (e.g. 3 * ms 4 is not a valid input, but 3 ms * 4 is). 
There will never be an invalid series of operations (e.g. 3 / / 4, or 3 * * 4, etc.). 
//TODO Still the SumUp and Substraction operations work with their operands at the end or only with them. To implement logic with more complex commands such as  20-10/5+4. 
To continue with braces.

Examples
Input   1 * 2 * 3 ms * 4 * mr / 2 =
Output 72
Input  12 / 3 ms / 2 ms * 5 mr * mr =
Output  8
