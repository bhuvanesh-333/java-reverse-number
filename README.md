# Reverse Number in Java

A simple Java program that reverses an integer using arithmetic operations and a `while` loop. This example does not use any built-in string reversal methods and is useful for beginners learning Java basics, loops, and operators.

## Code

package Simple;

public class ReverseNumber {

text
public static void main(String[] args) {
    int num = 1234, rev = 0;

    while (num != 0) {
        rev = rev * 10 + num % 10;
        num = num / 10;
    }

    System.out.println(rev); // 4321
}
}

text

## How it works

- Initialize `num` with the original number and `rev` as `0`.
- In each loop iteration:
  - Take the last digit with `num % 10`.
  - Append it to `rev` using `rev = rev * 10 + lastDigit`.
  - Remove the last digit from `num` using integer division `num = num / 10`.
- Repeat until `num` becomes `0`.
- Print the reversed number.

## How to run

1. Make sure you have Java installed (`java -version`).
2. Save the file as `ReverseNumber.java` inside a folder named `Simple` (because of the `package Simple;` line).
3. Compile the program:

javac Simple/ReverseNumber.java

text

4. Run the program from the folder that contains the `Simple` directory:

java Simple.ReverseNumber

text

You should see:

4321

text
undefined
