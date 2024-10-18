N = int(input())

lst1 = list(map(int,input().split()))
arr =[]
M = max(lst1)
avg = 0
for i in lst1:
    i = i/M*100   
    arr.append(i)
    
print(sum(arr)/len(lst1))