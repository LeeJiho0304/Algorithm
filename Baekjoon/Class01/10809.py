# https://www.acmicpc.net/problem/10809
# 백준 10809번 알파벳 찾기

s = input()
alphabet = list(range(97,123)) # 아스키코드 a~z까지

for i in alphabet:
    print((s.find(chr(i))), end=" ")