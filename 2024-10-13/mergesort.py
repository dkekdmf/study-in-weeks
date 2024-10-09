import random
def mergesplit(data):
    if len(data)<=1: 
        return data
    left,right = [],[]
    for index in range(1,len(data)):
        medium = len(data)//2
        left =mergesplit(data[:medium])
        right = mergesplit(data[medium:])
    return merge(left,right)

def merge(left,right):
    lp,rp = 0,0
    merged = list()
    
    while len(left)>lp and len(right)>rp:
       if left[lp]> right[rp]:
           merged.append(right[rp])
           rp+=1
       else:
           merged.append(left[lp])
           lp+=1
    while len(left)>lp:
        merged.append(left[lp])
        lp+=1
    while len(right)>rp:
        merged.append(right[rp])
        rp+=1
    return merged
random1 = random.sample(range(100),10)

print(mergesplit(random1))