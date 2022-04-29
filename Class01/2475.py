# https://www.acmicpc.net/problem/2475
# 백준 2475번

arr = [x**2 for x in map(int,input().split())]

print(sum(arr)%10)