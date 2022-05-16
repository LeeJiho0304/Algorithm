# https://www.acmicpc.net/problem/3052
# 백준 3052번 나머지

remainder = [int(input())%42 for _ in range(10)]

print(len(set(remainder)))