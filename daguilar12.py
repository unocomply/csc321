# Daira Aguilar

def rectangle(base,height):
    area = base * height
    return area

x = int(input("Enter the base of your rectangle: "))
y = int(input("Enter the height of your rectangle: "))

recArea = rectangle(x, y)
print("The area of the rectangle is: ", recArea)

def circle(radius):
    area = 3.14159 * radius * radius
    return area

z = int(input("Enter the radius of the circle: "))

circArea = circle(z)

print("The area of the circle is: ", circArea)

