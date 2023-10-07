package WyjątkiZadania;

import java.io.StringWriter;

public class WyjątekWlasny extends Exception{

    public WyjątekWlasny(){
        super("nie wolno dzielić przez zero!");
    }

}
