# https://swexpertacademy.com/main/learn/course/lectureProblemViewer.do
# SWEA 4828번 min max

T = int(input())  # test_case 개수

for test_case in range(1, T+1):
    N = int(input())
    nums = list(map(int, input().split()))

    nums.sort()
    print('#{} {}'.format(test_case, nums[-1]-nums[0]))
