# Daira Aguilar
# 3/4/2025


import random

randNum = random.randint(0,9)

x = 0
y = 0

print("Guess a number(0-9):")

y = int(input())

if y < 4:
    print("LOSER")
    print("Guess is too low")

elif y > 6:
    print("LOSER")
    print("Guess is too high")
else:
    print("Guess is CORRECT")
    print("WINNER")

for i in range(y):
    print("How much wood can a wood chuck chuck if a woodchuck could chuck wood")
    
while x < 3:
    print("My favorite food is sushi")
    x = x + 1


