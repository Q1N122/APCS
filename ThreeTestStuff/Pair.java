package ThreeTestStuff;
public class Pair {
    private String key;
    private int value;
    
    Pair(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "key: " + key + " value: " + value;
    }
}
