import sys

def prim(graph):
    vertices = set(graph.keys())  
    start_vertex = vertices.pop()  
    minimum_spanning_tree = {start_vertex: {}}
    total_cost = 0
    
    while vertices:
        edge = None
        min_cost = float('inf')
        
        for vertex in minimum_spanning_tree:
            for neighbor, cost in graph[vertex].items():
                if neighbor in vertices and cost < min_cost:
                    edge = (vertex, neighbor)
                    min_cost = cost
        
        if edge:
            vertex1, vertex2 = edge
            vertices.remove(vertex2)  
            minimum_spanning_tree[vertex1][vertex2] = min_cost
            minimum_spanning_tree[vertex2] = {vertex1: min_cost}
            total_cost += min_cost
    
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
        graph[end_vertex][start_vertex] = weight
    
    minimum_spanning_tree, total_cost = prim(graph)
    
    print("Minimum Cost Spanning Tree:")
    m = []  

    for vertex, connections in minimum_spanning_tree.items():
        for neighbor, cost in connections.items():
            if (neighbor, vertex) not in m:
                print(f"Edge: {vertex} -- {neighbor}, Cost: {cost}")
                m.append((vertex, neighbor))
    
    print("Total Cost of Minimum Spanning Tree:", total_cost)

if __name__ == "__main__":
    main()
