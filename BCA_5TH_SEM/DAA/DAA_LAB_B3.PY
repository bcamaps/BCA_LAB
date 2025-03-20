import sys
def dijkstra(graph,start):
    vertices = set(graph.keys())
    dist = {vertex: float('infinity')for vertex in vertices}
    dist[start]=0
    visited = set()
    while vertices:
        min_vertex = None
        for vertex in vertices:
            if min_vertex is None:
                min_vertex = vertex
            elif dist[vertex] < dist[min_vertex]:
                min_vertex = vertex
        if dist[min_vertex] == float('infinity'):
            break
        vertices.remove(min_vertex)
        current_weight = dist[min_vertex]
        for neighbor, weight in graph[min_vertex].items():
            weight_sum = current_weight + weight
            if weight_sum < dist[neighbor]:
                dist[neighbor]= weight_sum
    return dist
def main():
    graph = {}
    num_vertices = int(input("Enter the number of vertices: "))
    for i in range(num_vertices):
        vertex_name = input(f"Enter the name of vertex {i + 1}: ")
        graph[vertex_name]={}
    num_edges = int(input("Enter the number of edges: "))
    for _ in range(num_edges):
        start_vertex = input("Enter the starting vertex: ")
        end_vertex = input("Enter the ending vertex: ")
        weight = float(input("Enter the weight: "))
        graph[start_vertex][end_vertex] = weight
    start_node = input("Enter the starting node: ")
    if start_node not in graph:
        print("Invalid stating node.")
        sys.exit(1)
    shortest_distances = dijkstra(graph, start_node)
    for vertex, distance in shortest_distances.items():
        print(f"Shortest distance from {start_node} to {vertex}: {distance}")
if __name__ == "__main__":
        main()

        