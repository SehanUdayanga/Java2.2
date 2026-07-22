import java.util.*;

class Revers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int x = size - 1; x >= 0; x--) {
            arr[x] = sc.nextInt();
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}