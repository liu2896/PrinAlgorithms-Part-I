package Week1;

import java.util.Arrays;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        System.out.println("a");
        for (int i = 0; i < id.length; i++) {
            if (id[i] == id[p]) {
                id[i] = id[q];
            }
        }

    }

    @Override
    public String toString() {
        return "QuickFindUF{" +
                "id=" + Arrays.toString(id) +
                '}';
    }
}

