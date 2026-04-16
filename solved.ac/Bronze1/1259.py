num = input()

while num != '0':
    is_FDN = True
    for i in range(int(len(num) / 2)):
        if num[i] != num[-(i + 1)]:
            is_FDN = False
    if is_FDN == True:
        print("yes")
    elif is_FDN == False:
        print("no")
    num = input()
