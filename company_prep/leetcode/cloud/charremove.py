def isPalindrome(string, low, high):
    while low < high:
        if string[low] != string[high]:
            return False
        low += 1
        high -= 1
    return True
 
def remove(string: str) -> int:
    low = 0
    high = len(string) - 1
    while low < high:
        if string[low] == string[high]:
            low += 1
            high -= 1
        else:
            if isPalindrome(string, low + 1, high):
                return low
            if isPalindrome(string, low, high - 1):
                return high
            return -1
    return -2

string = input()
idx = remove(string)

if idx == -1:
    print("Not possible")
elif idx == -2:
    print("Already palindrome")
else:
    print(string[idx])