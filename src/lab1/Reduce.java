package lab1;

public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        while (n != 0) {
            boolean even = n % 2 == 0;

            if (even) n /= 2;
            else n -= 1;
            count++;
        }
        System.out.println(count);
    }
}
