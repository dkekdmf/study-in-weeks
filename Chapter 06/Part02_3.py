N = int(input())
arr = []
for i in range(N):
    input1 = input().split()
    arr.append((input1[0],int(input1[1])))
print(arr)
arr = sorted(arr, key = lambda stu: stu[1])

for stu in arr:
    print(stu[0],end= ' ')