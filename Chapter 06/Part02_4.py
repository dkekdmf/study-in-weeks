N, K = map(int,input().split())
lst1 = list(map(int,input().split()))
lst2 = list(map(int,input().split()))

lst1.sort()
lst2.sort(reverse=True)

for i in range(K):
    if lst1[i]<lst2[i]:
        lst1[i],lst2[i] = lst2[i],lst1[2]
    else:
        break
print(sum(lst1))