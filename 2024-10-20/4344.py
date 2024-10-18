C = int(input())

ans = 0
for index in range(C):
    cnt = 0
    lst = list(map(int,input().split()))
    avg = sum(lst[1:])/lst[0]
    for j in range(1,lst[0]+1):
        if avg<lst[j]:
            cnt+=1
        ans = cnt/lst[0] * 100
    print('%.3f' %ans+'%')