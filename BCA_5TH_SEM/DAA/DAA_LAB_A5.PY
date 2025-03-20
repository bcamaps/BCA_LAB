def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

n = int(input("Enter the number of elements: "))
print("Enter the elements: ")
arr = list(map(int, input().split()))
print("The unsorted list is:")
print(arr)
insertion_sort(arr)
print("The sorted list is:")
print(arr)


'''
OUTPUT:

Enter the number of elements: 6
Enter the elements: 
64 34 25 12 22 11
The unsorted list is:
[64, 34, 25, 12, 22, 11]
The sorted list is:
[11, 12, 22, 25, 34, 64]

Process:

Start with the second element 34 (key):
Compare with 64 → shift 64 → insert 34.
Array becomes [34, 64, 25, 12, 22, 11].

Process 25 (key):
Compare with 64 → shift 64.
Compare with 34 → shift 34.
Insert 25.
Array becomes [25, 34, 64, 12, 22, 11].

Continue for all elements until the array is sorted.


'''