
// Java Program to demonstrate adjacency list 
// representation of graphs
import java.util.*;
import java.util.LinkedList;
 
public class DfsBfs 
{
    // A user define class to represent a graph.
    // A graph is an array of adjacency lists.
    // Size of array will be V (number of vertices 
    // in graph)
    static class Graph
    {
        int V;
        LinkedList<Integer> adjListArray[];
         
        // constructor 
        Graph(int V)
        {
            this.V = V;
             
            // define the size of array as 
            // number of vertices
            adjListArray = new LinkedList[V];
             
            // Create a new list for each vertex
            // such that adjacent nodes can be stored
            for(int i = 0; i < V ; i++){
                adjListArray[i] = new LinkedList<>();
            }
        }
    }
     
    // Adds an edge to an undirected graph
    static void addEdge(Graph graph, int src, int dest)
    {
        // Add an edge from src to dest. 
        graph.adjListArray[src].addFirst(dest);
         
        // Since graph is undirected, add an edge from dest
        // to src also
        graph.adjListArray[dest].addFirst(src);
    }
      
    // A utility function to print the adjacency list 
    // representation of graph
    static void printGraph(Graph graph)
    {       
        for(int v = 0; v < graph.V; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
			
            for(Integer pCrawl: graph.adjListArray[v]){
                System.out.print(" -> "+pCrawl);
				
            }
            System.out.println("\n");
        }
    }
      
    // Driver program to test above functions
    public static void main(String args[])
    {
        // create the graph given in above figure
		
		Scanner scanner = new Scanner(System.in);
		
        int V = scanner.nextInt();
		for(int i=0; i<v; i++){
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			Graph graph = new Graph(V);
			addEdge(graph, a, b);

		  
			// print the adjacency list representation of 
			// the above graph
		}
        printGraph(graph);
    }
}
// This code is contributed by Sumit Ghosh