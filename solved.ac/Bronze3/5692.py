def factorial(num):
    result = 1
    for i in range(num, 0, -1):
        result *= i

    return result

def main():
    a = input()
    while a != '0':
        result = 0
        length = len(a)
        for i in range(length):
            t_num = length - i
            result += int(a[i]) * factorial(t_num)
        print(result)
        a = input()

if __name__ == "__main__":
    main()
