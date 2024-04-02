'''
"Do a program that reads 'N' real numbers and stores them in an array. Then:
    -Print all array elements;
    -Print the sum and the average of all elements stored in the array"
        -- problem by nelio Alves
'''

arraySize = int(input("Insert how many numbers will be input: "))

insertedNumbers: [float] = [0 for x in range(arraySize)]

# collects numbers and sums them up
arrayElementsSum = 0
for i in range(0, arraySize):
    insertedNumbers[i] = float(input(f"Insert #{i+1} number: "))

    arrayElementsSum = arrayElementsSum + insertedNumbers[i]

arrayElementsAverage = arrayElementsSum / arraySize

print("\nArray elements: ", end='')
for i in range(0, arraySize):
    print(f" {insertedNumbers[i]:.1f} ", end='')

print(f"\nElements sum: {arrayElementsSum:.2f}")
print(f"Array elements average: {arrayElementsAverage:.2f}")
