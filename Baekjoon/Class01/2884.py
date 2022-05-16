# https://www.acmicpc.net/problem/2884
# 백준 2884번

h, m = map(int, input().split())

if m >= 45:
    print(h, m-45)
elif m < 45 and h > 0:
    print(h-1, m+15)
else:
    print(23, m+15)

# 또는 시간을 분으로 바꿔서 계산
# c=a*60+b-45
#print(c//60%24, c%60)   