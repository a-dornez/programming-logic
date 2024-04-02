'''
"Write a program that reads two people name and age. Then print a message showing these people's name
and the average age between them using a single decimal place."
        -- Problem by Nelio Alves
 '''

print("Insert the first person data:")
firstPersonName = input("Name: ")
firstPersonAge = int(input("Age: "))

print("Insert the second person data:")
secondPersonName = input("Name: ")
secondPersonAge = int(input("Age: "))

agesAverage = (firstPersonAge + secondPersonAge) / 2

print(f"\nThe average age between {firstPersonName} and {secondPersonName} is {agesAverage:.2f}")
