a = [8, 17, 5, 18, 5, 9, 1, 2, 5, 4]

# count eve
even_num = 0
for i in a:
    if i % 2 == 0:
        even_num += 1
print(even_num)

# same value
is_same = False
for i in a:
    for j in range(0, len(a), 1):
        if i == a[j]:
            is_same = True
            break

if is_same == True:
    print("Y")
elif is_same == False:
    print("N")

# find max and min
max_value = 0
min_value = 99999999999999
for i in a:
    if i > max_value:
        max_value = i
    if i < min_value:
        min_value = i
print(min_value, max_value)
