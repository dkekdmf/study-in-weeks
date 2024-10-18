n,m = map(int,input().split())
max1 = max(n,m)
min1 = min(n,m)
ans = max1-min1-1
if max1==min1 or min1+1 == max1:
    ans = 0
print(ans)
for i in range(min1+1,max1):
    print(i,end = ' ')