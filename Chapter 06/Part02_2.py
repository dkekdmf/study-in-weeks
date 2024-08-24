N = int(input())
arr = []
for i in range(N):
    a = int(input())
    arr.append(a)

# for i in range(len(arr)):
#     min_index = i
#     for j in range(i+1,len(arr)):
#         if arr[min_index] > arr[j]:
#             min_index = j
#     arr[i],arr[min_index] = arr[min_index],arr[i]

arr = sorted(arr,reverse=True)

for i in arr:
    print(i,end = ' ')