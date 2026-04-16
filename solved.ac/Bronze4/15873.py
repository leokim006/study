def main():
    num = input()
    length = len(num)
    if length == 2:
        print(int(num[0]) + int(num[1]))
    elif length == 3:
        if num[1] == '0':
            print(int(num[0:2]) + int(num[2]))
        else:
            print(int(num[0]) + int(num[1:]))
    elif length == 4:
        print(20)
        
if __name__ == "__main__":
    main()
