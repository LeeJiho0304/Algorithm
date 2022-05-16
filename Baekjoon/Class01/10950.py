# https://www.acmicpc.net/problem/10950
# 백준 10950번 A+B - 3

# 그냥 input()으로 받으면 런타임 에러 발생하므로 sys.stdin.readline() 필요
import sys

for _ in range(int(sys.stdin.readline())):
    print(sum(map(int, sys.stdin.readline().rstrip().split())))