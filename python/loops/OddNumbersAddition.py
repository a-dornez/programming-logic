'''
"Make a program that reads two int values X and Y, in any order. Then, calculate and display
the sum of the odd numbers between X and Y."
        -- problem by Nelio Alves
'''

numberX = int(input("Please insert an int number X: "))
numberY = int(input("Please insert an int number Y: "))

# ensures variables are in ascending order
if numberX > numberY:
    ensureAscendingOrder = numberX
    numberX = numberY
    numberY = ensureAscendingOrder

oddNumbersSum = 0
for i in range(numberX+1, numberY):
    # checks if value is odd
    if i % 2 != 0:
        oddNumbersSum = oddNumbersSum + i

print(f"\nThe sum of odd values between X and Y is {oddNumbersSum}")
