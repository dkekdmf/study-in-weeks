import random
def ispalindrome(string):
    if len(string)<=1:
        return True
    if string[0] == string[-1]:
        return ispalindrome(string[1:-1])
    else:
        return False

data = "level"
print(ispalindrome(data))

def multiple(data):
    mul = 1
    for i in range(1,data+1):
        mul = mul*i
    return mul
print(multiple(10))
def mul_recursion(data):
    if data ==1:
        return data
    return data *mul_recursion(data-1)

print(mul_recursion(10))
data1 = random.sample(range(100),10)
print(data1)
def sum_list(data):
    if len(data) ==1:
        return data[0]
    return data[0] + sum_list(data[1:])
    

print(sum_list(data1))

def function(n):
    print(n)
    if n ==1:
        return n
    elif n%2 ==1:
        return function((3*n)+1)
    elif n%2 ==0:
        return function(n//2)

function(3)