# https://www.acmicpc.net/problem/10951
# 백준 10951번 A+B - 4
import sys

for line in sys.stdin:
    print(sum(map(int,line.split())))

# input()으로 하려면
'''
while True:
    try:
        A, B = map(int, input().split())
        print(A+B)
    except EOFError:
        break

'''