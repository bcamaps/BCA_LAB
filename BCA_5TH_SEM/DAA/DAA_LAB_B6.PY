import itertools

def total_distance(tour, distances):
    distance = 0
    n = len(tour)
    for i in range(n):
        distance += distances[tour[i]][tour[(i + 1) % n]] 
    return distance

def tsp_bruteforce(distances):
    num_cities = len(distances)  
    cities = list(range(num_cities))  
    shortest_tour = None
    shortest_distance = float('inf')
    
    for tour in itertools.permutations(cities):  
        distance = total_distance(tour, distances)
        if distance < shortest_distance:
            shortest_distance = distance
            shortest_tour = tour

    return shortest_tour, shortest_distance

num_cities = int(input("Enter the number of cities: "))  
distances = []

print("Enter the distance between cities:")
for i in range(num_cities):
    row = list(map(int, input().split()))  
    distances.append(row)

shortest_tour, shortest_distance = tsp_bruteforce(distances)
print("Shortest TSP Tour:", shortest_tour)
print("Shortest TSP Tour:", shortest_distance)
