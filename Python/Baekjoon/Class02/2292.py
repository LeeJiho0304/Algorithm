# https://www.acmicpc.net/problem/2292
# 백준 2292번 벌집

n = int(input())

num = 2
room = 0

if n == 1:
    print(1)
    room = 1
else:
    while(n >= num):
        num = num + 6*room
        room += 1
    print(room)