public class IntAndDouble {
    public static void main(String[] args) {
        
    }

    static int sum(int n) {
        return n * (n + 1) / 2; 
    }

    static double fibonacci(double index) {
        return (Math.pow((1 + Math.sqrt(5)), index) - Math.pow((1 - Math.sqrt(5)), index))/ (Math.pow(2, index) * Math.sqrt(5));
    }
}