def bubble_sort(arr):
    for i in range(len(arr) - 1):
        for j in range(len(arr) - 1 - i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

def main():
    arr = [99, 34, 55, 7, 82, 21, 9, 10, 3, 46]
    bubble_sort(arr)
    print(arr)

if __name__ == "__main__":
    main()
