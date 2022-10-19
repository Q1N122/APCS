public class OneTestSample {
    public static void main(String[] args) {
        System.out.println(divisibleByTwo(1.3));
        System.out.println(divisibleByTwo(-15.4));
        System.out.println(divisibleByTwo(0.0));
        System.out.println(divisibleByTwo(12.2));
    }
    
    static boolean divisibleByTwo(double x) {
        System.out.println(x%2);
        System.out.println((int) x % 2);
        return (int) x % 2 == 0;
    } 
}