# https://www.acmicpc.net/problem/10250
# 백준 10250번 ACM 호텔

import sys

for _ in range(int(sys.stdin.readline())):
    h,w,n = map(int, sys.stdin.readline().split())

    if n%h == 0:
        floor = h
        room = n//h
    else:
        floor = n%h
        room = n//h + 1

    print(floor*100 + room)