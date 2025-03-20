def find_subset(S, d):
    def backtrack(index, current_sum, current_subset):
        # If the current sum matches the desired sum, save the subset
        if current_sum == d:
            subsets.append(current_subset[:])
            return
        # If the current sum exceeds the desired sum or we've considered all elements
        if current_sum > d or index == len(S):
            return
        # Include the current element
        current_subset.append(S[index])
        backtrack(index + 1, current_sum + S[index], current_subset)
        # Exclude the current element
        current_subset.pop()
        backtrack(index + 1, current_sum, current_subset)

    subsets = []
    backtrack(0, 0, [])
    
    if not subsets:
        print("No solution exists.")
    else:
        print("Solutions:")
        for subset in subsets:
            print(subset)

if __name__ == "__main__":
    S = list(map(int, input("Input the numbers in the set: ").split()))
    d = int(input("Input the sum: "))
    find_subset(S, d)
