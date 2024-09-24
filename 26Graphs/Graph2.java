import java.util.*;
import java.util.LinkedList;

public class Graph2 {
    
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
        }

        static void createGraph(ArrayList <Edge> graph[]){
            for (int i = 0; i <  graph.length; i++) {
                graph[i] = new ArrayList<>();
            }

            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));


            graph[1].add(new Edge(1,0,1));
            graph[1].add(new Edge(1,3,1));

            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));

            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));

            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));
            graph[4].add(new Edge(4, 5, 1));

            graph[5].add(new Edge(5, 3, 1));
            graph[5].add(new Edge(5, 4, 1));
            graph[5].add(new Edge(5, 6, 1));

            graph[6].add(new Edge(6, 5, 1));


        }

        // ! Breadth First Search (BFS)

        public static void bfs (ArrayList<Edge>[] graph ){ //0(n) or 0(E+V)

            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            boolean visit [] = new boolean[graph.length];

            while (!q.isEmpty()) {
                int curr = q.remove();
                if (!visit[curr]) {
                    System.out.print(curr +" ");
                    visit[curr] = true;
                    for (int i = 0; i < graph[curr].size(); i++) {
                        Edge e =graph[curr].get(i);
                        q.add(e.dest);

                    }
                }
            }
        }

        // ! Deapth First Search
        public static void dfs (ArrayList<Edge> [] graph , int curr , boolean vis[]){
            System.out.print(curr +" ");
            vis[curr]= true;

            for (int i = 0; i < graph[curr].size(); i++) {
                
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    dfs(graph, e.dest, vis);
 
                }
            }
        }


        public static boolean hasPath(ArrayList<Edge> graph [] , int src , int dest , boolean vis[]){  // 0(V+E )
            if (src == dest) {
                return true;
            }
 
            vis[src] = true;

            for (int i = 0; i < graph[src].size(); i++) {
                Edge e = graph[src].get(i);

                //e.dest = neighbour
                if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis) ) {
                    return true;
                }
            }

return false;

        }


    public static void main(String[] args) {
        
    //   1 ----- 3
    //  /        | \
    // 0         |  5 -- 6
    //  \        | /
    //   2 ----- 4


    int V=7;
    ArrayList<Edge> graph [] = new ArrayList[V];
    createGraph(graph);
    bfs(graph);

    System.out.println();
    dfs(graph, 0, new boolean[V]);

    System.out.println();

    System.err.println(hasPath(graph, 0, 7, new boolean[V]));

    }
}
