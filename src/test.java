public class test {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = a;
        b[1] = 3;

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
