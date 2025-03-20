def knapsack(values, weights, capacity, n):
    # Base case: no items left or no capacity
    if n == 0 or capacity == 0:
        return 0
    
    # If the weight of the nth item is more than the capacity, skip it
    if weights[n - 1] > capacity:
        return knapsack(values, weights, capacity, n - 1)
    
    # Return the maximum of including the nth item or excluding it
    return max(
        values[n - 1] + knapsack(values, weights, capacity - weights[n - 1], n - 1),
        knapsack(values, weights, capacity, n - 1)
    )

if __name__ == "__main__":
    values = list(map(int, input("Enter values of items: ").split()))
    weights = list(map(int, input("Enter weights of items: ").split()))
    capacity = int(input("Enter Knapsack capacity: "))
    n = len(values)
    max_value = knapsack(values, weights, capacity, n)
    print("Maximum value:", max_value)
