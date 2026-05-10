def insertion_sort(arr):
    for i in range(1, len(arr)):
        j = i
        temp = arr[j]
        while j > 0 and temp < arr[j - 1]:
            arr[j] = arr[j - 1]
            j -= 1
        arr[j] = temp

def main():
    arr = [99, 34, 55, 7, 82, 21, 9, 10, 3, 46]
    insertion_sort(arr)
    print(arr)

if __name__ == "__main__":
    main()
