#1 write a method to generate all the count of even numbers between 2 and 16
def even_count():
    count = 0
    for i in range (2,17):
        if i % 2 == 0 :
            count = count + 1
            return count
#2 write a method to generate the count of odd numbers between 10 and 20
def odd_count():
    cuont = 0
    for i in range(10, 21):
        if i %2 ==1:
            count = count + 1
            return count
        
#3 write a method that generates the sum of odd numbers between 1 and 7 
def odd_sum():
    sum = 0
    for i in range (1, 8):
        if i % 2 == 1:
            sum = sum + i
    return sum
#4 write a method that returns the sum of even numbers between 1 and 20
def even_sum():
    sum = 0
    for i in range(2, 17):
        if i % 2 == 0:
            sum = sum + i 
            return sum
        
#5 write a methods that returns the sum of all multiples of 3 between 1 and 20
def multiples_of_three():
    total = 0
    for i in range (1, 21):
        if i % 3 == 0:
            sum = sum + i 
            return total
        
#6 write a methods that returns the sum of all multiples of 5 between 1 and 20
def multiples_of_fivve():
    total = 0
    for i in range (1, 21):
        if i % 5 == 0:
            total = total + i 
            return total
#7 write a method that returns the count of numbers between 5 and 15 but that are less than 10.
def count_less_than_ten():
    count = 0
    for i in range(5, 16):
        if i < 10:
            count= count + 1
            return count