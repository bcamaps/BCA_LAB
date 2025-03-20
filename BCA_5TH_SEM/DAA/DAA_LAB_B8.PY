class DisjointSet:
    def __init__(self, vertices):
        self.parent = {vertex: vertex for vertex in vertices}
        self.rank = {vertex: 0 for vertex in vertices}

    def find(self, vertex):
        if self.parent[vertex] != vertex:
            self.parent[vertex] = self.find(self.parent[vertex])
        return self.parent[vertex]

    def union(self, vertex1, vertex2):
        root1 = self.find(vertex1)
        root2 = self.find(vertex2)

        if root1 != root2:
            if self.rank[root1] > self.rank[root2]:
                self.parent[root2] = root1
            else:
                self.parent[root1] = root2
                if self.rank[root1] == self.rank[root2]:
                    self.rank[root2] += 1


def kruskal(graph):
    vertices = set(graph.keys())
    edges = []
    for start_vertex, connections in graph.items():
        for end_vertex, weight in connections.items():
            edges.append((weight, start_vertex, end_vertex))
    edges.sort()

    minimum_spanning_tree = {}
    total_cost = 0
    disjoint_set = DisjointSet(vertices)

    for weight, start_vertex, end_vertex in edges:
        if disjoint_set.find(start_vertex) != disjoint_set.find(end_vertex):
            if start_vertex not in minimum_spanning_tree:
                minimum_spanning_tree[start_vertex] = {}
            if end_vertex not in minimum_spanning_tree:
                minimum_spanning_tree[end_vertex] = {}

            minimum_spanning_tree[start_vertex][end_vertex] = weight
            minimum_spanning_tree[end_vertex][start_vertex] = weight
            total_cost += weight
            disjoint_set.union(start_vertex, end_vertex)

    return minimum_spanning_tree, total_cost


def main():
    graph = {}
    num_vertices = int(input("Enter the number of vertices: "))
    for i in range(num_vertices):
        vertex_name = input(f"Enter the name of vertex {i + 1}: ")
        graph[vertex_name] = {}

    num_edges = int(input("Enter the number of edges: "))
    for _ in range(num_edges):
        start_vertex = input("Enter the starting vertex: ")
        end_vertex = input("Enter the ending vertex: ")
        weight = float(input("Enter the weight: "))
        graph[start_vertex][end_vertex] = weight
        graph[end_vertex][start_vertex] = weight  # Assuming an undirected graph

    minimum_spanning_tree, total_cost = kruskal(graph)
    print("Minimum Cost Spanning Tree:")

    printed_edges = set()
    for vertex, connections in minimum_spanning_tree.items():
        for neighbor, cost in connections.items():
            if (neighbor, vertex) not in printed_edges:
                print(f"Edge: {vertex} -- {neighbor}, Cost: {cost}")
                printed_edges.add((vertex, neighbor))

    print("Total Cost of Minimum Spanning Tree:", total_cost)


if __name__ == "__main__":
    main()
