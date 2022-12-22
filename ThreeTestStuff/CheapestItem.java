package ThreeTestStuff;
import ThreeTestStuff.Pair;

public class CheapestItem {
    public static void main(String[] args) {
        Pair[] priceIndex = new Pair[4];
        priceIndex[0] = new Pair("apple", 5);
        priceIndex[1] = new Pair("banana", 10);
        priceIndex[2] = new Pair("watermelon", 30);
        priceIndex[3] = new Pair("tomato", 50);

        Pair watermelonJohnBought = new Pair("watermelon", 31);
            System.out.println(isCheaper(priceIndex, watermelonJohnBought)); // true;
        
            Pair tomatoJohnBought = new Pair("tomato", 40);
            System.out.println(isCheaper(priceIndex, tomatoJohnBought)); //false
        
            Pair appleJohnBought = new Pair("apple", 5);
            System.out.println(isCheaper(priceIndex, appleJohnBought)); //false
        
    }

    public static boolean isCheaper(Pair[] priceIndex, Pair item) {
        for (Pair i : priceIndex) {
            if (item.getKey().equals(i.getKey()) && item.getValue() > i.getValue()) {
                return true;
            }
        }
        return false;
    }
}
