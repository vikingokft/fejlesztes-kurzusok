class Main {

public static void main(String[] args) {

printCircleData(4);

}

public static double calculateCircleCircumference(int radius) {

return 2 * 3.14 * radius;

}

public static double calculateCircleArea(int radius) {

return 3.14 * (radius * radius);

}

public static void printCircleData(int radiusFromUser) {

double circumference = calculateCircleCircumference(radiusFromUser);

double area = calculateCircleArea(radiusFromUser);

System.out.println("The circumference of the circle is " +
circumference + " centimeters.");

System.out.println("The area of the circle is " + area + " square
centimeters.");

}

}

# Quiz -- Quiz -- Java Basics III. (Functions)

1.  Which of the following is a correctly named function?

    - DoSomething

    - DO_SOMETHING

    - dosomething

    - **doSomething**

<!-- -->

1.  Which of the following is a correct function declaration?

    - public boolean (pm1, pm2) A {B; return C;} // "pm1" and "pm2"
      are the function's parameters, "A" is the name of the function,
      "B" is the code block, "C" is the return value of the function

    - public static int function A(pm1, pm2) {return B; C;} // "A" is
      the name of the function, "pm1" and "pm2" are the function's
      parameters, "B" is the return value of the function, "C" is
      the code block

    - public String void A(return B) {pm1, pm2; C;} // "A" is the name
      of the function, "B" is the return value of the function,
      "pm1" and "pm2" are the function's parameters, "C" is the
      code block

    - **public static int A(pm1, pm2) {B; return C;} // "A" is the
      name of the function, "pm1" and "pm2" are the function's
      parameters, "B" is the code block, "C" is the return value of
      the function**

2.  How would you invoke the addNumbers function, which adds up two
    numbers and returns the result of the addition?

    - **addNumbers(12, 13);**

    - addNumbers(12; 13);

    - addNumbers (12) (13);

    - addNumbers 12 13;

3.  What's the difference between local variables and any other kind of
    variables?

    - Local variables can be accessed anywhere in the program, while
      other variables can be accessed outside of the program too.

    - A non-local variable can be accessed anywhere in the program,
      while local variables are actually just the values of previously
      declared variables. This local value only exists inside the
      function, and cannot overwrite the real value of the variable.

    - **A local variable can only be accessed in the function where it
      has been declared.**

    - Non-local variables are created inside functions but can be
      accessed from all other functions within the program, while local
      variables are created inside functions, and can only be accessed
      inside those functions.

4.  What is the difference between parameters and arguments?

    - Nothing, they are the same.

    <!-- -->

    - While variables have parameters, functions have arguments.

    <!-- -->

    - **A parameter is a variable created in the function declaration,
      and it has an undefined value. An argument is a parameter's actual
      value defined in the function call.**

    <!-- -->

    - A parameter refers to a property of the function, while an
      argument refers to the number of times we want to execute the
      function.

5.  What result will we get if we invoke the function below?
    ![](media/image2.png){width="6.5in" height="1.2777777777777777in"}

    - **We get only a return value**

    <!-- -->

    - We get only a side effect

    <!-- -->

    - Neither

    - Both

6.  Why should you write a separate function for every subtask within a
    program?

    - This is a programming convention used only in the older versions
      of Java because those couldn't handle complex functions.

    <!-- -->

    - To get a longer and more complex code.

    <!-- -->

    - If the function of a subtask fails, the rest of the subtasks can
      still run without a problem.

    <!-- -->

    - **To make the code more readable. Besides, functions that execute
      only one subtask can be managed more easily when it comes to
      debugging and updating, so it makes maintaining the program
      simpler.**

7.  What will the following function print into the console when we
    invoke it?\
    ![](media/image5.png){width="6.5in" height="2.3194444444444446in"}

    - First statement, then "User Manual", and then Second statement

    <!-- -->

    - **Error: Unreachable code**

    - First statement, then Error: Unreachable code

    - "User Manual"

8.  What will the following code print into the console when invoked in
    the main method?\
    ![](media/image1.png){width="6.5in" height="2.763888888888889in"}

    - London, Singapore, then Budapest

    - Budapest

    - London, then Budapest

    - **London, then Singapore**

9.  What will the following code print into the console when we run it?

> ![](media/image4.png){width="6.5in" height="3.513888888888889in"}

- Small dose: 20

- Main dose: 20, then Small dose: 10

- **Small dose: 10, then Main dose: 20**

- Main dose: 20