n = int(input())
spaces = 0

for k in range(1, n+1):
    for i in range(1, n+1):
        print(" " * spaces, end="")
        for j in range(1, i+1):
            print("*", end="")
        print()
    spaces = spaces + n
    