package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileConnection {

    private boolean connected = false;

    public void connect() throws FileConnectionException {
        Random random = new Random();
        double randomPercent = random.nextDouble(); // 0.0 / 1.0     ---- 0.2434354343
        if (randomPercent < 0.25) {
            throw new FileConnectionException();
        }
        connected = true;
    }

    @Override
    public String toString() {
        return "FileConnection{" +
                "connected=" + connected +
                '}';
    }


}