package Week1;

public class TestAl {
    public static void main(String[] args) {
        QuickFindUF qf = new QuickFindUF(10);
        qf.union(1, 3);
        qf.union(3, 2);
        System.out.println(qf.connected(1, 3));
        System.out.println(qf.toString());

        QuickUnionUF qu = new QuickUnionUF(10);

    }
}
