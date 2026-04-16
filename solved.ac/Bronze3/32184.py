A, B = map(int, input().split())
num_page = B - A

photo_taken = 0
if A % 2 == 0:
    if B % 2 == 0:
        photo_taken += 1
        photo_taken += num_page / 2
    else:
        photo_taken += 2
        photo_taken += num_page / 2
else:
    if B % 2 == 0:
        photo_taken += (num_page  + 1)/ 2
    else:
        photo_taken += 1
        photo_taken += num_page / 2
    if B - A == 1:
        photo_taken = 1



print(int(photo_taken))
