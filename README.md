# SumOfInput

`fork` this repository and `clone` it to your local machine.

# Sum the Numbers

## **Objective:**

* Write a program which prompts the user to input a number, `n`.
* The program should respond by printing the sum of the numbers 1 to `n`.
* **Constraint:** No [Guassian wizardry](https://letstalkscience.ca/educational-resources/backgrounders/gauss-summation) !

### Extra Credit (no, not really)

_If you find this lab to be super simple, then implment these two requirements._ If you're quite lost, skip them for now.

* *Extra Credit* (get 256 pts) create a second method which USES the Gaussian Wizardry
* **Extra EXTRA Credit** (32,767 pts) create a comparison of the two methods And *time them, showing which one is faster!!!*

### **Purpose:**
* To establish familiarity with
    * Loops
    * User input
    * Object instantation/declaration
    * Method invokation

### Instructions

First, `cd src/main/java` to get to the correct directory.
Use `nano` to create a new Java file named `SumOfInput.java`.

1. Create a new Java class named `SumOfInput`. (You can use the `javac` and `java` commands to compile and run your program.)
2. Inside the `main` method of the `SumOfInput` class, create a new `Scanner` object to read user input.
3. Prompt the user to enter a number, `n`, and read the input using the `Scanner` object.
4. Create a new `sumNumbers()` method (hey, go find the one in JavaSmall) and pass the user input to the method.
5. Inside the `sumNumbers()` method, use a loop to calculate the sum of the numbers from 1 to `n`. (If you didn't type it in from JavaSmall)
6. Print the sum of the numbers to the console.

Now, how do we run this java program?

```bash
javac SumOfInput.java
java SumOfInput
```

Did it give you the right answer? If not, go back and fix it.
(How do you know if it's right? Well, you can do the math yourself, or you can use the Gaussian Wizardry.)
We do know that the sum of the numbers from 1 to 3 is 6. So, if you input 3, you should get 6.
Now, pick some bigger numbers and see if you get the right answer. What happens if you put in 199872?
(Let's put a pin in that for now. I mean, of course, how did that sum end up being a negative number?)

Oakay, now, if you're feeling froggy, go ahead and do the Extra Credit.
But before you do that save all this work to your GitHub repository.

```bash
git add .
git commit -m "Add SumOfInput work"
git push
```

NOW do the Extra Credit.


### **Resources:**

This is a pretty advanced topic for this lab. Welcome to Zip Code.

#### timing loops

To time two different Java loops, you can use the `System.currentTimeMillis()` method to get the current time in milliseconds before and after each loop, and then calculate the difference between the two times to get the elapsed time.

Here is an example of how to time two different Java loops:

```java
public class LoopTimingExample {
    public static void main(String[] args) {
        long startTime, endTime, elapsedTime;

        // Loop 1
        String foo = "!";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            // do something
            foo = "foo" + foo + "bar";
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Loop 1 elapsed time: " + elapsedTime + " ms");

        // Loop 2
        String bar = "^";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            // do something else
            bar = bar + "bar ";
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Loop 2 elapsed time: " + elapsedTime + " ms");
    }
}
```
In this example, two loops are timed using the System.currentTimeMillis() method. The elapsed time for each loop is calculated by subtracting the start time from the end time, and the result is output to the console.

Timing Java loops can be useful for measuring the performance of different algorithms or code optimizations.

## Unit Test
No Unit Tests (well, not yet).

## What's a millisecond?

A millisecond is a unit of time that is equal to one thousandth of a second. It is commonly used in computer programming to measure the duration of operations or to time events. For example, a program might measure the time it takes to perform a calculation in milliseconds, or it might use a delay of a certain number of milliseconds to control the timing of events. In general, a millisecond is a very short amount of time, but it can be significant in certain contexts, such as real-time systems or high-performance computing.
