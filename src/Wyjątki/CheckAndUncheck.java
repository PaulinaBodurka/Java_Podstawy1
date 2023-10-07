package Wyjątki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckAndUncheck {
    public static void main(String[] args) {
        File file = new File("lokalizacja_pliku/plik.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
