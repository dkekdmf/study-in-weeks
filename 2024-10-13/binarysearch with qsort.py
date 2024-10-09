import random
def binary_search(data,search):
    if len(data)==1 and search ==data[0]:
        return True
    if len(data) ==1 and search!=data[0]:
        return False
    if len(data)==0:
        return False
    medium = len(data)//2
    if search == data[medium]:
        return True
    else:
        if search > data[medium]:
            return binary_search(data[medium:],search)
        else:
            return binary_search(data[:medium],search)
def qsort(data):
    if len(data) <=1:
        return data
    left = list()
    right = list()
    pivot = data[0]
    for i in range(1,len(data)):
        if pivot>data[i]:
            left.append(data[i])
        if pivot<data[i]:
            right.append(data[i])
    return qsort(left) + [pivot] + qsort(right)

# random1 = random.sample(range(100),10)
data = [77,31,54,22,45,39,44,28]
data_sorted = qsort(data)
print(data_sorted)
print(binary_search(data_sorted,22))

