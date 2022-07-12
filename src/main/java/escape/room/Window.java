package escape.room;

public class Window {
    private boolean isOpen = false;

    public Window() {
        if (isOpen) isOpen = false;
        else isOpen = true;
    }
    public void useWindow() {
        if (isOpen) isOpen = false;
        else isOpen = true;
        System.out.println("Window is open: " + isOpen);
    }

}
