# Exercises

1. Write a function that takes in a list of integers as an argument
and returns true if it contains two integers that are the same, false
otherwise.

In java, I used a local variable set to the first value in the array in a loop. Nested in this loop, I
iterated over the array and checked if the current index value matched the local variable. If it did, then
there must be a duplicate. 

In python, I used a set of seen_numbers and iterated over the list and checked if the current num is in
the set of seen_numbers and return true if there is a duplicate. Else, I would add the number to the set.

