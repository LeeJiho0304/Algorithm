# acmicpc.net/problem/8958
# 백준 8958번 OX퀴즈

import sys
for _ in range(int(sys.stdin.readline())):
    s = sys.stdin.readline()
    score = 0
    sum = 0
    for i in range(len(s)):
        if s[i] == 'O':
            score += 1
            sum += score
        else:
            score = 0
    print(sum)
