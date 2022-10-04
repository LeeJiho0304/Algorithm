n = int(input())
arr = list(map(int, input().split()))

arr.sort()
M = arr[-1]

sum = 0
for i in arr:
    sum += i

a = sum/n

print(a/M*100)