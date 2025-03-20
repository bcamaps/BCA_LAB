from collections import defaultdict

class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def add_edge(self, u, v):
        self.graph[u].append(v)

    def dfs(self, start, visited):
        visited.add(start)
        print(start, end=' ')
        
        for neighbor in self.graph[start]:
            if neighbor not in visited:
                self.dfs(neighbor, visited)

if __name__ == "__main__":
    g = Graph()
    n = int(input("Enter number of nodes: "))
    m = int(input("Enter number of edges: "))
    print("Enter the edges: ")
    for _ in range(m):
        a, b = map(int, input().split())
        g.add_edge(a, b)
    
    start = int(input("Enter the starting node for DFS: "))
    visited = set()
    g.dfs(start, visited)


'''
OUTPUT:
Enter number of nodes: 5
Enter number of edges: 6
Enter the edges: 
1 2
1 3
2 4
2 5
3 5
4 5
Enter the starting node for DFS: 1
1 2 4 5 3

Execution Steps:

Graph Representation:
1: [2, 3]
2: [4, 5]
3: [5]
4: [5]
5: []

DFS Starting from Node 1:
Start with visited = {}.
Visit 1: Print 1, add to visited.
Visit 2: Print 2, add to visited.
Visit 4: Print 4, add to visited.
Visit 5: Print 5, add to visited.
Backtrack to 3: Print 3, add to visited.

'''