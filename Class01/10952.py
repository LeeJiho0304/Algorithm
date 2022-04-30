# https://www.acmicpc.net/problem/10952
# 백준 10952번 A+B - 5

import sys

while True:
    A, B = map(int, sys.stdin.readline().split())
    if A == 0 and B == 0:
        break
    else:
        print(A + B)

# 다른 풀이 (for문)
'''
import sys
for k in sys.stdin:
    a, b = map(int,k.split())
    if a != 0 and b != 0:
        print(a+b) 
'''
# 다른 풀이 (input)
'''
while True:
    A,B=map(int,input().split())
    if A+B == 0:
        break 
    else:
        print(A+B)
'''