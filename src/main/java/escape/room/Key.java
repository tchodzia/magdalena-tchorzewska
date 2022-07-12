package escape.room;

public class Key {
    private boolean usedKey = false;
    public Key() {
        usedKey = false;
    }
    public void getKey() {
        if (!usedKey) usedKey = true;
        System.out.println("Key is used: " + usedKey);
    }
    public boolean checkKey() {
        return usedKey;
    }
}
