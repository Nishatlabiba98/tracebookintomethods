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
