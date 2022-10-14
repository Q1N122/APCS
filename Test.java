public class Test {
    public static void main(String[] args) {
        
        System.out.println((int) 2.7 == 3);
        System.out.println((int) 2.7 + 0.5);
    }

    private static int dp(int displacement, int file, int rank) {
        int result = file * 6 + rank + displacement;
        if (result < 0 || result > 29) {
            return -1; 
        }
        else {
            return result;
        }
    }
}