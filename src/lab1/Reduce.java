package lab1;

public class Reduce {
    public static void main(String[] args) {
        int count = reduce(100);
        System.out.println(count);
    }

    public static int reduce(int n) {
        int count = 0;
        while (n != 0) {
            boolean even = n % 2 == 0;

            if (even) n /= 2;
            else n -= 1;
            count++;
        }
        return count;
    }
}
