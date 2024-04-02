'''
"Read an undetermined amount of int values X and Y. Print for each pair
wether they were inserted in ascending or descending order. If the values
are equal, terminate execution."
        -- Problem by Nelio Alves
'''

while first != second:
    first = int(input("Enter an integer value X: "))
    second = int(input("Enter an integer value Y: "))

    if first < second:
        print("\nX and Y are in ascending order")
    elif second < first:
        print("\nX and Y are in descending order")
    else:
        print("\nX and Y are equal values. Terminating execution")
