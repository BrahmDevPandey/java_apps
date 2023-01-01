def printList(lst, m, n):
    for i in range(0, m):
        for j in range(0, n):
            print(lst[i][j], end=" ")
        print()

# main
m = int(input())
n = int(input())
start = int(input())
startNum = int(input())

total = (2 * (m + n-2)) + startNum
size = len(str(total))
# creating the matrix
lst = [[" "*size for _ in range(n)] for _ in range(m)]

i = 0
j = start if start < n else 0
iFactor = 0
jFactor = 1

for num in range(startNum, total):
    data = str(num)
    lst[i][j] = str(" "*(size - len(data))) + data
    if i == m-1 and j == n-1:
        iFactor = 0
        jFactor = -1
    elif i == 0 and j == n-1:
        iFactor = 1
        jFactor = 0
    elif i == m-1 and j == 0:
        iFactor = -1
        jFactor = 0
    elif i == 0 and j == 0:
        iFactor = 0
        jFactor = 1
    i = i+iFactor
    j = j+jFactor

printList(lst, m, n)