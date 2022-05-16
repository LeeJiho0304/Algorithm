# https://www.acmicpc.net/problem/2577
# 백준 2577번 숫자의 개수

a, b, c = [int(input()) for _ in range(3)]

total = list(map(int, (str(a * b * c))))

for i in range(10):
    print(total.count(i))
