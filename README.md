# Java-SortManager
This is my Sorter Project, This code allows random generation of numbers or user input to be put through 3 different sorting algorithms.

This Java project was made using Intellij

This project has used recusions, different loops, subclasses, interfaces, generics, custom exceptions, factorys.
This project was designed using Test Driven Development

Performance test results:

Average time to binaryAscSort 100 : 7,805ns
Average time to binaryAscSort 1000 : 19,795ns
Average time to binaryAscSort 10000 : 133,625ns

Average time to bubbleSort 100 : 25,960ns
Average time to bubbleSort 1000 : 858,355ns
Average time to bubbleSort 10000 : 96,249,095ns

Average time to genericBubbleSort 100 : 64,020ns
Average time to genericBubbleSort 1000 : 4,344,610ns
Average time to genericBubbleSort 10000 : 437,618,525ns

Average time to mergeSort 100 : 14,430ns
Average time to mergeSort 1000 : 125,660ns
Average time to mergeSort 10000 : 1,359,110ns


How to use: 

When running the program respond true or false to get a random generated array - these contain no duplicates due to binary tree not accepting them.
Enter how many elements you want in this array.
If you selected true it will now generate an array and then list options to select.
If you entered false you now have to enter a number for each element in the arraysize you want then list of a new set of options

Press 1 for bubbleSort, Press 2 for MergeSort, Press 3 for Generic BubbleSort, Press 4 for Binary Tree

Selecting 1,2 or 3 will return the sorted array and then exit, however pressing 4 will give more options.

These options will let you sort the array, ascending or descending, add values, list how many items there are, find the root value and find if a number is in the binary tree or quit the program.


