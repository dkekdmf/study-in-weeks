
max = -10001
point = 0
arr = []
for i in range(9):
    a = int(input())
    arr.append(a)
    if arr[i]>max:
        max = arr[i]
        point = i+1
print(max)
print(point)