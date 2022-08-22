# https://www.acmicpc.net/problem/2675
# 백준 2675번 문자열 반복

for i in range(int(input())):
    r, s = input().split()
    for j in s:
        print(j * int(r), end='')
    print()

'''
import sys

for _ in range(int(sys.stdin.readline())):
    r, s = sys.stdin.readline().rstrip().split()
    for i in range(len(s)):
        print(s[i] * int(r), end='')
    print()
'''