# CS5800 Quiz 2 - Test Driven Development

This project implements two Java programs using JUnit 5 and Test Driven Development.

## Calculator

The Calculator supports:

- sum
- subtract
- multiply
- divide
- isEven

The unit tests include positive, negative, zero, divide-by-zero, even, and odd cases.

## DateChecker

DateChecker determines whether a month has 31 days.

The tests include:

- Months with 31 days
- Months without 31 days
- February
- Null input
- Parameterized testing using EnumSource

## Running the Tests

Run:

`mvn test`

All tests should pass successfully.

## TDD Reflection

For this quiz, I developed the program using the Red-Green-Refactor process. I first wrote tests for small behaviors and ran them before adding the implementation. After confirming the test failed, I added only enough code to make it pass. I repeated this process for the Calculator and DateChecker behaviors. 