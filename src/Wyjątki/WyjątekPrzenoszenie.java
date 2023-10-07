package Wyjątki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class WyjątekPrzenoszenie {

    public void wyjatkowaMetoda(){
        try { File file = new File("plik.txt");
            InputStream inputStream =new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
