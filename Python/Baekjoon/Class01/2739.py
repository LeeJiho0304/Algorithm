# https://www.acmicpc.net/problem/2739
# 백준 2739번

n = int(input())

for i in range(1, 10):
    print('{} * {} = {}'.format(n, i, n*i))