class Main {

public static void main(String[] args) {

int allTurbines = 25;

int turbineCounter = 0;

int turbinePower = 0;

int sumPower = 0;

for (int i = 0; i < allTurbines; i++) {

if (i < 10) {

turbineCounter++;

turbinePower = 2000;

sumPower += turbinePower;

System.out.println("Turbine number " + turbineCounter + " is
operating at full speed, generating " + turbinePower + " MWh. The
total energy generated at the farm is " + sumPower + " MWh at the
moment.");

} else if (i < 20) {

turbineCounter++;

turbinePower = 1000;

sumPower += turbinePower;

System.out.println("Turbine number " + turbineCounter + " is
operating at half speed, generating " + turbinePower + " MWh. The
total energy generated at the farm is " + sumPower + " MWh at the
moment.");

} else if (i < 25) {

turbineCounter++;

turbinePower = 0;

sumPower += turbinePower;

System.out.println("Turbine number " + turbineCounter + " is not
operational, generating " + turbinePower + " MWh. The total energy
generated at the farm is " + sumPower + " MWh at the moment.");

} else {

System.out.println("Something unexpected happened.");

}

}

}

}

# Quiz -- Quiz -- Java Basics V. (Conditionals)

1.  What will the following code snippet print into the console when we
    run it?

> ![](media/image4.png){width="6.5in" height="3.9305555555555554in"}

- Doesn't equal

- Mambo No. 5

- **It prints an error message.**

- First, it will print Mambo No. 5, then it says Doesn't equal

1.  How many else if statements can we write into an if / else
    statement?

    - One.

    - **As many as we want.**

    - There is no need for else if statements since we can write every
      program with a single if / else statement.

    - Two.

2.  What value do we need to assign to the number variable to make the
    code block of the if branch run?

> ![](media/image1.png){width="6.5in" height="3.1805555555555554in"}

- 1

- **5**

- No matter what value we assign to the number variable, it is always
  the else branch that will run.

- 0

3.  Which of the following statements can be used as if conditionals
    without causing errors? Select all correct answers

    - **"Budapest".equals("Budapest")**

    - i = i +1

    - **(100 / 2) % 2 == 0**

    - "123" == 123

4.  Which loop can you combine conditionals with?

    - The for loop.

    - The while loop.

    - **We can combine conditionals with both.**

    - We shouldn't combine them since that goes against the principle of
      writing DRY code.

5.  We have a loop that prints numbers from one to hundred into the
    console. What conditional do we need to add to it if we want the
    console to print only the even numbers?

    - i % 2 != 0

    - i / 2 = 0

    - **i % 2 == 0**

    - i / 2 ==0

6.  What numbers will the following loop print into the console?

> ![](media/image2.png){width="6.5in" height="4.111111111111111in"}

- The double of each number from one to fifty.

- **The double of each number that is divisible by five.**

- All numbers that are divisible by five from one to fifty.

- All numbers that are divisible by five and are less than fifty when
  doubled.

7.  What value will the wallet variable take after the loop runs?

> ![](media/image5.png){width="6.5in" height="5.708333333333333in"}

- 109

- 60

- **0**

- 108

8.  When will the following code print the code block of the else
    branch?

> ![](media/image3.png){width="6.5in" height="3.986111111111111in"}

- If the value of the gasAmount variable becomes 10.

- If the loop counter gets to 30.

- The code will never print the code block of the else branch.

- **If the value of the gasAmount variable becomes 9.**

9.  Why did we combine loops and conditionals during the lessons? Select
    all correct answers.

    - **Because we could solve many tasks with them that would otherwise
      need many lines of code. It also helped us keep our code DRY.**

    - **One of the basic tools of DRY code is the combination of loops
      and conditionals, which makes our code easier to read and
      clearer.**

    - Since we wrote fewer lines of code, the JVM could read it faster.

    - Since every program can be written by the combination of loops and
      conditionals.