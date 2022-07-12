package escape.room;

public class Door {
    private boolean isOpen = false;

    public Door () {

    }

    public void useDoor(Key key) {
        if (key.checkKey()){
            isOpen = true;
        } else isOpen = false;
        System.out.println("Door is open: " + isOpen);
    }
}
