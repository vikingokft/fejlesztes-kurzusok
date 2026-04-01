class Main {

public static void main(String[] args) {

int totalBuses = 10;

int workingBuses = 7;

int busCounter = 1;

for (; busCounter <= workingBuses; busCounter++) {

System.out.println("Bus #" + busCounter + " is operational, needs a
driver.");

}

for (; busCounter <= totalBuses; busCounter++) {

System.out.println("Bus #" + busCounter + " is out of service, needs
a repair team.");

}

}

}

# Quiz -- Quiz -- Java Basics IV. (Loops)

1.  What happens if we write the following in our code: while (true)?

    - **The code block within the while loop will become an infinite
      loop that will keep running again and again until we stop our
      program.**

    - The code block of the while loop will run once, and then the
      program will stop.

    - The program will quit with an error, because we didn't set a valid
      condition for the while loop.

    - Since we defined a boolean value in the while loop, it will never
      run.

<!-- -->

1.  What happens if we define a correct conditionin the loop?

    - The JVM runs the code between the parentheses.

    - The JVM runs the code between the curly braces, and then stops.

    - **First, the JVM checks if our condition is true or not, then it
      runs the code block within the curly braces. It will repeat this
      process as long as the statement between the parentheses stays
      true.**

    - The JVM will run the code between the curly braces forever.

2.  What would you write in the place of the x variable so that the code
    between the curly braces never runs? Select all the correct answers.

> ![](media/image1.png){width="6.5in" height="4.416666666666667in"}

- 4

- **2**

- 2 * 2

- **1**

3.  We have a while loop with a variable called counter. What should we
    write in the last line of the code block within the curly braces if
    we want to increase the value of the counter variable by one at each
    iteration? Select all the correct answers.

    - counter + 1;

    - **counter = counter + 1;**

    - counter = counter + counter;

    - **counter++;**

4.  What will the following while loop print into our console?

> ![](media/image3.png){width="6.5in" height="3.0972222222222223in"}

- The Dalmatians 0 through 100.

- **The Dalmatians 1 through 101.**

- The Dalmatians 1 through 100.

- The Dalmatians 0 through 101.

5.  Which of the following is a correctly written loop?

    - for (condition; declaring the counter) { the code that runs;
      increasing the counter; }

    - **for (declaring the counter; condition; increasing the counter) {
      the code that runs; }**

    - for (declaring the counter; increasing the counter; condition) {
      the code that runs; }

    - for (condition; declaring the counter; increasing the counter) {
      the code that runs; }

6.  How many times does the for loop run the initialization code (the
    part defining the name and value of the counter)?

    - It will run the code every time.

    - It won't run the code.

    - **It will run the code once, before the first iteration.**

    - It will only run the code if the loop statement is true.

7.  How can we make our loop future-proof?

    - If we use a for loop instead of a while loop.

    - If we use a while loop instead of a for loop.

    - **If we use variables instead of actual numbers in the loop.**

    - If we use a variable for the counter of the loop instead of an
      actual number.

8.  How would the loop controlling parameters look for a loop that
    counts back from 10 to 1? Select all the correct answers.

    - **for (int i = 10; i >= 1; i--)**

    - for (int i = 10; i > 1; i--)

    - **for (int i = 10; i > 0; i--)**

    - for (int i = 10; i >= 0; i--)

9.  What will the loop below print into the console?

> ![](media/image2.png){width="6.5in" height="3.138888888888889in"}

- Every number from 2 to 10.

- **Every even number from 2 to 10.**

- Every odd number from 2 to 10.

- It will return an error message because the incrementation of the
  counter is incorrect.