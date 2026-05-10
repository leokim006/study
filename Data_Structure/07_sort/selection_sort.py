def selection_sort(arr):
    for i in range(len(arr)):
        minimum = float("inf")
        for j in range(i, len(arr)):
            if arr[j] < minimum:
                minimum = arr[j]
                min_ind = j
        arr[i], arr[min_ind] = arr[min_ind], arr[i]


def main():
    arr = [99, 34, 55, 7, 82, 21, 9, 10, 3, 46]
    selection_sort(arr)
    print(arr)

if __name__ == "__main__":
    main()

