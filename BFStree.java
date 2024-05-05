import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFStree {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {
                    Integer node = q.poll();
                    bfs.add(node);

                    for (Integer neighbor : adj.get(node)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            q.add(neighbor);
                        }
                    }
                }
            }
        }
        return bfs;
    }
}
