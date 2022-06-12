# hw-10
Functional programming in Java. Lambda. Optional. Stream API

Homework
Exercise 1#
The method takes a list of names as input. Return a string in the form: "1. Ivan, 3. Peter ...", with the names from the list at an odd index (1, 3, etc.).

Task 2#
The method accepts a list of strings as input (you can use a list from Task 1). Returns a list of these strings in upper case and sorted in descending order (Z to A).

Task 3#
Given an array:

["1, 2, 0", "4, 5"]

Get all the numbers from the array, return them in sorted form, separated by a comma, that is

"0, 1, 2, 4, 5"

 

Task 4#
Use Stream.iterate to make an infinite stream of random numbers, 
but don't use Math.random. Implement your "linear congruential generator". 
To do this, start with x[0] = seed and then each next element x[n + 1] = 1 (a x[n] + c) % m, for valid values ​​of a, c, and m. It is necessary to implement a method that takes parameters a, c, m and seed as input and returns a Stream<Long>. For the test, use the data a = 25214903917, c = 11, and m = 2^48 (2 to the power of 48).

Task 5#
Write a public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) 
  method that "shuffles" elements from streams first and second, stopping when one of the streams runs out of elements.
