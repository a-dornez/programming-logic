'''
Asks for a rectangle's width and height, calculates and
exhibits area, perimeter and diagonal values using 4 decimal places.
        -- Problem by Nelio Alves
'''

import math

width = float(input("Enter rectangle's width: "))
length = float(input("Enter rectangle's length: "))

rectangleArea = width * length

rectanglePerimeter = 2 * (width * length)

rectangleDiagonal = math.sqrt(width ** 2 + length ** 2)

print(f"\nRectangle's area is {rectangleArea:.4f}, it's perimeter is {rectanglePerimeter:.4f}"
      f" and it's diagonal is {rectangleDiagonal:.4f}")
