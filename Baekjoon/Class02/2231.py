# https://www.acmicpc.net/problem/2231
# 백준 2231번 분해합

# 생성자가 x자리 숫자라고 가정할 때, 
# 생성자에 더해질 수 있는 자리수의 합은 9 * x가 최대일 것
# 왜냐하면 각 자리수에 올 수 있는 값은 0 ~ 9 의 값 뿐
N = input()
target = int(N)
min_num = max(1, target - 9*(len(N)))
for i in range(min_num, target):
    result = i + sum(map(int, str(i)))
    if result == target:
        print(i)
        break
else:
    print(0)

# 통과는 되지만 시간이 오래걸림.
# 30840 KB,	2896 ms
'''
N = int(input())
for i in range(1, N):
    A = list(map(int, str(i)))
    print('i: {}, A: {}'.format(i, A))
    result = i + sum(A)
    print('result: ', result)
    if result == N:
        print(i)
        break
else : print(0)
'''
# map없이 str()[]로도 가능함
'''
n = int(input())
cnt = 0
for m in range(1, n):
    result = 0
    for k in range(len(str(m))):
        result += int(str(m)[k])
    if result + m == n:
        print(m)
        cnt = 1
        break
if cnt == 0:
    print(0)
'''

