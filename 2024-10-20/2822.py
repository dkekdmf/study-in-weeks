score = []
for i in range(8):
    score.append(int(input()))
temp = []
answer = 0
for i in range(5):
    answer += max(score)
    # print(score.index(max(score)) + 1)
    temp.append(score.index(max(score)) + 1)
print(temp)
    
    # score[score.index(max(score))] = -1
print(answer)
# temp.sort()
# print(answer)
# print(*temp)
