from collections import defaultdict

class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def add_edge(self, u, v):
        self.graph[u].append(v)

    def bfs(self, start):
        visited = []
        queue = []

        queue.append(start)
        visited.append(start)

        while queue:
            node = queue.pop(0)
            print(node, end=" ")

            for neighbor in self.graph[node]:
                if neighbor not in visited:
                    queue.append(neighbor)
                    visited.append(neighbor)

if __name__ == "__main__":
    g = Graph()
    n = int(input("Enter number of nodes: "))
    m = int(input("Enter number of edges: "))
    print("Enter the edges: ")
    for _ in range(m):
        a, b = map(int, input().split())
        g.add_edge(a, b)
    start = int(input("Enter the starting node for BFS: "))
    g.bfs(start)


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
Enter the starting node for BFS: 1
1 2 3 4 5

Execution Steps:

Graph representation after adding edges:
1: [2, 3]
2: [4, 5]
3: [5]
4: [5]
5: []

BFS starting from node 1:
Start with queue = [1], visited = [1].
Process 1: Print 1, add neighbors 2, 3 to queue and visited.
Process 2: Print 2, add neighbors 4, 5.
Process 3: Print 3 (skip 5 since it's already visited).
Process 4: Print 4.
Process 5: Print 5.
'''