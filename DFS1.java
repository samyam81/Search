import java.util.Scanner;

public class DFS1 {

    private static Scanner sc = new Scanner(System.in);
    private static int[][] G = new int[10][10];
    private static int[] visited = new int[10];
    private static int N;

    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter the number of vertices?");
        N = sc.nextInt();
        System.out.println("Enter adjacency matrix?");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                G[i][j] = sc.nextInt();
            }
        }

        // Initialize visited array
        for (int k = 0; k < N; k++) {
            visited[k] = 0;
        }

        for (int k = 0; k < N; k++) {
            if (visited[k] == 0) {
                DFS(k);
            }
        }
    }

    private static void DFS(int i) {
        int j;
        System.out.println("\n" + i);
        visited[i] = 1;
        for (j = 0; j < N; j++) {
            if (visited[j] == 0 && G[i][j] == 1) {
                DFS(j);
            }
        }
    }
}
