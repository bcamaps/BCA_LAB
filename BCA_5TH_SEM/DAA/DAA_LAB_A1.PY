def selection_sort(array):
    for i in range(0, len(array) - 1):
        smallest = i
        for j in range(i + 1, len(array)):
            if array[j] < array[smallest]:
                smallest = j
        array[i], array[smallest] = array[smallest], array[i]

array = input('Enter the list of numbers: ').split()
array = [int(x) for x in array]

selection_sort(array)

print('List after sorting is:', array)
  
'''
OUTPUT:

Enter the list of numbers: 64 34 25 12 22 11 90
List after sorting is: [11, 12, 22, 25, 34, 64, 90]


Execution:
The program sorts the list step by step:
Initial: [64, 34, 25, 12, 22, 11, 90]
After 1st iteration: [11, 34, 25, 12, 22, 64, 90]
After 2nd iteration: [11, 12, 25, 34, 22, 64, 90]
After 3rd iteration: [11, 12, 22, 34, 25, 64, 90]
After 4th iteration: [11, 12, 22, 25, 34, 64, 90]
After 5th iteration: [11, 12, 22, 25, 34, 64, 90]
Final result remains unchanged.
'''
