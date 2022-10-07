arr = list(map(int, input().split()))
square_list = []

for i in arr:
    square_list.append(i ** 2)

print(sum(square_list)%10)