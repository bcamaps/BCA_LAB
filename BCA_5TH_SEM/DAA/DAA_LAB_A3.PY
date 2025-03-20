import time
def merge(arr,left,mid,right):
    n1 = mid - left + 1
    n2 = right-mid
    L = [0] * n1
    R = [0] * n2
    for i in range(n1):
         L[i] = arr [left + i]

    for j in range(n2):
        R[j] = arr[mid + 1 + j]

    i = 0  
    j = 0  
    k = left  

    while i < n1 and j < n2:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1
    while i < n1:
        arr[k] = L[i]
        i += 1
        k += 1
    while j < n2:
        arr[k] = R[j]
        j += 1
        k += 1
def merge_sort(arr,left,right):
    if left >= right:
        return
    mid = (left + right)//2
    merge_sort(arr, left, mid)
    merge_sort(arr, mid + 1, right)
    merge(arr, left, mid, right)

import random
n = int(input("Enter the value of n: "))
arr = [random.randint(0, 10000) for _ in range(n)]

print("The array before sorting is:")
print(arr)

start_time = time.time()
merge_sort(arr, 0, n - 1)
end_time = time.time()

print("The sorted array is:")
print(arr)
print("The time taken to sort the array is:", end_time - start_time, "seconds")


'''
OUTPUT:

Enter the value of n: 10
The array before sorting is:
[2528, 6031, 6957, 3498, 5336, 5157, 9144, 2573, 1372, 5566]
The sorted array is:
[1372, 2528, 2573, 3498, 5157, 5336, 5566, 6031, 6957, 9144]
The time taken to sort the array is: 2.1696090698242188e-05 seconds

Process:
Generated array (example): [5482, 3592, 6782, 1005, 9703, 1509, 4573, 8790, 1473, 4621]
Recursive Splits:
Divide into halves until each subarray contains 1 element.
Merge Steps:
Merge [1005] and [3592] → [1005, 3592]
Merge [5482] and [6782] → [5482, 6782]
Continue merging and sorting in ascending order.
Sorted Array: [1005, 1473, 1509, 3592, 4573, 4621, 5482, 6782, 8790, 9703]

'''