Lab 10
======

1. (Increasing array size) Once an array is created, its size is fixed. 
Occasionally, you need to add more values to an array, but it is full. 
In such cases, you can create a new, larger array to replace the existing 
array. Write a method with the following header:

public static int[] doubleCapacity(int[] list)

The method returns a new array that doubles the size of the parameter list.

Note: copy all the elements from the old array into the new array (first half 
of the elements). For example the old array is: {1,2}, while the new array 
is: {1,2,0,0}

2. (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The 
bubble-sort algorithm makes several passes through the array. On each pass, 
successive neighboring pairs are compared. If a pair is in decreasing order, 
its values are swapped; otherwise, the values remain unchanged. The technique 
is called a bubble sort or sinking sort because the smaller values gradually 
“bubble” their way to the top and the larger values sink to the bottom. The 
algorithm can be described as follows:

boolean changed = true;

do {

changed = false;

for (int j = 0; j < list.length - 1; j++)

if (list[j] > list[j + 1]) {

- swap list[j] with list[j + 1];

changed = true;

}

} while (changed);

Clearly, the list is in increasing order when the loop terminates. It is easy 
to show that the do loop executes at most list.length –1 times. 
Use {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5} to test the method.
