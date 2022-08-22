# https://www.acmicpc.net/problem/4153
# 백준 4153번 직각삼각형

while True:
    n = list(map(int, input().split()))
    n.sort()
    if sum(n) == 0:
        break 
    elif n[2]**2 == n[0]**2 + n[1]**2:
        print('right')
    else:
        print('wrong')
