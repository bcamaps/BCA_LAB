def find_min_max(arr, low, high):
    if low == high:
        return arr[low], arr[low]
    
    if high - low == 1:
        if arr[low] < arr[high]:
            return arr[low], arr[high]
        else:
            return arr[high], arr[low]
    
    mid = (low + high) // 2
    min1, max1 = find_min_max(arr, low, mid)
    min2, max2 = find_min_max(arr, mid + 1, high)
    
    return min(min1, min2), max(max1, max2)

n = int(input("Enter the number of elements: "))
arr = []
for i in range(n):
    num = int(input(f"Enter element {i+1}: "))
    arr.append(num)

print("Array:", arr)

min_val, max_val = find_min_max(arr, 0, n - 1)
print(f"Minimum value: {min_val}")
print(f"Maximum value: {max_val}")


'''
OUTPUT:

Enter the number of elements: 6
Enter element 1: 3
Enter element 2: 7
Enter element 3: 2
Enter element 4: 9
Enter element 5: 1
Enter element 6: 5
Array: [3, 7, 2, 9, 1, 5]
Minimum value: 1
Maximum value: 9

Process:
Array: [3, 7, 2, 9, 1, 5]
Recursion splits the array into halves:
[3, 7, 2]
Further split into [3, 7] and [2]
Minimum = 2, Maximum = 7
[9, 1, 5]
Further split into [9, 1] and [5]
Minimum = 1, Maximum = 9
Combine results:
Overall minimum = min(2, 1) = 1
Overall maximum = max(7, 9) = 9
'''