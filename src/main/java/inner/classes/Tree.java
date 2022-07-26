package inner.classes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Tree {
    public static void main(String[] args) {
        List<Tree> forest = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            forest.add(i, new Tree());
        }
        forest.add(new Tree(){
            public void display() {
                System.out.println("Magiczne drzewo!");
            }
        });

        Collections.shuffle(forest);

        for (Tree tree : forest) {
            tree.display();
        }

    }

    public void display() {
        System.out.println("Zwykłe drzewo...");
    }
}
