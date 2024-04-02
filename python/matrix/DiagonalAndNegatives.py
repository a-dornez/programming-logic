'''
/*
"Diagonal-Negatives. Make a program that reads an integer number N (max. value == 10)
and creates a square matrix that stores integer values. Then, display the values allocated
in the main diagonal and how many negative values are allocated in the matrix."
        -- Problem by Nelio Alves
'''

usedDimension = int(input("What will be this square matrix used dimension (up to 10)?: "))

matrix: [[int]] = [[0 for x in range(10)] for x in range(10)]

print()

# collects inputs for matrix positions
negativeValuesCounter = 0
for i in range(0, usedDimension):
    for j in range(0, usedDimension):
        matrix[i][j] = int(input(f"Insert int element [{i},{j}]: "))
        # checks if input value is negative
        if matrix[i][j] < 0:
            negativeValuesCounter += 1

print("\nMain diagonal: ")
for i in range(0, usedDimension):
    print(f" {matrix[i][i]} ", end='')

print(f"\nNegative values counter: {negativeValuesCounter}")
