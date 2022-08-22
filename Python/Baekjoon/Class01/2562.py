# https://www.acmicpc.net/problem/2562
# 백준 2562번 최댓값

arr = [int(input()) for i in range(9)]

print(max(arr))
print(arr.index(max(arr)) + 1)