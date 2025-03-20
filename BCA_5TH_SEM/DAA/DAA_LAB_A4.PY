import time
import random

def partition(arr,low,high):
    pivot = arr[high]
    i = low - 1
    for j in range (low,high):
        if arr[j] <= pivot:
            i += 1
        arr[i],arr[j] = arr[j],arr[i]
    arr[i+1],arr[high] = arr[high],arr[i+1]
    return i+1

def quickSort(arr,low,high):
    if low >= high:
        return
    pi = partition(arr,low,high)
    quickSort(arr,low,pi-1)
    quickSort(arr,pi+1,high)
    
def printArray(arr):
    for i in arr:
        print (i,end=" ")
    print()
    
n = int(input("Enter the value of n:"))
arr = [random.randint (0,100001)for i in range (n)]

print("the array before sorting is : ")
printArray(arr)
start_time=time.time()
quickSort(arr,0,n-1)
end_time=time.time()
print("the sorted array is: ")
printArray(arr)
time_takem=end_time-start_time
print("the time taken to sort the array is: ",time_takem, "seconds")


'''
OUTPUT:

The array before sorting is:
43234 12830 8099 5423 67456 30295 20123 4321 90120 12345
The sorted array is:
4321 5423 8099 12345 12830 20123 30295 43234 67456 90120
The time taken to sort the array is:  1.9550323486328125e-05 seconds

Process:
Generated array (example): [43234, 12830, 8099, 5423, 67456, 30295, 20123, 4321, 90120, 12345]
Partitioning and Recursive Sorting:
Partition the array around the pivot.
Sort the left and right subarrays recursively.
Continue until the entire array is sorted.
Sorted Array: [4321, 5423, 8099, 12345, 12830, 20123, 30295, 43234, 67456, 90120]

'''