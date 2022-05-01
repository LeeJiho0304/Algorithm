# https://www.acmicpc.net/problem/2908
# 백준 2908번 상수

a, b = input().split()
a_list = list(a)
b_list = list(b)
a_list.reverse()
b_list.reverse()
a = int(''.join(a_list))
b = int(''.join(b_list))

print(max(a, b))

# 다른 방법([::-1])
'''
x, y = input().split()
print(max(int(x[::-1]), int(y[::-1])))
'''