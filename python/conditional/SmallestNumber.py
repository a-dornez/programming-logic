'''
"Make a program that receives 3 integer values as inputs and then
prints which is the smallest number."
        -- Problem by Nelio Alves
'''

first = int(input("Insert the first number: "))
second = int(input("Insert the second number: "))
third = int(input("Insert the third number: "))

if first < second and first < third:
    smallestNumber = first
elif second < third:
    smallestNumber = second
else:
    smallestNumber = third

print(f"\nSmallest number: {smallestNumber}")
