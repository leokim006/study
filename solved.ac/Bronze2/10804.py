def reversed(arr, a, b):
    new_arr = []
    for i in range(b - 1, a - 2, -1):
        new_arr.append(arr[i])
    del arr[a - 1:b]
    return new_arr

def inserted(arr1, arr2, a, b):
    i = a - 1
    for j in arr2:
        arr1.insert(i, j)
        i += 1

def main():
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    for _ in range(10):
        a, b = map(int, input().split())
        temp = reversed(arr, a, b)
        inserted(arr, temp, a, b)
    for i in arr:
        print(i, end = " ")

if __name__ == "__main__":
    main()
