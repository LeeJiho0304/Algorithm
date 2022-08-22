# https://swexpertacademy.com/main/learn/course/lectureProblemViewer.do
# SWEA 4831번 전기버스

s = '110001001'
zero_cnt = 0
cnt = 0

while(True):
    if s == '1':
        break
    else:
        zero_cnt += s.count('0')
        s = s.replace('0', '')
        print(s)
        s = bin(int(s))[2:]
        print(s)
        cnt += 1

print(cnt, zero_cnt)
