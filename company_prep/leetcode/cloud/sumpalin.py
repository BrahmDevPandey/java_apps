x, y = [int(x) for x in input().split()]
sum = 0
for i in range (x, y+1):
    mystr = str(i)
    if mystr == mystr[::-1]:
        sum = sum + i
print(sum)