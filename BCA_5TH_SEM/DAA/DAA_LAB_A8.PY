def strassen_matrix(a, b):
    m1 = (a[0][0] + a[1][1]) * (b[0][0] + b[1][1])
    m2 = (a[1][0] + a[1][1]) * b[0][0]
    m3 = a[0][0] * (b[0][1] - b[1][1])
    m4 = a[1][1] * (b[1][0] - b[0][0])
    m5 = (a[0][0] + a[0][1]) * b[1][1]
    m6 = (a[1][0] - a[0][0]) * (b[0][0] + b[0][1])
    m7 = (a[0][1] - a[1][1]) * (b[1][0] + b[1][1])

    c = [[0, 0], [0, 0]]
    c[0][0] = m1 + m4 - m5 + m7
    c[0][1] = m3 + m5
    c[1][0] = m2 + m4
    c[1][1] = m1 + m3 - m2 + m6

    return c
def input_matrix():
    matrix = []
    for i in range(2):
        row = []
        for j in range(2):
            element = int(input(f"Enter element at position ({i},{j}): "))
            row.append(element)
        matrix.append(row)
    return matrix

def print_matrix(matrix):
    for row in matrix:
        print(row)
print("Enter the first 2x2 matrix:")
matrix1 = input_matrix()
print("\n First Matrix is:")
print_matrix(matrix1)
print("Enter the second 2x2 matrix:")
matrix2 = input_matrix()
print("\n Second Matrix is:")
print_matrix(matrix2)
result = strassen_matrix(matrix1, matrix2)
print("\nResulting Matrix:")
print_matrix(result)


'''
OUTPUT:

Enter the first 2x2 matrix:
Enter element at position (0,0): 1
Enter element at position (0,1): 2
Enter element at position (1,0): 3
Enter element at position (1,1): 4

 First Matrix is:
[1, 2]
[3, 4]
Enter the second 2x2 matrix:
Enter element at position (0,0): 5
Enter element at position (0,1): 6
Enter element at position (1,0): 7
Enter element at position (1,1): 8

 Second Matrix is:
[5, 6]
[7, 8]

Resulting Matrix:
[19, 22]
[43, 50]


--------------------------------------------------------------------------------------------
Steps for Strassen's Matrix Multiplication

Given two 2x2 matrices:

A = [[A11, A12],
     [A21, A22]] = [[1, 2],
                    [3, 4]]

B = [[B11, B12],
     [B21, B22]] = [[5, 6],
                    [7, 8]]

Step 1: Calculate the 7 Products (M1 to M7)

Using Strassen's formulas, we calculate the following 7 intermediate products:

1. M1 = (A11 + A22)(B11 + B22)
   M1 = (1 + 4)(5 + 8) = 5 * 13 = 65

2. M2 = (A21 + A22)B11
   M2 = (3 + 4) * 5 = 7 * 5 = 35

3. M3 = A11(B12 - B22)
   M3 = 1 * (6 - 8) = 1 * (-2) = -2

4. M4 = A22(B21 - B11)
   M4 = 4 * (7 - 5) = 4 * 2 = 8

5. M5 = (A11 + A12)B22
   M5 = (1 + 2) * 8 = 3 * 8 = 24

6. M6 = (A21 - A11)(B11 + B12)
   M6 = (3 - 1) * (5 + 6) = 2 * 11 = 22

7. M7 = (A12 - A22)(B21 + B22)
   M7 = (2 - 4) * (7 + 8) = (-2) * 15 = -30

Step 2: Compute the Resulting Matrix C

Now, we use the above intermediate products to compute the resulting matrix C using the following formulas:

1. C11 = M1 + M4 - M5 + M7
   C11 = 65 + 8 - 24 - 30 = 19

2. C12 = M3 + M5
   C12 = -2 + 24 = 22

3. C21 = M2 + M4
   C21 = 35 + 8 = 43

4. C22 = M1 + M3 - M2 + M6
   C22 = 65 - 2 - 35 + 22 = 50

Thus, the resulting matrix C is:

C = [[C11, C12],
     [C21, C22]] = [[19, 22],
                    [43, 50]]

Summary of Intermediate Calculations:

M1 = 65
M2 = 35
M3 = -2
M4 = 8
M5 = 24
M6 = 22
M7 = -30

Final Resulting Matrix:

C = [[19, 22],
     [43, 50]]
'''