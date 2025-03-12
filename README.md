# JAVA-PROGRAM-TASK-4-2D-ARRAY-
1.	Print a 2D Array:
Write a Java program to print all elements of a given 2D array.

This Java program prints a 2D array in a matrix format using a nested for-loop. It starts by declaring and initializing a 3×3 matrix named arr, where each row contains an array of integers. The program then uses a nested for-loop to iterate through the array. The outer loop runs through each row of the array, while the inner loop iterates through each element within the row. Each element is printed using System.out.print(), ensuring that elements in the same row appear on the same line. After each row is printed, System.out.println() moves the cursor to a new line, maintaining the matrix format. 

2.	Sum of Elements:
Write a Java program to calculate the sum of all elements in a 2D array.

This Java program calculates the sum of all elements in a 2D array using a nested enhanced for-loop. It begins by declaring and initializing a 3×3 matrix named arr, containing integers arranged in rows and columns. A variable sum is initialized to 0 to store the cumulative sum of the elements. The program then uses an outer enhanced for-loop to iterate through each row of the array, treating each row as a 1D array. Within this loop, an inner enhanced for-loop iterates through each element (num) in the row, adding its value to sum. Once all elements have been processed, the final sum is printed using System.out.println(). The output of the program is "Sum of all elements: 45", as the total of all elements in the array is 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45. This approach effectively demonstrates how to traverse and manipulate 2D arrays using nested loops in Java.

3.Find Maximum and Minimum:
Write a Java program to find the largest and smallest elements in a 2D array.

This Java program finds the maximum and minimum values in a 2D array using a nested enhanced for-loop. It starts with declaring and initializing a 3×3 matrix, where each row contains an array of integers. Then initializes two variables, max and min, both set to the first element of the array (arr[0][0]). Using a nested enhanced for-loop, the program iterates through each element of the array. If an element is greater than max, it is max; if an element is smaller than min, it is min. After checking all elements, the program prints the highest (max = 9) and lowest (min = 1) values. 
The output is:
Maximum: 9  Minimum: 1 


4.Row-wise and Column-wise Sum:

Write a Java program to find the sum of each row and each column in a 2D array.

 starts  with declaring and initializing a 3×3 matrix, integer numbers are arranged in rows and columns. The program first computes the row-wise sum by iterating through each row using a loop. Inside this loop, another loop adds up  all elements of the current row, and the result is printed. After calculating all rows, the program calculates the column-wise sum by iterating through each column. Another nested loop sums up all elements in the current column and prints the result.
The output is:
Sum of row 0: 6  
Sum of row 1: 15  
Sum of row 2: 24  
Sum of column 0: 12  
Sum of column 1: 15  
Sum of column 2: 18  

5.Transpose of a Matrix:

Write a Java program to find the transpose of a matrix (rows become columns and vice versa).


This Java program calculates and prints the transpose of a 2D matrix. The transpose of a matrix is obtained by swapping its rows and columns, meaning the element at position (i, j) in the original matrix becomes (j, i) in the transposed matrix.
The program starts with declaring and initializing a 3×3 matrix. It then determines the number of rows and columns of the original matrix and creates a new transpose matrix with (cols × rows). Using nested loops, the program iterates through each element of the original matrix and assigns it to the corresponding position in the transpose matrix (transpose[j][i] = matrix[i][j]).
After doing the transpose, another nested loop is used to print the transposed matrix.
The output is:
Transpose of the matrix:  1  4  7  2  5  8  3  6  9  

6. Matrix Addition:

Write a Java program to add two matrices and store the result in another 2D array.


This Java program performs the addition of two 3x3 matrices. First it initializes two matrices
and determines their dimensions. Using nested loops, it iterates through each element and adds values
from the same positions in both matrices and stores them in result.
The output of the program is :
10 10 10
10 10 10
10 10 10

7.Matrix Multiplication:

Write a Java program to multiply two matrices and store the result in another 2D array.

This Java program performs matrix multiplication and prints the result. It initializes two 3x3 matrices. We have to check if they can be multiplied. If the number of columns in matrix1 matches the number of rows in matrix2 then they are compatible. Using three nested loops, the program multiplies the elements and sums them to find the result matrix.
The output of the program is :
30    24   18
84    69   54
138  114   90

8.Search an Element in 2D Array:

Write a Java program to search for a given number in a 2D array and print its position.

 This Java program searches for a user input in a 2D array and prints its position if found. It first initializes a 3x3 matrix and takes an integer input from the user. Using nested loops, it scans through the array and if the number is found it prints its position. If the number is not present it displays a message indicating that. 
The output is : (1,1)

13. Check Identity Matrix:
Write a Java program to check if a matrix is an identity matrix (diagonal elements are 1, and all others are 0).

An identity matrix is a square matrix where all the diagonal elements are 1, and all others are 0. This Java program checks whether a given matrix is an identity matrix. Using nested loop it goes through all the elements. For each element it checks if the element is on the diagonal, then it must be 1.
Otherwise the element must be 0. After the check, it prints whether the matrix is an identity matrix or not. 
The output is : the matrix is an identity matrix.

15. Zigzag Traversal:
Write a Java program to traverse a 2D array in a zigzag pattern.

This Java program prints a 2D matrix in a zigzag pattern, it reads the first row left to right, the second row right to left, and continues alternating. It starts with a 4×4 matrix, then loops through each row. If the row read normally, it should prints from left to right; otherwise, it prints from right to left. After each row, the direction switches. 
The output will be:
1 2 3 4  
8 7 6 5  
9 10 11 12  
16 15 14 13  

