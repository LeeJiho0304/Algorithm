# https://www.acmicpc.net/problem/2920
# 백준 2920번 음계

n = list(map(int, input().split()))
asc = [1, 2, 3, 4, 5, 6, 7, 8]
des = [8, 7, 6, 5, 4, 3, 2, 1]

if n == asc:
    print('ascending')
elif n == des:
    print('descending')
else:
    print('mixed')

# 다른방법 (슬라이싱)
'''
a = input()[2::2] #2번째 인덱스부터 2씩 뛰어서 끝까지
print({a:'mixed','2345678':'ascending','7654321':'descending'}[a])
'''